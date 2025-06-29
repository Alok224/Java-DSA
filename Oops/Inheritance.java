import bank;
// single level Inheritance
class Shape{
    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// multilevel Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/3*l*h);
    }
}

// Hiearichal Inheritance
class Circle extends Shape{
    public void area(r){
        System.out.println(3.14*r*r);
    }
}

public class Inheritance{
    public static void main(String args[]){
        bank.Account account1 = new bank.Account();
        account1.name = "Sam";
    }
}