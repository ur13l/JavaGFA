import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by uriel on 14/01/17.
 */
public class Main {
    public static void main(String[] args) {
        String  thisLine = null;
        try{
            // open input stream test.txt for reading purpose.
            BufferedReader br = new BufferedReader(new FileReader("/home/uriel/test.txt"));
            while ((thisLine = br.readLine()) != null) {
                System.out.println(thisLine);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
