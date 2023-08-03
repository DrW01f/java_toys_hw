import java.util.ArrayList;

public class ToyShop {


static ArrayList <Toy> toyList = new ArrayList<>();



public static void addToy(Toy toy){
    toyList.add(toy);
}

public void showAllToys(){
    if (toyList.size() > 0){
        System.out.println("Список доступных призов: ");
        for (int i = 0; i < toyList.size(); i++) {
            Toy toy = toyList.get(i);
            System.out.println(toy.toString());
        }
    }
    else{System.out.println("Призы закончились");
    }
}


public void changeProbability(Toy toy, int probability){
    toy.setProbability(probability);
}

public Toy lottery(){
    if (toyList.size() > 0){
        System.out.println("Осталось еще" + toyList.size() + "Игрушек");
        System.out.println("Желаю удачи");
        return toyList.remove(0);
    }
    System.out.println("Призы закончились, приходите в следующий раз");
        return null; 
}

public Toy cheatLottery(String name){
    if (toyList.size() > 0){
        for (int i = 0; i < toyList.size(); i++) {
            Toy toy = toyList.get(i);
            if (toy.getName().equals(name)) {
                System.out.println("Поздравляю! Вы выиграли именно ту игрушку, котолрую хотели!");
                return toyList.remove(i);
            }
        }
    }
    System.out.println("Призы закончились");
        return null; 
}

}