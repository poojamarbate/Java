class Arithmetic_opertion {
    public void Addition(int a, int b) {
        int result = a + b;
        System.out.println("addition " + result);
    }

    public void Addition(String a, String b) {
        String result = a + b;
        System.out.println("concation of two strings " + result);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Arithmetic_opertion op = new Arithmetic_opertion();
        op.Addition(12, 12);
        op.Addition("pooja", "marbate");
    }
}
