package homework10;

import java.util.ArrayList;

public class Box <F extends Fruit> 
{

    private ArrayList<F> fruits = new ArrayList<>();

    public void addFruit(F fruit)
    {
        fruits.add(fruit);
    }

    public float getWeight()
    {
        if (fruits.size() == 0)
        {
            return 0.0f;
        }
        float weight = fruits.size() * fruits.get(0).getWeight();
        return weight;
    }

    public boolean compare(Box<? extends Fruit> box) {
        return (this.getWeight() - box.getWeight()) < 0.0001f;
    }

    public void transfer(Box<F> box) 
    {
        for (F fruit : fruits) 
        {
            box.addFruit(fruit);               
        }
        fruits.clear();
    }
}