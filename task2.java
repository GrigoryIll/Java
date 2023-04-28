// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, 
// не удаляя.

import java.util.LinkedList;
import java.util.List;

public class task2 
{
    private static List<Integer> list1 = new LinkedList<>();
    public static void main(String[] args) 
    {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        dequeue(0);
        first(0);
        for (int i = 0; i < list1.size(); i++){}
        System.out.println(list1);
    }

    public static void enqueue(int item)
    {
        list1.add(item);
    }

    public static List<Integer> dequeue(int item)
    {
        list1.remove(0);
        System.out.println("Был удален первый элемент из очереди");
        return list1;
    }
    
    public static List<Integer> first(int item)
    {
        System.out.println("Первый элемент в очереди: " + list1.get(0));
        return list1;
    }
    
}
