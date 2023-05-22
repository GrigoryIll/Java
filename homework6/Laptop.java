// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.

package homework6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Laptop
{
    String model;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String color;
    
    public Laptop(String model, Integer ram, Integer hdd, String os, String color)
    {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Your laptop: " + "model - " + model;
    }

    public static void main(String[] args) 
    {
        Set<Laptop> shop = new HashSet<>();
        shop.add(new Laptop("asus01", 8, 128, "win", "black"));
        shop.add(new Laptop("asus02", 8, 256, "win", "black"));
        shop.add(new Laptop("asus03", 16, 256, "mac", "grey"));
        shop.add(new Laptop("asus04", 16, 512, "win", "black"));
        shop.add(new Laptop("asus05", 32, 128, "mac", "silver"));

        Map<String, Object> requests = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите сколько необходимо оперативной памяти:\n");
        String ram = scanner.nextLine();
        if (!ram.isEmpty()) 
        {
            Integer ramGB = Integer.parseInt(ram);
            requests.put("ram", ramGB);
        }
                                                                            
        System.out.println("Введите сколько необходимо HDD памяти:\n");
        String hdd = scanner.nextLine();
        if (!hdd.isEmpty()) 
        {   
            Integer hddGB = Integer.parseInt(hdd);
            requests.put("hdd", hddGB);
        }      
                                
        System.out.println("Введите какую операционную систему вы хотите:\n");
        String os = scanner.nextLine();
        if (!os.isEmpty()) 
        {
            requests.put("os", os);
        }

        System.out.println("Введите цвет корпуса:\n");
        String color = scanner.nextLine();
        if (!color.isEmpty()) 
        {
            requests.put("color", color);
        }
        System.out.println(requests);

        int ramGB = requests.containsKey("ram") ? (int) requests.get("ram") : 0;
        int hddGB = requests.containsKey("hdd") ? (int) requests.get("hdd") : 0;

        for (Laptop laptop : shop)
        {
            if (laptop.ram >= ramGB
            && laptop.hdd >= hddGB
            && (os.isEmpty() || laptop.os.equals(os))
            && (color.isEmpty() || laptop.color.equals(color)))
            System.out.println(laptop);
        }
    }    
}
