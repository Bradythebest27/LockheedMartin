import java.util.Scanner;

public class wordsearch {
    static int[] dx = {1, 1, -1, -1, 1, -1, 0, 0};
    static int[] dy = {1, -1, 1, -1, 0, 0, 1, -1};

    static boolean search(char[][] grid, String word, int x, int y, int direction) {
        int len = word.length();
        int nx, ny;

        for (int i = 0; i < len; i++) {
            nx = x + i * dx[direction];
            ny = y + i * dy[direction];

            if (nx < 0 || nx >= 10 || ny < 0 || ny >= 10) 
                return false;
            if (grid[nx][ny] != word.charAt(i)) 
                return false;
        }

        return true;
    }

    static void find(char[][] grid, String word) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 8; k++) {
                    if (search(grid, word, i, j, k)) {
                        if (k == 0) System.out.println(word + " was found diagonally."); //left to right to digonally
                        if (k == 1) System.out.println(word + " was found diagonally."); //check
                        if (k == 2) System.out.println(word + " was found diagonally."); //check
                        if (k == 3) System.out.println(word + " was found diagonally."); //correct
                        if (k == 4) System.out.println(word + " was found vertically.");
                        if (k == 5) System.out.println(word + " was found vertically.");
                        if (k == 6) System.out.println(word + " was found horizontally."); //left top to right bottom to horiz
                        if (k == 7) System.out.println(word + " was found horizontally."); //right to to left bottom to horizontal
                        return;
                    }
                }
            }
        }

        System.out.println(word + " was not found.");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] grid = new char[10][10];
        for (int i = 0; i < 10; i++) {
            grid[i] = scan.nextLine().toCharArray();
        }

        int T = scan.nextInt();
        scan.nextLine();

        while (T-- > 0) {
            String word = scan.nextLine();
            find(grid, word);
        }

    }
}
