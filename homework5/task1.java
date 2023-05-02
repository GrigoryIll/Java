// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        List <String> ivanovAnrei = new ArrayList<String>();
        ivanovAnrei.add("123-456");
        ivanovAnrei.add("123-458");

        List <String> petrovValerii = new ArrayList<String>();
        petrovValerii.add("789-456");

        Map<String, List<String>> book = new HashMap<>();
        book.put("Иванов Андрей", ivanovAnrei);
        book.put("Петров Валерий", petrovValerii);


        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите фамилию и имя в формате Иванов Иван:\n");
        String name = scanner.nextLine();

        for (Map.Entry<String, List<String>> pair : book.entrySet()) {
            if (pair.getKey().equals(name)) {
                System.out.println("Имя: " + pair.getKey() + ", Тел: " + pair.getValue());
            }
        }
        
        scanner.close();
    }
}
