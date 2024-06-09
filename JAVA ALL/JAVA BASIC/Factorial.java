import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        System.out.println("Enter Your Number: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int fact=1;
        
        while(i<=num){
             fact *=i;
            i++;
        }
        System.out.println("The factorial is "+fact);
    }
}
