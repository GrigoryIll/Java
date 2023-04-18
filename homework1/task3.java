// Реализовать простой калькулятор

package homework1;
import java.util.*;

public class task3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Введите первое число:\n");
        int numberA = scanner.nextInt();
        System.out.printf("Введите второе число:\n");
        int numberB = scanner.nextInt();
        System.out.printf("Что нужно сделать?:\n 1 - сложить первое число на второе\n 2 - вычесть \n 3 - умножить\n 4 - поделить\n");
        int number = scanner.nextInt();
        if (number == 1)
        {
            int res = numberA + numberB;
            System.out.printf("Результат: %d", res);
        }
        if (number == 2)
        {
            int res = numberA - numberB;
            System.out.printf("Результат: %d", res);
        }
        if (number == 3)
        {
            int res = numberA * numberB;
            System.out.printf("Результат: %d", res);
        }
        if (number == 4)
        {
            int res = numberA / numberB;
            System.out.printf("Результат: %d", res);
        }
    }
}
