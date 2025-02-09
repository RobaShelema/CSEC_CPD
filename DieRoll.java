import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int W = sc.nextInt();
        
        int maxRoll = Math.max(Y, W);
        int Outcomes = 6 - maxRoll + 1;
        
        int gcd = gcd(Outcomes, 6);
        
        System.out.println((Outcomes / gcd) + "/" + (6 / gcd));
    }
    
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
