
import java.util.concurrent.ThreadLocalRandom;

public class Toy implements Comparable<Toy>{
    private int id= 5;
    public String name;
    private int probability;
    private static int count = 1;

    public Toy(String name){
        this.id = count++;
        // giveID();
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

    @Override
    public int compareTo(Toy t) {
        if (this.probability < t.probability) 
            return 1;
        else if (this.probability > t.probability) 
            return -1;
        else 
            return 0;
    }

    public String toString(){
        return "Id " + getID() + " Игрушка " + getName() + " Вероятность выпадения: " + getProbability() + "%";
    }
}

 
 
 
 
 
 
 
