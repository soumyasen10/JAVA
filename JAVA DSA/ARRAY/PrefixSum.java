public class PrefixSum {
    public static void SubArray(int numbers[]){
        int sum=0;
        int maxvalue=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        // calculating prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                sum= i==0 ? prefix[j] : prefix[j]- 
                prefix[i-1];

                System.out.println(sum);

                if(sum>maxvalue){
                    maxvalue=sum;
                    
                }
                
            }


                System.out.println();
            }
        
        System.out.print("The max sum of among the all subarray is "+maxvalue);
    }
    
    public static void main(String args[]){
        int number[]={2,3,4,5,6,10};
        SubArray(number);
    }
}

