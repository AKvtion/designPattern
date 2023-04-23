package combination.file;

public class Client {
    public static void main(String[] args) {
        // 创建文件和文件夹
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.jpeg", 200);
        Folder folder = new Folder("My Documents");

        // 添加文件到文件夹
        folder.add(file1);
        folder.add(file2);

        // 创建子文件夹并添加到父文件夹
        Folder subFolder = new Folder("My Pictures");
        subFolder.add(new File("pic1.png", 50));
        subFolder.add(new File("pic2.png", 70));
        folder.add(subFolder);

        // 显示文件和文件夹信息
        folder.display();

    }
}
