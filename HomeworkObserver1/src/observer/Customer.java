package observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Observable {
	
	private List<Observer>books;
	private String customerName;
	

	public Customer() {
		this.books = new ArrayList<>();
	}

	@Override
	public void rentBook(Observer book) {
		this.books.add(book);
		book.setCustomer(this);

	}

	@Override
	public void returnBook(Observer book) {
		this.books.remove(book);
	}

	@Override
	public void NotifyBooks() {
		for(Observer book: this.books) {
			book.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
		this.NotifyBooks();
	}

}
