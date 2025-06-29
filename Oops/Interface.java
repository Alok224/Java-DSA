// Create a class
interface Animal{
    // create a function
    void walk();
    void sleep();
}
class Camel implements Animal{
    // create a function
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    public void sleep(){
        System.out.println("Camel sleeps at night");
    }
}

class Dog implements Animal{
    // create a function
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    public void sleep(){
        System.out.println("Dog sleeps at night");
    }
}

public class Interface{
    public static void main(String[] args){
        // Create a object
        Animal Camel = new Camel();
        Animal Dog = new Dog();

        // call the function
        Camel.walk();
        Camel.sleep();

        Dog.walk();
        Dog.sleep();
    }
}