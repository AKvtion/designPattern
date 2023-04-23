package combination.file;

public class File implements FileComponent{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " (" + this.getSize() + "KB)");
    }
}
