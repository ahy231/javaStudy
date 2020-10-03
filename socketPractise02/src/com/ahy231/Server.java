package com.ahy231;

import com.ahy231.Contacter.Receiver;
import com.ahy231.Contacter.Sender;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ahy231
 * @Date created in 10:40 2020/10/3
 * @since 1.4
 */
public class Server {

    public static void main(String[] args) {
        try (ServerSocket ss = new ServerSocket(8088);
             Socket s = ss.accept();
             DataInputStream dis = new DataInputStream(s.getInputStream());
             DataOutputStream dos = new DataOutputStream(s.getOutputStream())) {
            Thread receiver = new Thread(new Receiver(dis));
            Thread sender = new Thread(new Sender(dos));
            receiver.start();
            sender.start();
            receiver.join();
            sender.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
