package homework12;

public class Program 
{


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) 
    {
        InfoFromConsole console = new InfoFromConsole();
        System.out.println("Order:");
        String clientName = console.prompt("Client name: ");
        String product = console.prompt("Product: ");
        int qnt = console.promptInt("Quantity: ");
        int price = console.promptInt("Price: ");
        Order order = new Order(clientName, product, qnt, price);
        order.saveToJson();
        
    }
}
