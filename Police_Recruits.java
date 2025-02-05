import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int untreat = 0;
        int officers = 0;

        for (int i = 0; i < n; i++) {
            int event = sc.nextInt();
            
            if (event == -1) { 
                if (officers > 0) {
                    officers--;
                } else {
                    untreat++;
                }
            } else {
                 officers += event;
            }
        }
        System.out.println(untreat);

    }
}
