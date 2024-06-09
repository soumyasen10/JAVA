public class BinarySearch {
    public static int BinSearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        

        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int Array[]={2,3,4,6,78,79,569};
        int key=4;
        int index=BinSearch(Array, key);
        if(index==-1){
            System.out.println("Item is Not Found in the array!");
        }
        else{
            System.out.println("Item is Found in the array at index "+index);
        }
    }
}
