import java.util.Scanner;

public class ColorfulStone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // Sequence of stones
        String t = sc.next(); // Sequence of instructions
    
        
        int pos = 1; 
        
        for (char inst : t.toCharArray()) {
            if (pos <= s.length() && s.charAt(pos - 1) == inst) {
                pos++;
            }
        }
        
        System.out.println(pos);
    }
}
