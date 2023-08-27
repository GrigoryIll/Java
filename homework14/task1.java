/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

package homework14;

import java.util.Scanner;

public class task1 {

    public static class Main {
        public static void main(String[] args) {
            float number = getFloatNum();
            System.out.println("Введенное число: " + number);
        }

        public static float getFloatNum() {
            float number;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {
                    System.out.print("Введите дробное число: ");
                    number = Float.parseFloat(scanner.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Ошибка ввода! Пожалуйста, введите дробное число.");
                }
            }
            return number;
        }
    }

}
