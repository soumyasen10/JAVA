import java.util.*;
public class PrimeNumber {

    public static boolean Prime(int a){
        boolean Prime=true;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                Prime=false;
                break;
            }
        }
        return Prime;
        
    }
    public static void main(String[] args) {
        System.out.println(Prime(112));
    }
}
