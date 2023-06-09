package watchAndstatus;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSalesperson extends Salesperson{
    // 观察者列表
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    // 售出房子时通知观察者更新消息
    @Override
    public void sellHouse(String houseInfo) {
        notifyObservers(houseInfo);
    }
}
