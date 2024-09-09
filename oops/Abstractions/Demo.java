public class Demo{
    public static void main(String[] args) {
        Horse h=new Horse();
    //     h.eat();
    //     h.walk();
    //    h.changeColor();
    //     Chicken c=new Chicken();
    //     c.eat();
    //     c.walk();
    //     System.out.println(h.color);
    //     System.out.println(c.color);
       
    }
}

abstract class Animal{
    String color;
    Animal(){
        color="brown";
        System.out.println("animal constractor called");
    }
    void eat(){
        System.out.println("Animals eats");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constractor called");
    }
    void changeColor(){
        color="dark brown";
      
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}