package SingletonAndMediator;

public class ChatUser extends User {

	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {
		System.out.println(this.name + " sends: " + message);
		if(message.equals("addBot")) {
			Singleton.addBot();
		}
		mediator.sendMessage(message, this);

	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);

	}

}
