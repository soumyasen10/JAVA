import java.util.ArrayList;

public class Diagonal{

    public static int diagonal(ArrayList<ArrayList<Integer>> matrix) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < matrix.size(); i++) {
            sum1 += matrix.get(i).get(i);
            sum2 += matrix.get(i).get(matrix.size() - 1 - i);
        }
        return Math.abs(sum2 - sum1);
    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(2);
        row1.add(0);
        row1.add(0);
        matrix.add(row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(7);
        row2.add(0);
        matrix.add(row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(2);
        row3.add(9);
        row3.add(0);
        matrix.add(row3);

        int total = diagonal(matrix);
        System.out.print(total);
    }
}