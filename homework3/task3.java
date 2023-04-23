// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.

package homework3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class task3 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(35);
        numbers.add(6);
        numbers.add(17);
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
        int minimum = numbers.get(numbers.size() - numbers.size());
        int maximum = numbers.get(numbers.size() - 1);

        double sum = 0;
        for (Integer num : numbers)
        {
            sum += num;
        }
        System.out.println("Минимальное число в списке: " + minimum);
        System.out.println("Максималное число в списке: " + maximum);
        System.out.println("Среднее списка: " + sum/numbers.size());

    }    
}
