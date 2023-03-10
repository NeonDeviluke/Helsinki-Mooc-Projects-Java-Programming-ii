import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashmap;
    
    public IOU(){
        this.hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        for(String name: hashmap.keySet()){
            if(name.equals(toWhom)){
                return hashmap.getOrDefault(name, 0.00);
            }
        }
        return 0;
    }
}
