package exe3;

public class Exercise4 {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };
        for (int i = 0; i <grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        int[][] grid1 = new int[3][];
        grid1[0] = new int[2];
        grid1[1] = new int[3];
        grid1[2] = new int[4];

        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                System.out.print(grid1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
