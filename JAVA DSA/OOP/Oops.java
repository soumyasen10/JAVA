public class Oops{
    public static void main(String args[]){
        // Pen p1=new Pen();
        // p1.setColor("blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // BankAccount myacc=new BankAccount();
        // myacc.Username="zayan";
        // myacc.setPassword("2002");

        // System.out.println(myacc.Username);

        // Student s1=new Student(); 
        // s1.name="zayan sen";
        // s1.roll=21;
        // s1.password="abcd";
        // s1.marks[0]=100;
        // s1.marks[1]=150;
        // s1.marks[2]=200;
        
        // Student s2 = new Student(s1);
        // s2.password="xyz";
        // s1.marks[2]=400;   

        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }

        fish shark=new fish();
        shark.eat();

        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }

    

}
class Pen{
    private String color;  
    private int tip;

    String getColor(){
        return this.color;  
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class BankAccount{
     public String Username;
     private String password;

     public void setPassword(String newPass){
        password=newPass;
     }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // Non-parameterized constructor
    Student(){
        System.out.println("Hello World...!");
         marks=new int[3];
    }

    // copy constructor(shallow)
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     marks=new int[3];
    //     this.marks=s1.marks;
    // }

    // copy constructor(deep copy)
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];

        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }



    // parameterized constructor
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }
}

// base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats!");
    }
    void breath(){
        System.out.println("breaths!");
    }
}

// Derive class
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swimming!");
    }
}

class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
     String Breed;
}