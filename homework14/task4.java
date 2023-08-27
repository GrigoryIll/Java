// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package homework14;

import java.util.Scanner;

public class task4 {
    public static class Main {
        public static void main(String[] args) throws Exception {
            String str1 = "";
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            str1 = scanner.nextLine();
            if (str1.isEmpty()) {
                throw new Exception("Ошибка ввода - пустая строка! Пожалуйста, введите строку.");
            } else {
                System.out.println("Введенная строка: " + str1);
            }
        }
    }
}
