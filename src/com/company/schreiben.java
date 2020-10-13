package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class schreiben {
    public static  void write(){
        String someText = "Hallo how are you. Just wanted to tell Java is awesome";
        byte[] textAsByte = someText.getBytes();
        try {
            String filename = "demo.txt";
            OutputStream out = new FileOutputStream(filename);
            out.write(textAsByte);
        } catch (IOException ex) {
            System.err.println("couldn’t write data (fatal)");
            System.exit(0);
        }
    }
}
