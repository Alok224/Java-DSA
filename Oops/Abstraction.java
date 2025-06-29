// Create a class animal
abstract class Animal{
    abstract void walk();
}

class Horse extends Animal{
    // create a function
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class chicken extends Animal{
    // create a function
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction{
    public static void main(String[] args){
        // create a Horse object
        Horse horse = new Horse();
        // call the function
        horse.walk();
        // create a animal object
        Animal animal = new Animal();
        // call the function
        animal.walk();
    }
}