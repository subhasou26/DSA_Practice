

public class Demo {
    public static void main(String[] args) {
        // Fish sark=new Fish();
        // sark.color="Silver";
        // sark.fins=5;
        // sark.eat();
        // sark.breath();
        // Dog dobby=new Dog();
        // dobby.eat();
        // dobby.legs=4;
        // System.out.println(dobby.legs);
        // Bird pigion=new Bird();
        // pigion.fly();;
        // pigion.eat();
        Sark gretWhite=new Sark();
        gretWhite.color="Silver";
        gretWhite.fins=5;
        gretWhite.attack();

        Cat pussy=new Cat();
        pussy.legs=4;
        pussy.cuteness();
    }
}

// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breath(){
        System.out.println("Breathing");
    }
}

class Bird extends Animal{ // hierarchical inheritance
    void fly(){
        System.out.println("I am flying");
    }
}
 // Bird and Fish are hierarchical inheritance 
// Derived class
class Fish extends Animal{ // single level inheritance
    int fins;
    void eat(){
        System.out.println("Fish is eating");
    }
    void swim(){
        System.out.println("Swiming in water");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{ // Multi level inheritance
    String breed;
}

// Multiple inheritance

class Sark extends Fish{
    String type;
    void attack (){
        System.out.println("Attacking");
    }
}

class Cat extends Mammal{
    void cuteness(){
        System.out.println("I am cute");
    }
}

