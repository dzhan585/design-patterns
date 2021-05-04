package SingletonAndMediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Pesho");
		User user2 = new ChatUser(chat, "Misho");
		User user3 = new ChatUser(chat, "Katty");
		
		user1.send("addBot");
        user3.send("Hello guys");
        user2.send("Hello all");
        user1.send("cat");

	}

}
