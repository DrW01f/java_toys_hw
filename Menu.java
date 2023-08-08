import java.util.Scanner;

public class Menu {    
    
    public boolean key = true;
    Scanner scanner = new Scanner(System.in);

    
    while(key){
        System.out.print("""
            Введите действие:
            1. Добавление игрушки
            2. Показать список игрушек
            3. Розыгрыш игрушек
            4. Изменения частоты выпадания (имя, новая вероятность)

            0. Выход
            \s""");

        int filter = scanner.nextInt();
        
        switch (filter){
            case 1 -> {
                System.out.println("Введите название игрушки");
                String name = scanner.next();
                Toy toy = new Toy(name);
            }   
            case 2 -> {
                ToyShop.showAllToys();                
            }            
            case 3 -> {
                ToyShop.lottery();                
            }
            case 4 -> {
                String name = scanner.next();
                String probability = scanner.next();
                int probabilityInt = Integer.parseInt(probability);
                ToyShop.changeProbability(name, probabilityInt);                
            }
            case 0 -> {
                key = false;
            }
            // default -> {
            //     // break;
            //     key = false;
            // }
        }   
    } 
}
