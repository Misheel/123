import java.util.Scanner;

public class StarA{
  public static void main(String args[]) {

		System.out.print(Math.max(5, 10));

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for (int i=1; i<=n; i++) {		

				for (int j=1; j<=n; j++) {		
					System.out.print("* ");
				}
				System.out.println();

		}	  

  }
}