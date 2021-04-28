package mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator{
    private List<User> users;
    private Bot bot;

    public Chat() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (message.equals("addBot")) {
            bot = Bot.getInstance();
            return;
        }

        boolean hasForbiddenWords = bot.hasForbiddenWord(message, user, this);
        if (hasForbiddenWords) {
            return;
        }
        for (User usr : users) {
            if (usr == user) {
                continue;
            }

            usr.receiveMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void removeUser(User user) {
        this.users.remove(user);
        user.messageMediator = null;
    }
}
