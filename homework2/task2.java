// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл

import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

public class task2 
{   
    private static final Logger logger = Logger.getLogger(task2.class.getName());  
    public static void main(String[] args) throws IOException
    {   
        Handler fh = new FileHandler("log.log");
        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
        int[] arr ={62, 84, 32, 5, 71};
        for(int i = 0 ; i < arr.length - 1; i++)
        {
            for(int j = 0 ; j < arr.length - i - 1; j++)
            {   
                if( arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        logger.log(Level.INFO,"Промежуточный результат на " + (i+1) + " итерации:" + Arrays.toString(arr));  
        }
    System.out.print(Arrays.toString(arr));
    }   
}
