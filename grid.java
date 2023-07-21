import java.util.*;
class grid
public static void main(String args[]){
public static int countSaba(String[][] grid, int n, int m) {
int count = 0;
for (int i = 0; i < n; i++) {
        for (int j = 0; j < m - 3; j++) {
            if (grid[i][j].equals("s") && grid[i][j+1].equals("a") && 
                grid[i][j+2].equals("b") && grid[i][j+3].equals("a")) {
                count++;
            }
        }
    }
    // Check vertically
    for (int i = 0; i < n - 3; i++) {
        for (int j = 0; j < m; j++) {
            if (grid[i][j].equals("s") && grid[i+1][j].equals("a") &&
                grid[i+2][j].equals("b") && grid[i+3][j].equals("a")) {
                count++;
            }
        }
    }
    // Check diagonally (top-left to bottom-right)
    for (int i = 0; i < n - 3; i++) {
        for (int j = 0; j < m - 3; j++) {
            if (grid[i][j].equals("s") && grid[i+1][j+1].equals("a") &&
                grid[i+2][j+2].equals("b") && grid[i+3][j+3].equals("a")) {
                count++;
            }
        }
    }
    // Check diagonally (bottom-left to top-right)
    for (int i = n-1; i >= 3; i--) {
        for (int j = 0; j < m - 3; j++) {
            if (grid[i][j].equals("s") && grid[i-1][j+1].equals("a") &&
                grid[i-2][j+2].equals("b") && grid[i-3][j+3].equals("a")) {
                count++;
            }
        }
    }
    return count;
}
