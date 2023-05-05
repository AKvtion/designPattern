package Appearance;

public class ComputerFacade {
    private Mainframe mainframe;

    public ComputerFacade() {
        mainframe = new Mainframe();
    }

    public boolean start() {
        return mainframe.on();
    }
}
