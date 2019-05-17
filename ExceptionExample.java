
public class ExceptionExample {
  public static void main(String args[]) {
      int a[] = new int[3];
      try {
        System.out.println(a[10]);    
        Animal animal = null;
        animal.eat();
      }
      catch (NullPointerException n){
        try {
          int b[] = new int[3];
          System.out.println(b[10]);              
        }
        catch (NullPointerException n){
        
        // handle null
        }

        // handle null
      }
      catch (Exception e) {
          System.out.println("Aldaa garlaa");              
      }

      System.out.println("After try");    
      
  }
}
