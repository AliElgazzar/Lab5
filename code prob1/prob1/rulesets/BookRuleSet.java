package lesson5.labs.prob1.rulesets;

import java.awt.Component;

import lesson5.labs.prob1.gui.BookWindow;

/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of eithe r 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two de cima    l places
 * 6. Price must be a number greater than 0.49.
 */
public class BookRuleSet implements RuleSet {

    private BookWindow bookWin;

    @Override
    public void applyRules(Component ob) throws RuleException {

        bookWin = (BookWindow) ob;
        nonemptyRule();
        IsbnNumericRule();
        IsbLengthRule();
        PriceRule();
    }

    private void nonemptyRule() throws RuleException {

        if (bookWin.getIsbnValue().trim().equals("") ||
            bookWin.getPriceValue().trim().equals("") ||
            bookWin.getTitleValue().trim().equals("")) {
            throw new RuleException("Isbn and Title are required");
        }

    }


    private void IsbnNumericRule() throws RuleException {

        String isbnValue = bookWin.getIsbnValue();

        try {
            Integer.parseInt(isbnValue);
        } catch (NumberFormatException e) {
            throw new RuleException("Isbn is not a valid ISBN number");
        }

    }

    private void IsbLengthRule() throws RuleException {
        if (bookWin.getIsbnValue().length() != 10 || bookWin.getIsbnValue().length() != 13) {
            throw new RuleException("Isbn value must be 10 or 13");
        }

        if (bookWin.getIsbnValue().length() == 10) {
            if (bookWin.getIsbnValue().charAt(0) != '0' || bookWin.getIsbnValue().charAt(1) != '1') {
                throw new RuleException("Isbn first digit must be 0 or 1");
            }
        }

        if (bookWin.getIsbnValue().length() == 13) {
            if (bookWin.getIsbnValue().subSequence(0, 3) != "978" && bookWin.getIsbnValue().subSequence(0, 3) != "979") {
                throw new RuleException("Isbn first 3 digits must be 978 or 979");
            }
        }

    }

    private void PriceRule() throws RuleException {

        String[] CheckPrice = bookWin.getPriceValue().split("\\.");
        if (CheckPrice[1].length() != 2) {
            throw new RuleException("Price must have two decimal places");
        }

        if (Double.parseDouble(bookWin.getPriceValue()) < 0.49) {
            throw new RuleException("Price must be greater than 0.49");
        }
    }
}