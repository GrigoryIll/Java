// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package homework5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task2 {
    public static void main(String[] args) {
        String persons = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        persons = persons.replace(",", "");
        String[] names = persons.split(" ");

        List<String> result = new ArrayList<>(Arrays.asList(names));
        List<String> resultFinal = new ArrayList<>();
        for (int i = 0; i < result.size(); i++)
        {
            if(i%2 == 0)
            {   
                resultFinal.add(result.get(i));
                i++;
            }
            else
            {
                result.remove(result.get(i));
            }
        }

        Map<String, Integer> counter = new HashMap<>();
        for (String x : resultFinal)
        {
            if(counter.containsKey(x))
            {
                int value1 = counter.get(x);
                counter.put(x, value1 + 1);
            }
            else {
                counter.put(x, 1);
            }
        } 
        System.out.println(counter);

        List<String> list1 = new ArrayList<>(counter.keySet());
        Collections.sort(list1,(a, b) -> counter.get(b) - counter.get(a));
        for (String key: list1)
        {
            System.out.println(key + "=" + counter.get(key));
        }
    }
}
