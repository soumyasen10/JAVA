public class KadansSubSum {
    public static void kadanes(int numbers[]){
        int sum=0;
        int maxvalue=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];

            if(sum<0){
                sum=0;
            }
            maxvalue=Math.max(sum, maxvalue);
        }
        System.out.println("Max subarray sum is "+maxvalue);
    }
    public static void main(String args[]){
        int number[]={-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(number);
    }
}
