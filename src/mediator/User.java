package mediator;

public abstract class User {
    protected MessageMediator messageMediator;
    protected String name;

    public User(MessageMediator messageMediator, String name) {
        this.messageMediator = messageMediator;
        this.name = name;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
