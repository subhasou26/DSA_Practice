
public class Demo {
    
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="Kola Union High School";
        Student s2=new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    void setRoll(int roll){
        this.roll=roll;
    }

    String getName(){
        return this.name;
    }
    int getRoll(){
        return this.roll;
    }


}