import java.util.Scanner;

public class FunctionQ1 {


    public static int multiply(int a,int b){
        int mul=a*b;
        return mul;  
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int mul1=multiply(a, b);
        System.out.println("The Multiply of a and b is "+mul1);
    }
}
