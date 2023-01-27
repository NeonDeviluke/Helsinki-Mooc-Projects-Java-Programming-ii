
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "";
        while(true){
            number = scanner.nextLine();
            if(number.equals("end")){
                break;
            }else {
                int value = Integer.valueOf(number);
                System.out.println(value*value*value);
            }
        }
    }
}
