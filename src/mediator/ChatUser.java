package mediator;

public class ChatUser extends User {
    public ChatUser(MessageMediator messageMediator, String name) {
        super(messageMediator, name);
        messageMediator.addUser(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " - " + message);
        this.messageMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}
