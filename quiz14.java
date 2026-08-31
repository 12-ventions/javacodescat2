public class MethodOverloadingDemo {
    public int add(int a, int b) { return a + b; }
    public int add(int a, int b, int c) { return a + b + c; }
    public double add(double a, double b) { return a + b; }
    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        System.out.println(obj.add(5, 10));
        System.out.println(obj.add(5, 10, 15));
        System.out.println(obj.add(5.5, 10.5));
    }
}
