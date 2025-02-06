import java.util.Scanner;

public class NightMuseum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int rotations = 0;
        char current = 'a';

        for (char target : s.toCharArray()) {
            int clockwiseDistance = Math.abs(target - current);
            int counterClockwiseDistance = 26 - clockwiseDistance;
            rotations += Math.min(clockwiseDistance, counterClockwiseDistance);
            current = target;
        }

        System.out.println(rotations);
    }
}
