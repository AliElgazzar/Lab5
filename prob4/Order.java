package lesson5.labs.prob4;

import jdk.dynalink.beans.StaticClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


 public class Order {
	private LocalDate orderDate;
	private List<Item> items;
	
	//use a factory method
     private Order(LocalDate orderDate, Customer cust) {
		this.orderDate = orderDate;
		items = new ArrayList<Item>();
		cust.SetOrder(this);
	}

	public static Order newOrder(Customer cust, LocalDate date) {
		if(cust == null) throw new NullPointerException("Null customer");
		return new Order(date, cust);

	}
	public void addItem(String name){
		items.add(new Item(name));
	}
	@Override
	public String toString() {
		return orderDate + ": " + 
	              items.toString();
	}
}
