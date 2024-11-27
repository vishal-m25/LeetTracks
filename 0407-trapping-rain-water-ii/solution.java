class Solution {
    public int trapRainWater(int[][] heightMap) {
        if (heightMap == null || heightMap.length == 0 || heightMap[0].length == 0) {
            return 0;
        }
        
        int rows = heightMap.length;
        int cols = heightMap[0].length;
        
        boolean[][] visited = new boolean[rows][cols];
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(c -> c.height));
        
        // Add the border cells into the priority queue and mark them as visited
        for (int i = 0; i < rows; i++) {
            visited[i][0] = true;
            visited[i][cols - 1] = true;
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, cols - 1, heightMap[i][cols - 1]));
        }
        
        for (int j = 1; j < cols - 1; j++) {
            visited[0][j] = true;
            visited[rows - 1][j] = true;
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(rows - 1, j, heightMap[rows - 1][j]));
        }
        
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int result = 0;
        
        // Perform BFS starting from the minimum height cells
        while (!pq.isEmpty()) {
            Cell cell = pq.poll();
            for (int[] dir : dirs) {
                int x = cell.row + dir[0];
                int y = cell.col + dir[1];
                if (x >= 0 && x < rows && y >= 0 && y < cols && !visited[x][y]) {
                    visited[x][y] = true;
                    result += Math.max(0, cell.height - heightMap[x][y]);
                    pq.offer(new Cell(x, y, Math.max(cell.height, heightMap[x][y])));
                }
            }
        }
        
        return result;
    }
    
    static class Cell {
        int row;
        int col;
        int height;
        
        Cell(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }
    }
}
