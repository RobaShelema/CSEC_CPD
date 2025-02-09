import java.util.Scanner;

public class ShaassAndOskols{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of wires
        int[] birds = new int[n];
        
        for (int i = 0; i < n; i++) {
            birds[i] = sc.nextInt();
        }
        
        int m = sc.nextInt(); // Number of shots
        
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1; // Wire index (0-based)
            int y = sc.nextInt(); // Bird position on the wire
            
            if (x > 0) {
                birds[x - 1] += y - 1; 
            }
            
            if (x < n - 1) {
                birds[x + 1] += birds[x] - y; 
            }
            
            birds[x] = 0; 
        }
        
        
        for (int count : birds) {
            System.out.println(count);
        }
    }
}
