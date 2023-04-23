// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package homework3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < 5; i++)
        {
            numbers.add(i, random.nextInt(10));
        }
        System.out.println(numbers);

        numbers.removeIf(num -> (num % 2 == 0));
        for (int num : numbers){}
        System.out.println(numbers);
    }    
}
