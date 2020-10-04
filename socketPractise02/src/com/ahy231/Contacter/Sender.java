package com.ahy231.Contacter;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author ahy231
 * @Date created in 0:04 2020/10/4
 * @since 1.4
 */
public class Sender implements Runnable {

    final DataOutputStream os;

    public Sender(DataOutputStream dos) {
        os = dos;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                while (sc.hasNext()) {
                    os.writeUTF(sc.nextLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}