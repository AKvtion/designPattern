package net;
import java.io.*;
import java.net.*;
public class UDPServer {
    public static void main(String[] args) {
        try {
            // 创建一个DatagramSocket对象，指定监听的端口
            DatagramSocket socket = new DatagramSocket(8888);
            System.out.println("Server started");
            while (true) {
                // 接收客户端发送的数据
                byte[] buffer = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);
                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message from client: " + message);
                // 向客户端发送数据
                InetAddress address = receivePacket.getAddress();
                System.out.println("Received message from ip: " + address);
                int port = receivePacket.getPort();
                String sendMessage = "Hello, client!梁发灿服务器发给你";
                byte[] data = sendMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(data, data.length, address, port);
                socket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
