import java.io.IOException;
import java.util.Scanner; 


public class ConversaoDeTempo {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int timeInSecond = sc.nextInt();
        
        int hours = timeInSecond / 3600;
        timeInSecond = timeInSecond % 3600;
        int minutes = timeInSecond / 60;
        timeInSecond = timeInSecond % 60;
        
        System.out.println(hours+":"+minutes+":"+timeInSecond);
        
        
        sc.close();
    }
 
}