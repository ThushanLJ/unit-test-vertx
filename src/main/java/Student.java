import java.text.DecimalFormat;
import java.util.HashMap;

public class Student {

    private HashMap<Character, Double> gpaMap;

    public Student(HashMap<Character, Double> gpaMap) {
        this.gpaMap = gpaMap;
    }

    private double credit(char i){
        double val = 0;

        if(i == 'A')
            val = 4.0;
        else if(i == 'B')
            val = 3.0;
        else if(i == 'C')
            val = 2.0;
        else if(i == 'D')
            val = 1.0;
        else
            val = 0.0;

        return val;
    }

    public String calculateGPA(){

        DecimalFormat df = new DecimalFormat("#.##");

        double mul = 0;
        double credits = 0.0;

        for(Character i : gpaMap.keySet()){
            mul = mul + credit(i)*gpaMap.get(i);
            credits = credits + gpaMap.get(i);
        }

        if(credits != 0.0) {
            return df.format(mul / credits);
        }else{
            return "EROR";
        }
    }

    public static void main(String[] args){
         System.out.println("Hello");
    }
}
