public class SubArraySum {
    public static void SubArray(int numbers[]){
        int sum=0;
        int maxvalue=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum=sum+numbers[k];
                }
                System.out.println();
                System.out.print(sum);
                if(sum>maxvalue){
                    maxvalue=sum;
                }

                System.out.println();
            }
        }
        System.out.print("The max sum of among the all subarray is "+maxvalue);
    }
    public static void main(String args[]){
        int number[]={2,3,4,5,6,10};
        SubArray(number);
    }
}
