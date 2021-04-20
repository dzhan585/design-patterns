package observer;

public class RentBook {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Book book1 = new Book("The mirror and the light");
		Book book2 = new Book("Hamnet");
		Book book3 = new Book("The Glass Hotel");
		
		customer.rentBook(book1);
		customer.rentBook(book2);
		customer.rentBook(book3);
		
		customer.setCustomerName("Petar");
		customer.setCustomerName("Iliyka");
		customer.setCustomerName("Ivana");
	}

}
