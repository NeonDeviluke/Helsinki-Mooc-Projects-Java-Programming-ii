
import java.util.Scanner;

public class LiquidContainers2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();
        
        Interface UI = new Interface(container1, container2, scan);
        UI.start();
        
    }
    
}
