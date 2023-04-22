package net;

import java.io.*;
import java.net.*;
public class UDPClient {
    public static void main(String[] args) {
        try {
            // 创建一个DatagramSocket对象
            DatagramSocket socket = new DatagramSocket();
            // 构造要发送的数据
            String message = "Hello, server!梁发灿发给你";
            byte[] data = message.getBytes();
            // 创建一个DatagramPacket对象，指定数据、数据长度、服务器地址和端口号
            InetAddress address = InetAddress.getByName("10.42.1.49");
            DatagramPacket packet = new DatagramPacket(data, data.length, address, 8888);
            // 发送数据
            socket.send(packet);
            // 接收服务器返回的数据
            byte[] buffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(receivePacket);
            String receiveMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received message: " + receiveMessage);
            // 关闭socket
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
