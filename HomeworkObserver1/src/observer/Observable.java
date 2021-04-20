package observer;

public interface Observable {
	
	void rentBook(Observer book);
	void returnBook(Observer book);
	
	void NotifyBooks();
	String getUpdate();
}
