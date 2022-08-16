import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        int M = grid.length;
        int N = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    addNode(i, j, queue, grid);
                    while(!queue.isEmpty()) {
                        int[] node = queue.remove();
                        grid[node[0]][node[1]] = '2';
                        addNode(node[0], node[1]-1, queue, grid);
                        addNode(node[0], node[1]+1, queue, grid);
                        addNode(node[0]-1, node[1], queue, grid);
                        addNode(node[0]+1, node[1], queue, grid);
                    }
                }
            }
        }
        return count;
    }

    private void addNode(int i, int j, Queue<int[]> queue, char[][] grid) {
        if (i >= 0 && i < grid.length
                && j >= 0 && j < grid[0].length
                && grid[i][j] == '1') {
            grid[i][j] = '2';
            queue.add(new int[]{i, j});
        }
    }
}