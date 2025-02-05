import java.util.Scanner;
import java.util.HashSet;

public class BoyAndGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String u_name= sc.nextLine();
        HashSet<Character> uniqueChars = new HashSet<>();
        
        for (char c : u_name.toCharArray()) {
            uniqueChars.add(c); 
        }
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}
