import java.util.Scanner;

public class Largest_And_Smallest {
    public static int Large(int matrix[][]){
        int large=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>large){
                    large=matrix[i][j];
                }
            }
        }
        return large;
    }
    public static int Small(int matrix[][]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<small){
                    small=matrix[i][j];
                }
            }
        }
        return small;
    }

        public static boolean Search(int matrix[][], int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                        System.out.println("key found at ("+i+','+j+")");
                        return true;
                }
            }
        }
        System.out.println("NOT FOUND");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n=matrix.length,  m=matrix[0].length;

        // input
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        // output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Search(matrix, 5);
        int large=Large(matrix);
        System.out.println("large number is "+large);
        int small=Small(matrix);
        System.out.println("small number is "+small);
    }
}
