import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[n];
        
        for (int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }
        
        int left = 0, right = n - 1;
        int S_points = 0, D_points= 0;
        boolean S_Turn = true;
        while (left <= right) {
            if (card[left] > card[right]) {
                if (S_Turn) {
                    S_points += card[left];
                } else {
                    D_points += card[left];
                }
                left++; 
            } else {
                if (S_Turn) {
                    S_points += card[right];
                } else {
                    D_points+= card[right];
                }
                right--; 
            }
            S_Turn = !S_Turn;
        }
        System.out.println(S_points + " " + D_points);
    }
}
