package homework12;

import java.util.Scanner;

public class InfoFromConsole 
{    

    public String prompt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextLine();
    }

    public int promptInt(String message) {
    Scanner in = new Scanner(System.in);
    System.out.print(message);
    return in.nextInt();
    }                 
                
}
