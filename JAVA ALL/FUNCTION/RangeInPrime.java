public class RangeInPrime {
    
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

    public static void Range(int n){
        for(int i=2;i<=n;i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Range(17);
    }
}
