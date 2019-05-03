public class MethodExample {
  public static void main(String args[]) {
      greeting("Bold");
      greeting("Sarnai");
      greeting("Nomin");


      int a = sum(12, 45);
      System.out.println(a);

      System.out.println(fact(5));
  }

    static void greeting(String name){
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you");
        System.out.println();
    }

    /* aksljdalksdjlaks    
        2 toonii
        niilber
     */
    static int sum(int a, int b){
        int c = a + b;        
        return c;        
    }

    // Энэ функц бол факториал
    static int fact(int n) {
        if (n==1) {
            return 1;
        }
        else {
            return n * fact(n-1); // Үндсэн томъёо
        }        
    }

}