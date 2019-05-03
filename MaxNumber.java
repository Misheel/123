public class MaxNumber {
  public static void main(String args[]) {
	int a = 100;
	int b = 28;
	int c = 20;

	if (a>b) {
		if (a>c){
			System.out.println(a);
		}
		else {
			System.out.println(c);
		}
	}
	else {
		if (b>c){
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}		
	}
     
  }
}