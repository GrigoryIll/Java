package homework12;

import java.io.FileWriter;
import java.io.IOException;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }              
                
    public void saveToJson() 
    {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) 
        {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ getClientName() + "\",\n");
            writer.write("\"product\":\""+getProduct()+"\",\n");
            writer.write("\"qnt\":"+getQnt()+",\n");
            writer.write("\"price\":"+getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } 
        catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
    }
    
}
