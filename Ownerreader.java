package Homework;

public class Ownerreader {
    public static final String Owner_Example1 = "Owner.txt";

    public static void main(String[] args) {
        fileInputStreamDemo fileInputStreamDemo1 = new fileInputStreamDemo();
        byte[] bytes = fileInputStreamDemo1.readfromfile(Owner_Example1);
       System.out.println(new String(bytes));

    }
}
