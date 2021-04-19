package observer;

public class MainClass {
    public static void main(String[] args) {
        Observer observer1 = new TopicSubscriber("Subscriber 1");
        Observer observer2 = new TopicSubscriber("Subscriber 2");
        Observer observer3 = new TopicSubscriber("Subscriber 3");

        Topic topic = new Topic();
        topic.subscribe(observer1);
        topic.subscribe(observer2);
        topic.subscribe(observer3);

        topic.setTopic("First message...");
        topic.setTopic("Second message...");
    }
}
