package Homework;

public class Petsreader {
    public static final String Animals_Example1 = "Pets.txt";
    public static void main(String[] args) {
        fileInputStreamDemo fileInputStreamDemo = new fileInputStreamDemo();
        byte[] bytes = fileInputStreamDemo.readfromfile(Animals_Example1);
        System.out.println(new String(bytes));

    }
}

