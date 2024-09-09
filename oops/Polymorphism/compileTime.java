

public class compileTime {
    public static void main(String[] args) {
        // Calculator calc=new Calculator();
        // System.out.println(calc.sum(5,6));
        // System.out.println(calc.sum((float)5.6,(float)5));
        // System.out.println(calc.sum(5,6,7));
        Deer d=new Deer();
        d.eat();
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eatting grass");
    }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}