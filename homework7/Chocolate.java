package homework7;

public class Chocolate extends Product {

    private int cocoaСontent; //содержание какао
    private int mass; // вес
    private String type; //белый, молочный, горький

    public void setcocoaContent(int cocoaСontent)
    {
        this.cocoaСontent = cocoaСontent;
    }

    public int getcocoaСontent()
    {
        return cocoaСontent;
    }

    public void setMass(int mass)
    {
        this.mass = mass;
    }

    public int getMass()
    {
        return mass;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public Chocolate(String name, String brand, double price, int cocoaСontent, int mass, String type)
    {
        super(brand, name, price);
        this.cocoaСontent = cocoaСontent;
        this.mass = mass;
        this.type = type;
    }

    @Override
    public String displayInfo()
    {
        return String.format("Шоколад %s-%s-%f, какао: %d, вес: %d, разновидность: %s", brand, name, price, cocoaСontent, mass, type);
    }
}
