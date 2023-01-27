import java.util.Scanner;

public class Interface {
    private Container container1;
    private Container container2;
    private Scanner scanner;
    
    public Interface(Container container1, Container container2, Scanner scanner){
        this.container1 = container1;
        this.container2 = container2;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true) {
            System.out.println("First:" + container1);
            System.out.println("Second:" + container2);
            System.out.print("> ");
            
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                container1.add(amount);
            }
            
            if(command.equals("remove")){
                container2.remove(amount);
            }
            
            if(command.equals("move")){
                if(container1.contains() - amount < 0){
                    container2.add(container1.contains());
                    container1.remove(amount);
                }else{
                    container1.remove(amount);
                    container2.add(amount);
                }
            }
        }
    }
}
