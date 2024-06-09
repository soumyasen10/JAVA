import java.util.Scanner;

public class FactorialQ2 {

    public static int Factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
         fact*=i;  

    }

        return fact;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int Num=sc.nextInt();
        int Factorial=Factorial(Num);
        System.out.println("The Factorial Of "+Num+" is "+Factorial);
    }
}
