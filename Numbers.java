import java.util.Scanner;

public class Numbers{
  public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();

	for (int i=1; i<=n; i++) {		
		System.out.print(i + " ");
		if (i%10 == 0){
			System.out.println();
		}
	}
		     
  }
}