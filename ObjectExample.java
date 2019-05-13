public class ObjectExample{
  public static void main(String args[]) {
      Animal nancy = new Animal("Nancy");      
      nancy.setAge(3);
      System.out.println(nancy.getName());      			     
      nancy.eat();

      Animal bobi = new Animal("Bobi", 2);

      Animal cat1 = new Animal();

  }
}