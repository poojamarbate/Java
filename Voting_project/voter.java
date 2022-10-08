import java.util.Scanner;

public class voter {
    public static void main(String[] args) {
        int voter;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter voter name: ");
        String name = sc.next();
        System.out.println("voter age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("voter name: " + name + " AGE: " + age + " THANK YOU FOR A PART OF THE VOTE");

        } else if (age < 18) {
            System.out.println("voter age: " + age + "\n please enter a valid age Or you are not allowed to VOTING .");
        }
    }

}
