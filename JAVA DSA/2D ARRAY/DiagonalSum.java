public class DiagonalSum {

    public static int Diagonal(int matrix[][]){
        int sum1=0;
        int sum2=0;

        for(int i=0;i<matrix.length;i++){
            sum1+=matrix[i][i];  
            sum2+=matrix[i][matrix.length-1-i];
        }
        return Math.abs(sum2-sum1);
        }
    public static void main(String args[]){
        int matrix[][]={{2},{5,7},{2,9}};

        int total=Diagonal(matrix);
        System.out.print(total);
    }
}
