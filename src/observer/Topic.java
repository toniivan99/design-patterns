package observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Observable {
    private List<Observer> observers;
    private String topic;

    public Topic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setTopic(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:
             observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return topic;
    }

    public void setTopic(String newTopic) {
        topic = newTopic;
        this.notifyObservers();
    }
}
