//Вывести все простые числа от 1 до 1000

package homework1;
import java.util.*;

public class task2 
{
    public static void main(String[] args) 
    {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i <= 1000; i++)
        {
            numbers.add(i);
        }
        
        List<Integer> numbers2 = new ArrayList<Integer>();
        for (int i = 0; i <= 1000; i++)
        {
            for (int j = 2; j <=i; j++)
            {
                if (i % j == 0)
                {
                    if (i != j)
                    {   
                        numbers2.add(i);
                    }
                }        
            }
        }
        numbers.removeAll(numbers2);
        System.out.print(numbers + " ");
        System.out.println();
        System.out.print(numbers.size());
    }
}
