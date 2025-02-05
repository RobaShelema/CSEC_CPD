import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        
        int U_Count = 0, L_Count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                U_Count++;
            } else {
                L_Count++;
            }
        }

        if (U_Count > L_Count) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
