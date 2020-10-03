package com.ahy231.Contacter;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * @author ahy231
 * @Date created in 0:04 2020/10/4
 * @since 1.4
 */
public class Receiver implements Runnable {

    final DataInputStream is;

    public Receiver(DataInputStream isr) {
        is = isr;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (is) {
                try {
                    System.out.println(is.readUTF());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}