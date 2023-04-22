package net;

/**
 * TCP客户端
 */
import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) {
        try {
            // 创建一个Socket对象，指定连接的服务器和端口
            Socket socket = new Socket("10.42.1.45", 8888);
            // 获取输出流，用于向服务器发送数据
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream);
            // 向服务器发送数据
            writer.println("你好，这是梁发灿客户端给你的消息");
            writer.flush();
            // 获取输入流，用于从服务器接收数据
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            // 接收来自服务器的数据
            String message = reader.readLine();
            System.out.println("Received message: " + message);
            // 关闭Socket连接
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
