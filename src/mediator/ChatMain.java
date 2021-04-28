package mediator;

public class ChatMain {
    public static void main(String[] args) {
        MessageMediator chat = new Chat();
        User tony = new ChatUser(chat, "Tony");
        User gosho = new ChatUser(chat, "Gosho");
        User naik = new ChatUser(chat, "Naik");
        tony.sendMessage("addBot");
        gosho.sendMessage("cat");
        naik.sendMessage(":)");
    }
}
