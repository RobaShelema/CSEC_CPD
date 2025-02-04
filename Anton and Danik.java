import java.util.Scanner;

public class problem734A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System .in);
        int n = sc.nextInt();
        String winner = sc.next();
        int A = 0, D = 0;
        for(int i = 0; i < winner.length(); i++)
        {
            if(winner.charAt(i) == 'A')
            {
                A++;
            }
            else{
                D++;
            }
        }
        if(A > D)
        {
            System.out.println("Anton");
        }
        else if(D > A)
        {
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
