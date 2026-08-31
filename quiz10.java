public class ControlStructuresDemo {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) System.out.println("Adult");
        else System.out.println("Minor");
        for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }
    }
}
