// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package homework1;
import java.util.*;

public class task1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Введите число:\n");
        int number = scanner.nextInt();
        int summa = 0;
        int multip = 1;
        for (int i = 1; i <= number; i++)
        {
            summa += i;
            multip *= i;
        }
        System.out.printf("Сумма чисел от 1 до n: %d", summa);
        System.out.println();
        System.out.printf("Произведение чисел от 1 до n: %d", multip);
    }
}
