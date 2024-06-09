public class LinearSearch {
    public static int LinSearch(int numbers[], int key){
        for(int i=0;i< numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={2,3,4,65,10,12,24,16};
        int key=10;
        int index=LinSearch(numbers, key);
        if(index==-1){
            System.out.println("Key is Not Found");
        }
        else{
            System.out.println("Key is Found at "+index+" index!");
        }
    } 
}
