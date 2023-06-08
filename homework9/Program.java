package homework9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Program {

    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках домашнего задания,
     *  метод должен генерировать рабочих (Employee) разных типов.
     * @return
     */
    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int experience = random.nextInt(1, 10);
        int salary = random.nextInt(20000, 80000);
        if (random.nextBoolean())
        {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(2)], experience, salary);
        }
        else
        {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(2)], experience, salary);
        }

    }

    /**
     * TODO: Придумать новые состояния для наших сотрудников
     *  Придумать несколько Comparator'ов для сортировки сотрудников
     *  по фамилии + имени или по возрасту и уровню ЗП.
     * @param args
     */
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }


        
        Arrays.sort(employees, new ExpComparator());

        for(Employee employee : employees){
            System.out.println(employee);
        }

    }

}
