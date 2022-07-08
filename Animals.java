package Homework;

public class Animals {

            public static void main(String[] args) {
        Owner owner1 = new Owner();
        owner1.firstName = "Freddie";
        owner1.lastName = "Krueger";
        owner1.address = "Elm street";
        owner1.phone = "0666666";
        owner1.age = 60;

        Pet pet1 = new Pet();
        pet1.age = 3;
        pet1.name = "Charlie";
        pet1.Owner = "Freddie";


    }


}

class Owner {
    String firstName;
    String lastName;
    String address;
    String phone;
    int age;


}

class Pet {
    String name;
    String Owner;
    int age;

}


