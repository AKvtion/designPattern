package Appearance;

public class Mainframe {
    private Memory memory;
    private CPU cpu;
    private Harddisk harddisk;
    private OS os;

    public Mainframe() {
        memory = new Memory();
        cpu = new CPU();
        harddisk = new Harddisk();
        os = new OS();
    }

    public boolean on() {
        if (!memory.check()) {
            return false;
        }
        if (!cpu.run()) {
            return false;
        }
        if (!harddisk.read()) {
            return false;
        }
        if (!os.load()) {
            return false;
        }
        return true;
    }
}
