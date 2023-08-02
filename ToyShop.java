import java.util.ArrayList;

public class ToyShop {


ArrayList <Toy> toyList;
int count = toyList.size();

public void addToy(Toy toy){
    toyList.add(toy);
}

public void changeProbability(Toy toy, int probability){
    toy.setProbability(probability);
}

}