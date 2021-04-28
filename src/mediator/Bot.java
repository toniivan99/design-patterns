package mediator;

public class Bot {
    private static Bot instance;

    private Bot() {
    }

    public static Bot getInstance() {
        if (instance == null) {
            instance = new Bot();
        }

        return instance;
    }

    public boolean hasForbiddenWord(String message, User user, MessageMediator messageMediator) {
        if (message.equals("cat")) {
            messageMediator.removeUser(user);
            messageMediator.sendMessage("Forbidden word detected: 'cat'");
            return true;
        }
        return false;
    }
}
