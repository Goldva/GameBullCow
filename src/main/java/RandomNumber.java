import java.util.Random;

public class RandomNumber {
    private static Random random = new Random();
    public static String getNumber(){
        StringBuilder result = new StringBuilder();
        int num;
        while (result.length() != 4){
            num = random.nextInt(10);
            if (result.indexOf(String.valueOf(num)) == -1){
                result.append(num);
            }
        }
        return result.toString();
    }
}
