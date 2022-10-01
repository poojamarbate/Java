import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int num1, num2, Addition;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = sc.nextInt();
        System.out.println("enter second number");
        num2 = sc.nextInt();
        Addition = num1 + num2;
        System.out.println("addition" + Addition);

    }

}
