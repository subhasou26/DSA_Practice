

public class Demo {
    public static void main(String[] args) {
        // Queen q=new Queen();
        // q.moves();
        Human subha=new Human();
        subha.veg();
        subha.non_veg();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("Up, down, left, right,diagonal(in all four directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
         System.out.println("Up, down, left, right");
     }
 }
class King implements ChessPlayer{
    public void moves(){
         System.out.println("Up, down, left, right and diagonal by one steps");
     }
 }
 interface Carnivore{
    String meat="chicken";
    void non_veg();
 }
 interface Herbibore{
    String grass="anything";
    void veg();
 }



 class Human implements Carnivore,Herbibore{
    public void veg(){
        System.out.println("I also eat veg");
    }
    public void non_veg(){
        System.out.println("I also eat non veg");
    }
 }