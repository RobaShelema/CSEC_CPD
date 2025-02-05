import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] calories = new int[4];
        for (int i = 0; i < 4; i++) {
            calories[i] = sc.nextInt();
        }
        
        String s = sc.next();

        int total = 0;
        for (char c : s.toCharArray()) {
            int index = Character.getNumericValue(c) - 1; 
            total += calories[index];
        }
        System.out.println(total);
    }
}

