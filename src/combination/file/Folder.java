package combination.file;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent{
    private String name;
    private List<FileComponent> fileList = new ArrayList<FileComponent>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (FileComponent file : fileList) {
            size += file.getSize();
        }
        return size;
    }

    @Override
    public void display() {
        System.out.println(this.getName() + " (" + this.getSize() + "KB)");
        for (FileComponent file : fileList) {
            file.display();
        }
    }

    public void add(FileComponent file) {
        fileList.add(file);
    }

    public void remove(FileComponent file) {
        fileList.remove(file);
    }
}
