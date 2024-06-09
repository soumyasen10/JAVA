import java.util.Scanner;

public class Binomial_Coefficient {

    public static int Binomial(int n, int r){
        int fact_n=Factorial(n);
        int fact_r=Factorial(r);
        int fact_nmr=Factorial(n-r);

        return fact_n/(fact_r*fact_nmr);
    }

    public static int Factorial(int a){
        if(a>1){
            int fact=a*Factorial(a-1);
            return fact;}
        else{
            return 1;
        }
        
    }
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int Num=sc.nextInt();
        int Num2=sc.nextInt();
        int Binomial=Binomial(Num,Num2);
        System.out.println("The Binomial coefficient Of "+Num+" and "+Num2+" is "+Binomial);
    }
}
