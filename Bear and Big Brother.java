import java.util.Scanner;

public class problem791A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System .in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int years = 0;
        while(a <= b)
        {
            a *= 3;  //weight of Limak
            b *= 2;  //weight of Bob
            years++;
        }
        System.out.println(years);
    }
}
