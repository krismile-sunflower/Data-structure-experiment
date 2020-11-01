package Stack.Test;

public class Cell {
    int x = 0;
    int y = 0;
    boolean visited = false;
    char c = ' ';
    int dir = 0;

    public Cell(int x, int y, boolean visited, char c, int dir) {
        this.x = x;
        this.y = y;
        this.visited = visited;
        this.c = c;
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + dir +")";
    }
}
