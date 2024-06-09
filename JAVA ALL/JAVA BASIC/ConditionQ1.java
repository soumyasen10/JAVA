import java.util.Scanner;

public class ConditionQ1 {
    public static void main(String args[]){
        System.out.println("Enter Your Digit: ");
        Scanner sc=new Scanner(System.in);
        int Digit=sc.nextInt();
        if(Digit<0){
            System.out.println("The Digit "+Digit+" is negative!");
        }
        else{
            System.out.println("The Digit "+Digit+" is positive!");
        }

    }
    
}