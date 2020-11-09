package Stack.Test;

import Stack.LinkStack;

import java.util.Scanner;

public class Maze {
    private Cell[][] cells;
    private Maze(char[][] maze){
        cells = createMaze(maze);
    }

    private Cell[][] createMaze(char[][] maze){
        Cell[][] cells = new Cell[maze.length][];
        for(int i = 0; i < maze.length; i++){
            char[] row = maze[i];
            cells[i] = new Cell[row.length];
            for (int j = 0; j < row.length; j++){
                cells[i][j] = new Cell(i, j, false, maze[i][j], 0);
            }
        }
        return cells;
    }

    public void printMaze(){
        for (int i = 0; i < cells.length; i++){
            for (int j = 0; j < cells[i].length; j++){
                System.out.print(cells[i][j].c);
            }
            System.out.println();
        }
    }

    public void findPath(int sx, int sy, int ex, int ey) throws Exception {
        LinkStack s = new LinkStack();
        Cell startCell = cells[sx][sy];
        Cell endCell = cells[ex][ey];
        s.push(startCell);
        startCell.visited = true;
        startCell.dir = 2;
        while (!s.isEmpty()){
            Cell current = (Cell)s.getTop();
            System.out.print(current.toString() + " ");
            if(current == endCell){
                while(!s.isEmpty()){
                    Cell cell = (Cell)s.pop();
                    cell.c = '*';
                    while (!s.isEmpty() && ! isAdjoinCell((Cell)s.getTop(), cell)){
                        s.pop();
                    }
                }
                System.out.println("找到从起点到终点的路径.");
                printMaze();

                return;
            }
            else {
                int x = current.x;
                int y = current.y;
                int count = 0;
                if(isValidWayCell(cells[x+1][y])){
                    cells[x][y].dir = 4;
                    cells[x+1][y].visited = true;
                    s.push(cells[x+1][y]);
                    count++;
                }
                if(isValidWayCell(cells[x][y+1])){
                    cells[x][y].dir = 2;
                    cells[x][y+1].visited = true;
                    s.push(cells[x][y+1]);
                    count++;
                }
                if(isValidWayCell(cells[x-1][y])){
                    cells[x][y].dir = 1;
                    cells[x-1][y].visited = true;
                    s.push(cells[x-1][y]);
                    count++;
                }
                if(isValidWayCell(cells[x][y-1])){
                    cells[x][y].dir = 3;
                    cells[x][y-1].visited = true;
                    s.push(cells[x][y-1]);
                    count++;
                }
                if(count == 0)
                    s.pop();
            }
        }
        System.out.println("没有从起点到终点的路线.");
    }

    private boolean isAdjoinCell(Cell cell1, Cell cell2){
        if(cell1.x == cell2.x && Math.abs(cell1.y - cell2.y) < 2)
            return true;
        if(cell1.y == cell2.y && Math.abs(cell1.x - cell2.x) < 2)
            return true;
        return false;
    }

    private boolean isValidWayCell(Cell cell){
        return cell.c == '0' && !cell.visited;
    }

    public static void main(String[] args) throws Exception {
        char[][] mazeChars = {
                {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '1', '1', '0', '0', '1', '1'},
                {'1', '0', '0', '1', '1', '0', '0', '1', '0', '1'},
                {'1', '0', '0', '0', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '0', '0', '0', '1', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '1', '1', '1', '0', '0', '1'},
                {'1', '0', '0', '0', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '1', '0', '0', '0', '1', '0', '1'},
                {'1', '1', '0', '0', '0', '0', '0', '0', '0', '1'},
                {'1', '1', '1', '1', '1', '1', '1', '1', '1', '1'}
        };
        Maze maze = new Maze(mazeChars);
        System.out.println("迷宫如下：");
        maze.printMaze();
        Scanner scanner = new Scanner(System.in);
        int sx, sy, ex, ey;
        System.out.print("请输入起点坐标所在行（1-8）：");
        sx = scanner.nextInt();
        System.out.print("请输入起点坐标所在列（1-8）：");
        sy = scanner.nextInt();
        System.out.print("请输入终点坐标所在行（1-8）：");
        ex = scanner.nextInt();
        System.out.print("请输入终点坐标所在列（1-8）：");
        ey = scanner.nextInt();
        maze.findPath(sx, sy, ex, ey);
    }

}
