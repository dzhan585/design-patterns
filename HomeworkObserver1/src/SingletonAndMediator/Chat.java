package SingletonAndMediator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Chat implements MessageMediator {
	
	private List<User> users;

	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);

	}

	@Override
	public void removeUser(User user) {
		 this.users.remove(user);

	}

	@Override
	public void sendMessage(String message, User user) {
		if(Singleton.checkForForbiddenWords(Arrays.stream(message.split(" ")).collect(Collectors.toList()))){
            System.out.println(user.name +
            		" uses the forbidden word ,,cat'' in his message!");
            removeUser(user);
            return;
        }
        this.users.forEach(u -> {
            if(u != user)
                u.receive(message);
        });
	}

}
