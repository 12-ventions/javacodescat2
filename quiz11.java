public class JavaCharacteristicsDemo {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        try { int r = 10 / 0; } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
        System.out.println(p);
    }
}
class Person {
    private String name; private int age;
    Person(String n, int a) { name = n; age = a; }
    public String toString() { return "Name: " + name + ", Age: " + age; }
}
