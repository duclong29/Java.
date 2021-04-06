package exe3;

public class Exercise3 {
    public static void main(String[] args) {
        int[][] grid= new int[12][8];
        int numrow = grid.length;
        int nuncol = grid[0].length;

        for (int row = 0; row < numrow; row++) {
            for (int col = 0; col < nuncol; col++) {
                grid[row][col] = row * nuncol + col + 1;
            }
        }
        for (int  row = 0; row < numrow; row++) {
            for (int col = 0; col < nuncol; col++){
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}
