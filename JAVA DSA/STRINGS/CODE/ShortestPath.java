public class ShortestPath {
public static void main(String args[]){
    int x=0,y=0;

    String path="WNEENESENNN";
    for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);
        if(dir =='W'){
            x--;
        }
        else if(dir =='S'){
            y--;
        }
        else if(dir =='E'){
            x++;
        }
        else{
            y++;
        }
    }
    System.out.println(y);
        int X2=x*x;
        int Y2=y*y;
        System.out.println((float)(Math.sqrt(X2+Y2)));
}
}
