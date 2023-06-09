package watchAndstatus;

import java.util.ArrayList;
import java.util.List;

public class Salesperson {
    private List<Observer> observers = new ArrayList<>();
    public void attach(ConcreteManager manager) {
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    // 售出房子时通知观察者更新消息
    public void sellHouse(String houseInfo) {
        notifyObservers(houseInfo);
    }
    public void attach(Observer observer) {
        // TODO Auto-generated method stub
    }
}
