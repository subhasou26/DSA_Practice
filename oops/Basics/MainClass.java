class Person{
    String name;
    int age;
    static int count;
    public Person(){ // default constractor alredy in java
        count++;
        System.out.println("creating a object"); 
    }
    // constractor
    public Person(int age,String name){
       System.out.println("calling the parent class constractor");
       this. name=name;
       this. age=age;
    }
    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int steps){
        System.out.println(name+" waling "+steps);
    }
    void dowork(){
        System.out.println("Person is working");
    }
}


class Developer extends Person{
    int id;
    String role;
    public Developer(int age,String name){
        super(age,name);
    }
    void walk(){
        System.out.println("Developer "+name+" is walking");
    }
}

public class MainClass {
  
    public static void main(String args[]){
     //   Person p1=new Person(); // object is p1
    //     Person p2=new Person(31,"saheli");
    //     p1.age=24;
    //    p1.name="Subha";
      
    //     System.out.println(p2.age+" "+p2.name);
      
    //     p2.walk();
       
    //     System.out.println(Person.count);
        Developer d1=new Developer(20,"subha");
    
        System.out.println(d1.name);
        d1.eat();
        d1.walk();
    }
}

