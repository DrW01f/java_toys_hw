import java.util.ArrayList;

public class Toy {
    
    public String name;
    private int id;
    private int probability;
    // int count;

    public Toy(String name, int probability){
        this.name = name;
        this.probability = probability;
    }
    
    public int getID(){
        return this.id;
    }

    public int getProbability(){
        return this.probability;
    }

    public void setProbability(int p){
        this.probability = p;
    }
}

 
 
 
 
 
 
 
