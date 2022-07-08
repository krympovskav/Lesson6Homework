package Homework;

import java.io.FileInputStream;

public class fileInputStreamDemo2 {

    public byte[] readfromfile(String Pets) {
        try(FileInputStream fis = new FileInputStream("Animals_Example1")) {
            int available = fis.available();
            byte[] buffer = new byte[available];
            fis.read(buffer);
            return buffer;

        }catch (Exception ignored) {

        }
        return new byte[]{};
    }
}
