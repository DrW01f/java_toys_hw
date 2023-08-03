import java.util.Scanner;

public class Menu {
    
    Scanner scanner = new Scanner(System.in);
    boolean key = true;
    while (key){
    findMenu();
    int filter = scanner.nextInt();
    
    switch (filter){
        case 1 -> {
            System.out.println("Введите стоимость");
            String coast = scanner.next();
            for(Notebook note: notebookss){
                if (note.getcoast() == Integer.parseInt(coast)){
                    System.out.println(note);
                }                
            } 
        }               
        case 2 -> {
            System.out.println("Введите объем оперативной памяти");
            String ramCount = scanner.next();
            for(Notebook note: notebookss){
                if (note.getramCount() == Integer.parseInt(ramCount)){
                    System.out.println(note);
                }                
            }
        }
        case 3 -> {
            System.out.println("Введите объем жеского диска");
            String hardDriveCount = scanner.next();
            for(Notebook note: notebookss){
                if (note.gethardDriveCount() == Integer.parseInt(hardDriveCount)){
                    System.out.println(note);
                }                
            }
        }
        case 4 -> {
            System.out.println("Введите операционную систему");
            String operationSystem = scanner.next();
            for(Notebook note: notebookss){
                if (note.getoperationSystem().equals(operationSystem)){
                    System.out.println(note);
                }                
            }
        }
        case 5 -> {
            System.out.println("Введите цвет");
            String color = scanner.next();
            for(Notebook note: notebookss){
                if (note.getcolor().equals(color)){
                    System.out.println(note);
                }                
            }
        }
        case 6 -> {
            System.out.println("Введите объем видеокарты");
            String videoCardCapacity = scanner.next();
            for(Notebook note: notebookss){
                if (note.getvideoCardCapacity() == Integer.parseInt(videoCardCapacity)){
                    System.out.println(note);
                }                
            }
        }
        default -> {
            key = false;
        }
    }     

    } 

}
