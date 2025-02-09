import java.util.HashSet;
import java.util.Scanner;

public class HorseShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashSet<Integer> horseshoes = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            horseshoes.add(sc.nextInt());
        }
        
        System.out.println(4 - horseshoes.size());
    }
}
