// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package homework4;

import java.util.LinkedList;
import java.util.List;

public class task1 
{
    private static List<String> list1 = new LinkedList<>();
    public static void main(String[] args) 
    {
        list1.add("cat");
        list1.add("dog");
        list1.add("man");
        list1.add("bird");
        list1.add("elephant");
        System.out.println(list1); 
        System.out.println(descend());         
    }
    
    public static List<String> descend()  
    {
    List<String> list2 = new LinkedList<>();
    for (int i = 0; i <= list1.size() - 1; i++)
    {
        list2.add(i, list1.get(list1.size()- 1 - i));       
    }
    return list2;    
    }
    
}
