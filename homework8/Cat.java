package homework8;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;
    
    public Cat(String name, int appetite, Boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }


    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
 

    public boolean getSatiety() {
        return satiety;
    }


    public void setSatiety(Boolean satiety) {
        this.satiety = satiety;
    }


    public void eat(Plate plate, Cat cat)
    {
        if (plate.getFood() >= cat.getAppetite())
            {
                System.out.println("Food balance:");
                System.out.println(plate.getFood() - cat.getAppetite());
                satiety = true;
                System.out.println("Cat is full");
            }
        else
        {
            System.out.println("Food is not enough, cat is fullness");
        }
        
    }

    public void info() 
    {
        System.out.println("Cat satiety: " + satiety);
    }
}