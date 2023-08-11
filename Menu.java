import java.util.Scanner;

public class Menu {    
    
    public static  void menu() {
       
        Scanner scanner = new Scanner(System.in);
            
        while(true){
            System.out.print("""
                Введите действие:
                1. Добавление игрушки
                2. Показать список игрушек
                3. Розыгрыш игрушек
                4. Изменения частоты выпадания (имя, новая вероятность)
                0. Выход
                \s""");

            String filter = scanner.next();
            if (filter.equals("1") ){
                ToyShop.addToysToQueue();
            }
            else if (filter.equals("2")){
                ToyShop.showAllToys();
            }
             else if (filter.equals("3")){
                ToyShop.lottery();
            } 
             else if (filter.equals( "4")){
                ToyShop.changeProbability();
            } 
             else if (filter.equals( "0")){
                break;
            }
             else System.out.println("Неправильная команда ");                
        } 
    }
}
