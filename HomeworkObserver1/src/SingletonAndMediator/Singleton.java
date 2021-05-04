package SingletonAndMediator;

import java.util.List;

public class Singleton {

		private static Singleton chatBot;

	    private Singleton(){

	    }

	    public static Singleton addBot(){

	        if(chatBot == null)
	            chatBot = new Singleton();

	        System.out.println("ChatBot  added succesfully");
	        return chatBot;
	    }

	    public static boolean checkForForbiddenWords(List<String> words){
	        if(chatBot == null)
	            return false;

	        for (String word : words) {
	            if(word.equals("cat"))
	                return true;
	        }

	        return false;
	    }
	

}
