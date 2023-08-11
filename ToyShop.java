import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ToyShop {
    static Scanner scanner = new Scanner(System.in);
    static String path = "winToysLog.txt";
    public static PriorityQueue<Toy> pq = new PriorityQueue<>();    
    
    public static  void addToysToQueue() {       
        System.out.println("Введите название игрушки");
        String name = scanner.next();
        Toy toy = new Toy(name);
        pq.add(new Toy(toy.getName()));
    }
    
    public static  PriorityQueue<Toy> changeProbability(){        
        if (pq.size() > 0){      
            System.out.println("Введите название игрушки");
            String name = scanner.next();
            for (Toy toy : pq){
                if (toy.getName().equals(name)){
                    int probability = scanner.nextInt();
                    toy.setProbability(probability);
                }
                else{
                    System.out.println("Такой игрушки нет");
                }
            }
            return pq;
        }
        else { 
            System.out.println("Призы закончились, приходите в следующий раз");
            return null;
        }
    }
    
    public static  void showAllToys(){
        if (pq.size() > 0){
            System.out.println("Список доступных призов в порядке убывания вероятности: ");
            Toy elem;
            // for (int i = 0; i < pq.size(); i++) {
            //     System.out.println();
            // }
            while((elem = pq.poll())!= null){
                System.out.println(elem);
            }

            // for (int i = 0; i < pq.size(); i++) {
            //     Toy toy = pq.peek(); get(i);
            //     System.out.println(toy.toString());
            // }
        }
        else{System.out.println("Призы закончились");
        }
    }

    // public static void addToy(Toy toy){
    //     toyList.add(toy);
    // }

        
    public static  void lottery(){
        ArrayList<Toy> winToysList = new ArrayList<>();
        if (pq.size() > 0){
            System.out.println("Осталось еще" + pq.size() + "Игрушек");
            System.out.println("Желаю удачи");
            Toy winToy = pq.poll();
            winToysList.add(winToy);
            System.out.println("Поздравляю! Вы выйграли " + winToy.getName());
            for (Toy toy : winToysList){
                if (toy.getName().equals(winToy.getName())){
                    pq.remove(winToy);
                }
            }                                       
        }
        else {
            winToysList.add(null);
            System.out.println("Призы закончились, приходите в следующий раз");
        }
        try(FileWriter fw = new FileWriter(path, StandardCharsets.UTF_8, false)){
            for(Toy toy : winToysList){
                if (toy != null) {
                    fw.write(toy + "\n");
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    // public void changeProbability(Toy toy, int probability){
    //     toy.setProbability(probability);
    // }


}