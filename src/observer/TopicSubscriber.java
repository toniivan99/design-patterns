package observer;

public class TopicSubscriber implements Observer {
    private String name;
    private Observable topic;

    public TopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (topic == null) {
            System.out.println(getName() + " has no topic");
            return;
        }
        String latestTopic = this.topic.getUpdate();
        System.out.println(getName() + " received an update " + latestTopic);
    }

    @Override
    public void setTopic(Observable topic) {
        this.topic = topic;
    }

    public String getName() {
        return name;
    }
}
