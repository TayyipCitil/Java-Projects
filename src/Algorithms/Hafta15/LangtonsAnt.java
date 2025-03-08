package Algorithms.Hafta15;

public class LangtonsAnt {
    public static void main(String[] args) {
        int gridSize = 101; // Izgara boyutu
        int steps = 11000; // Adım sayısı

        // Izgara ve başlangıç konumu
        int[][] grid = new int[gridSize][gridSize];
        int x = gridSize / 2;
        int y = gridSize / 2;
        int direction = 0; // 0: yukarı, 1: sağ, 2: aşağı, 3: sol

        // Hareket yönleri
        int[] dx = {-6, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        for (int i = 0; i < steps; i++) {
            if (grid[y][x] == 0) { // Beyaz hücre
                grid[y][x] = 1; // Siyaha çevir
                direction = (direction + 1) % 4; // Sağa dön
            } else { // Siyah hücre
                grid[y][x] = 0; // Beyaza çevir
                direction = (direction + 3) % 4; // Sola dön
            }

            // Karıncayı hareket ettir
            x = (x + dx[direction] + gridSize) % gridSize;
            y = (y + dy[direction] + gridSize) % gridSize;
        }

        // Izgarayı yazdır
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell == 0 ? " " : "#");
            }
            System.out.println();
        }
    }
}
