// Реализовать простой калькулятор

package homework1;
import java.util.*;

public class task3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner (System.in);
        System.out.printf("Введите первое число:\n");
        double numberA = scanner.nextDouble();
        System.out.printf("Введите второе число:\n");
        double numberB = scanner.nextDouble();
        System.out.printf("Что нужно сделать?:\n 1 - сложить первое число на второе\n 2 - вычесть \n 3 - умножить\n 4 - поделить\n");
        double number = scanner.nextDouble();
        if (number == 1)
        {
            double res = numberA + numberB;
            System.out.printf("Результат: %f", res);
        }
        if (number == 2)
        {
            double res = numberA - numberB;
            System.out.printf("Результат: %f", res);
        }
        if (number == 3)
        {
            double res = numberA * numberB;
            System.out.printf("Результат: %f", res);
        }
        if (number == 4)
        {
            if (numberB == 0)
            {
                System.out.printf("Делить на ноль не имеет смысла, введите другое число");
            }
            else
            {
                double res = numberA / numberB;
                System.out.printf("Результат: %f", res);
            }
        }
    }
}
