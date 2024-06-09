public class TrappingRainwater {
    public static int Rainwater(int height[]){
        int n=height.length;
        // calculate left max boundary
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }

        // calculate right max boundary
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }

        int trappedwater=0;
        // loop
        for(int i=0;i<n;i++){
// waterlevel=min(leftmax bound, rightmax bound)
            int waterlevel=Math.min(leftmax[i], rightmax[i]);

// trapped water=waterlevel-height[i]
            trappedwater+=waterlevel-height[i];

        }
        return trappedwater;
          


    }
public static void main(String args[]){
    int heights[]={4,2,0,6,3,2,5};
    System.out.println(Rainwater(heights));
    
}
}