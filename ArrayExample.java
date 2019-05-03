import java.util.Scanner;

public class ArrayExample {
  public static void main(String args[]) {
    int a[] = new int[5];

    a[2] = 6;
    a[4] = 10;

    for (int i=0; i<5; i++){
        System.out.println(a[i]);
    }
    
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] b = new int[n];

    for (int j=0; j<n; j++){
        b[j] = scanner.nextInt();
    }

    for (int j=0; j<n; j++){
        System.out.print(b[j] + " ");
    }


    int[][] c = new int[3][3];

    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            c[i][j] = scanner.nextInt();
        }
    }

    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            System.out.println(c[i][j]);
        }
    }








  }
}