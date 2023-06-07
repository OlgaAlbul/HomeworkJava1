// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number: ");
        int number = sc.nextInt();
        sc.close();
        int triangularNumber = 0;
        int factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            triangularNumber+=i;
        }
        for (int i = 1; i <= number; i++) {
            factorialNumber*=i;
        }
        System.out.printf("Теугольное число равно %s , факториал равен %s", triangularNumber, factorialNumber);
    }    
}