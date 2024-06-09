public class SpiralMatrix {
    public static void Spiral(int matrix[][]){
        int SR=0;
        int ER=matrix.length-1;
        int SC=0;
        int EC=matrix[0].length-1;

        while(SR <=ER && SC<=EC ){
            // top
            for(int i=SC;i<=EC;i++){
                System.out.println(matrix[SR][i]);
            }
            // right
            for(int i=SR+1;i<=ER;i++){
                System.out.println(matrix[i][EC]);
            }
            // bottom
            for(int i=EC-1;i>=SC;i--){
                if(SR==ER){
                    break;
                }
                System.out.println(matrix[ER][i]);
            }
            // left
            for(int i=ER-1;i>=SR+1;i--){
                if(SC==EC){
                    break;
                }
                System.out.println(matrix[i][SC]);
            }
            SR++;
            SC++;
            ER--;
            EC--;
        }

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        Spiral(matrix);
    }
}
