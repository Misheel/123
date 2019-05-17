

public class Bird extends Animal {    
    
    public void fly() {        
        System.out.println(this.getName() + " is flying");
    }    

    public void eat() {      
        super.eat();          
        System.out.println("bird is eating");
    }    

    public void sleep() {              
        System.out.println("bird is sleeping");
    }        
}

