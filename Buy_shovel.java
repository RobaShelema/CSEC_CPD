import java.util.Scanner;

public class BuyShovel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // Price of one shovel
        int r = sc.nextInt(); // Coin denomination Polycarp has (1 to 9)
    
        
        int n = 1; // Start by buying one shovel
        
        while (true) {
            int totalCost = n * k;
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
