import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[][] uniforms = new int[n][2];

        for (int i = 0; i < n; i++) {
            uniforms[i][0] = sc.nextInt(); 
            uniforms[i][1] = sc.nextInt();
        }

        int count = 0;
        for (int h = 0; h < n; h++) {
            for (int guest = 0; guest < n; guest++) {
                if (h != guest && uniforms[h][0] == uniforms[guest][1]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
