import java.util.Scanner;

public class Magnet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        int G = 1; 
        String F_Magnet = sc.nextLine(); 
        
        for (int i = 1; i < n; i++) {
            String N_Magnet = sc.nextLine();
            if (!N_Magnet.equals(F_Magnet)) {
                G++; 
            }
            F_Magnet = N_Magnet;
        }
        System.out.println(G);
        
    }
}
