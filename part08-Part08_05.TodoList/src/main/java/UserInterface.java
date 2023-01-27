
import java.util.Scanner;


public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            
            
            if(input.equals("add")){
                System.out.println("To add:");
                String value = scanner.nextLine();
                list.add(value);
            }
            
            if(input.equals("list")){
                list.print();
            }
            
            if(input.equals("remove")){
                System.out.println("Which one is removed?");
                int value = scanner.nextInt();
                list.remove(value);
            }
        }
    }
    
}
