import java.util.*;

public class TodoList {
    private ArrayList<String> tasks;
    public TodoList(){
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task){
        this.tasks.add(task);
    }
    
    public void print(){
        for(String value: tasks){
            System.out.println(tasks.indexOf(value)+ 1 + ": " + value);
        }
    }
    
    public void remove(int number){
        this.tasks.remove(number - 1);
    }
}
