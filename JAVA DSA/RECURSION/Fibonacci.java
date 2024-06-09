public class Fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fbn=fibo(n-1)+fibo(n-2);

        return fbn;
    }
    public static void main(String args[]){
        int n=6;
        System.out.println(fibo(n));
    }
    
}
