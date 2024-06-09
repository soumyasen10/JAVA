import java.util.Scanner;

public class Palindrome {
    public static void  palindrome(int num){
        int F=0;
        while(num<0){
            int A=num%10;
            F=F*10+A;
            num=num/10;
            System.out.println(F);
    }
    
}
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        palindrome(121);
        // if(Newnum==num){
        //     System.out.println("The number "+num+" is palindrome!");
        // }
        // else{
        //     System.out.println("The number "+num+" is Not palindrome!");
        // }
    }
}
