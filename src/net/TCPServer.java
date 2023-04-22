package net;

/**
 * TCP服务端
 */
import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String[] args) {
        try {
            // 创建一个ServerSocket对象，指定监听的端口
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("Server started");
            while (true) {
                // 监听客户端的连接
                Socket socket = serverSocket.accept();
                System.out.println("New client connected: " + socket.getInetAddress().getHostAddress());
                // 获取输入流，用于接收客户端发送的数据
                InputStream inputStream = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                // 接收客户端发送的数据
                String message = reader.readLine();
                System.out.println("Received message from client: " + message);
                // 获取输出流，用于向客户端发送数据
                OutputStream outputStream = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(outputStream);
                // 向客户端发送数据
                writer.println("Hello, client 202202150353梁发灿发给你的!");
                writer.flush();
                // 关闭Socket连接
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
