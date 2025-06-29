// Create a class student
class Student{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(this.name);
    }

    public void printinfo(int age){
        System.out.println(this.age);
    }

    public void printinfo(String name, int age){
        System.out.println("This is your name" + " " + this.name + " " + "and age is" + " " + this.age);
    }
}

public class Polymorphism{
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "Alok";
        s1.age = 20;

        // create the s2 object
        // Student s2 = new Student(s1);
        s1.printinfo(s1.age);

    }
}