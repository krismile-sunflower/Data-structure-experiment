package Stack.Experiment3;

public class Maze {
    public static void main(String[] args) {
        int[][] maze = new int[11][10];
        for(int i = 0; i < 10; i++){
            maze[0][i] = 1;
            maze[10][i] = 1;
        }
        for(int i = 1; i < 10; i++){
            maze[i][0] = 1;
            maze[i][9] = 1;
        }
        maze[1][1] = 0;maze[1][2] = 0; maze[1][3] = 1; maze[1][4] = 0; maze[1][5] = 0; maze[1][6] = 0; maze[1][7] = 1; maze[1][8] = 0;
        maze[2][1] = 0;maze[2][2] = 0; maze[2][3] = 1; maze[2][4] = 0; maze[2][5] = 0; maze[2][6] = 0; maze[2][7] = 1; maze[2][8] = 0;
        maze[3][1] = 0;maze[3][2] = 0; maze[3][3] = 0; maze[3][4] = 0; maze[3][5] = 1; maze[3][6] = 1; maze[3][7] = 0; maze[3][8] = 1;
        maze[4][1] = 0;maze[4][2] = 1; maze[4][3] = 1; maze[4][4] = 1; maze[4][5] = 0; maze[4][6] = 0; maze[4][7] = 1; maze[4][8] = 0;
        maze[5][1] = 0;maze[5][2] = 0; maze[5][3] = 0; maze[5][4] = 1; maze[5][5] = 0; maze[5][6] = 0; maze[5][7] = 0; maze[5][8] = 0;
        maze[6][1] = 0;maze[6][2] = 1; maze[6][3] = 0; maze[6][4] = 0; maze[6][5] = 0; maze[6][6] = 1; maze[6][7] = 0; maze[6][8] = 1;
        maze[7][1] = 0;maze[7][2] = 1; maze[7][3] = 1; maze[7][4] = 1; maze[7][5] = 1; maze[7][6] = 0; maze[7][7] = 0; maze[7][8] = 1;
        maze[8][1] = 1;maze[8][2] = 1; maze[8][3] = 0; maze[8][4] = 0; maze[8][5] = 0; maze[8][6] = 1; maze[8][7] = 0; maze[8][8] = 1;
        maze[9][1] = 1;maze[9][2] = 1; maze[9][3] = 0; maze[9][4] = 0; maze[9][5] = 0; maze[9][6] = 0; maze[9][7] = 0; maze[9][8] = 0;

        for(int i = 0; i < 11; i++){
            for(int j = 0; j <10; j++){
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maze[3][1]);
    }
}
