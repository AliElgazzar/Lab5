package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.CDWindow;

/**
 * Rules:
 *  1. All fields must be nonempty
 *  2. Price must be a floating point number with two decimal places
 *  3. Price must be a number greater than 0.49.
 */
public class CDRuleSet implements RuleSet {

	CDWindow cdWin;

	@Override
	public void applyRules(Component ob) throws RuleException {
		cdWin = (CDWindow) ob;
		validateNonEmptyFields();
		validatePrice();
	}

	private void validateNonEmptyFields() throws RuleException {
		if (cdWin.getArtistValue().trim().isEmpty() ||
			cdWin.getPriceValue().trim().isEmpty() ||
			cdWin.getTitleValue().trim().isEmpty()) {
			throw new RuleException("All fields must be nonempty.");
		}
	}

	private void validatePrice() throws RuleException {
		String priceValue = cdWin.getPriceValue().trim();

		// Check if it matches the format of a floating-point number with two decimal places
		if (!priceValue.matches("\\d+\\.\\d{2}")) {
			throw new RuleException("Price must be a floating point number with exactly two decimal places.");
		}

		try {
			double price = Double.parseDouble(priceValue);

			// Check if price is greater than 0.49
			if (price <= 0.49) {
				throw new RuleException("Price must be greater than 0.49.");
			}
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a valid floating-point number.");
		}
	}
}
