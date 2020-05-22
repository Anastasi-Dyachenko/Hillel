import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Homework3760 {
    interface Stroka {
        String strokaFunctional(String s);
    }

    public static void main(String[] args) throws Exception {
        Stroka reverseS = (s) -> {
            String result = "";
            for(int i = s.length()-1; i >=0; i--)
                result += s.charAt(i);
            return result;

        };

        System.out.println(reverseS.strokaFunctional("abcd"));
    }

}
