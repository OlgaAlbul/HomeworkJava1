// 3) Реализовать простой калькулятор (+-/*)
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int number = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.printf("Enter an action: ");
        String action = sc2.nextLine();
        switch (action) {
            case "+":
                System.out.printf("Enter number: ");
                int number2 = sc.nextInt();
                System.out.println(number+number2);
                break;
            case "-":
                System.out.printf("Enter number: ");
                int number3 = sc.nextInt();
                System.out.println(number-number3);
                break;
            case "*":
                System.out.printf("Enter number: ");
                int number4 = sc.nextInt();
                System.out.println(number*number4);
                break;
            case "/":
                System.out.printf("Enter number: ");
                int number5 = sc.nextInt();
                System.out.println(number/number5);
                break;
            default:
                System.out.printf("Unknown command");
                break;
        }
        sc.close();
        sc2.close();
    }
}
