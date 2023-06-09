package watchAndstatus;

public class ConcreteManager {
    private String name;

    public ConcreteManager(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received the new sales message: " + message);
    }
}
