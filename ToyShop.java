import java.util.ArrayList;
import java.util.PriorityQueue;

public class ToyShop {

    static ArrayList <Toy> toyList = new ArrayList<>();

    String path = "winToysLog.txt";
    private PriorityQueue<Toy> pq = new PriorityQueue<>();

    public PriorityQueue<Toy> addToysToQueue(Toy toy) {
        for (int i = 0; i < toyList.size(); i++) {
            pq.add(new Toy(toy.getName()));
        }
        return pq;
    }

    public PriorityQueue<Toy> changeProbability(String name, int probability){
        for (Toy toy : pq){
            if (toy.getName().equals(name)){
                toy.setProbability(probability);
            }
        }
        return pq;
    }


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

        
    public void lottery(){
        ArrayList<Toy> winToysList = new ArrayList<>();
        if (toyList.size() > 0){
            System.out.println("Осталось еще" + toyList.size() + "Игрушек");
            System.out.println("Желаю удачи");
            Toy winToy = pq.poll();
            winToysList.add(winToy);                     
            // return toyList.remove(0);
        }
        else {
            winToysList.add(null);
            System.out.println("Призы закончились, приходите в следующий раз");
        }
    }
    

    // public void changeProbability(Toy toy, int probability){
    //     toy.setProbability(probability);
    // }


    // public Toy cheatLottery(String name){
    //     if (toyList.size() > 0){
    //         for (int i = 0; i < toyList.size(); i++) {
    //             Toy toy = toyList.get(i);
    //             if (toy.getName().equals(name)) {
    //                 System.out.println("Поздравляю! Вы выиграли именно ту игрушку, котолрую хотели!");
    //                 return toyList.remove(i);
    //             }
    //         }
    //     }
    //     System.out.println("Призы закончились");
    //         return null; 
// }

}