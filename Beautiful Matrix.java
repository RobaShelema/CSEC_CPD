import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3; //row for 1
        int b = 3; //column for 1
        
        int[][] matrix = new int[5][5];
        
        
        int row1 = -1, column1 = -1; 
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    row1 = i + 1;  
                    column1 = j + 1;  
                }
            }
        }
        
        
        int moves = Math.abs(row1 - a) + Math.abs(column1 - b);
        
        
        System.out.println(moves);
    }
}
