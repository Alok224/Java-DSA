// Create a class
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write Something");
    }
    public void type(){
        System.out.println("This is your pen type" + " " + this.type);
    }
}

// Create a class student
class Student{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-Parametrize Constructor
    // Student(){
    //     System.out.println("Constructor Called");
    // }

    // Parametrize Constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age = age;
    // }

    // Copy Constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    };

}

public class FirstCode{
    public static void main(String[] args){
        // Create the object
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.type = "ballpoint";
        pen2.type = "gel";
        pen1.color = "blue";
        pen2.color = "Green";

        pen1.write();

        pen1.type();
        pen2.type();

        Student s1 = new Student();
        s1.name = "Alok";
        s1.age = 20;

        // create the s2 object
        Student s2 = new Student(s1);
        s2.printinfo();

    }
}