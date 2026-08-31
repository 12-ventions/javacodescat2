public class WrapperDemo {
    public static void main(String[] args) {
        Integer intWrapper = Integer.valueOf(100);
        Double doubleWrapper = Double.valueOf(99.99);
        Integer num = 50; // auto-boxing
        int primitiveInt = intWrapper.intValue(); // unboxing
        System.out.println("Wrapper Integer: " + intWrapper);
        System.out.println("Wrapper Double: " + doubleWrapper);
        System.out.println("Unboxed int: " + primitiveInt);
    }
}
