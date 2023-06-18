package homework12;

import java.util.Scanner;

public class InfoFromConsole 
{    

    public static String prompt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextLine();
    }

    public static int promptInt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextInt();
    }

    public static void inputConsole(Order order)
    {   
        System.out.println("Order:");             
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(promptInt("Quantity: "));
        order.setPrice(promptInt("Price: "));      
    }
}
