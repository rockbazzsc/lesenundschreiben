package com.company;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class lesen {
    public static void read(){
        InputStream is = null;
        File file = new File("C:\\Users\\suraj\\IdeaProjects\\lesenundschreiben\\demo.txt");

        try (InputStream in = new FileInputStream(file)) {
            int content;
            while ((content = in.read()) != -1) {
                System.out.print((char)content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
