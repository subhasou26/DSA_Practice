
public class Ops {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Red");
        // p1.setTip(5);


        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "subha9752";
        // myAcc.setPassword("1234");
        // myAcc.printPassword();
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        Student s1=new Student();
        s1.name="subha";
        s1.roll=11;
        s1.password="Subh@977";
        s1.marks[0]=100;
        s1.marks[1]=80;
        s1.marks[2]=70;


        Student s2=new Student(s1);
        s2.password="sss";
        s1.marks[0]=150; // we changing value of s1 but it reflected in the s2 in the shallow copy
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i]+" ");
        }
        
    }
}

class Pen {
    private String color;
    private int tip;
   

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

}

// Bank Account
class BankAccount {
    public String username;
    private String password;

    void setPassword(String newPassword) {
        password = newPassword;
    }

    void printPassword() {
        System.out.println(password);
    }
}

// Constructors

class Student{
    String name;
    int roll;
    String password;
    int marks[];
     Student(Student s1){ // shallow copy constructor
         marks=new int[3];
         this.name=s1.name;
         this.roll=s1.roll;
         this.marks=s1.marks;   
     }

    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     for(int i=0;i<marks.length;i++){
    //         this.marks[i]=s1.marks[i];
    //     }

    // }
    Student(){
        marks=new int[3];
        System.out.println("Constractor is called");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
    Student(String name, int roll){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
    }
}