import java.util.Scanner;

public class Hello {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = 18;
        int b;
        b = 21;

        int c; 

        c = a + b;


        if (a>b) {
            System.out.println(a);	
        }
        else {
            System.out.println(b);	
        }

		int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int i = 1;

        while (i<=n){
            System.out.println(i + " Hello");	
            i = i + 1;
        }

        for (i = 1; i<=n; i=i+1){
            System.out.println("Hello world");	
        }


        /*
askdljalskdjalksjdlkasd \as 
        */


        // System.out.println("Hello world");	

        System.out.println(c);	
    } 
}