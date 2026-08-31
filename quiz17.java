public class ExceptionDemo {
    public static void main(String[] args) {
        try { int r = 10 / 0; } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }
        try { String s = null; s.length(); } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
        try { int[] a = {1,2,3}; int x = a[5]; } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }
}
