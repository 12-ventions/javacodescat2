class Animal {
    String name = "Animal";
    Animal() { System.out.println("Animal constructor"); }
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    String name = "Dog";
    Dog() { super(); } 
    void display() {
        System.out.println(super.name); 
        super.sound(); 
    }
}
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
