import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Toy {
    
    public String name;
    private int id;
    private int probability;
    // int count;

    public Toy(String name, int probability){
        this.name = name;
        this.probability = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    }
    
    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getProbability(){
        return this.probability;
    }

    public void setProbability(int p){
        this.probability = p;
    }

    public String toString(){
        return "Игрушка " + getName() + "Вероятность выпадения " + getProbability();
    }
}

 
 
 
 
 
 
 
