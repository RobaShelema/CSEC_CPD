import java.util.Scanner;

public class problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int count = 0;
        while(n-- >= 1){
            if(sc.nextInt() <= h){
                count++;
            }
            else{
                count = count + 2;
            }
        }
        System.out.println(count);
    }
}
