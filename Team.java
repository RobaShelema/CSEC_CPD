import java.util.Scanner;
public class Problem231A
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    int count = 0;
	    while (t-- > 0)
	    {
	        int vasya = sc.nextInt();
	        int petya = sc.nextInt();
	        int tonya = sc.nextInt();
	        int result = vasya + petya + tonya;
	        if(result >= 2)
	        {
	            count++;
	        }
	    }
		System.out.println(count);
	}
}
