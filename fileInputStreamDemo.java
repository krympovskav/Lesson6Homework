package Homework;

import java.io.FileInputStream;

public class fileInputStreamDemo {

    public byte[] readfromfile(String Owner) {
       try(FileInputStream fis = new FileInputStream("Owner_Example1")) {
           int available = fis.available();
           byte[] buffer = new byte[available];
           fis.read(buffer);
           return buffer;

       }catch (Exception ignored) {

       }
    return new byte[]{};
    }
}
