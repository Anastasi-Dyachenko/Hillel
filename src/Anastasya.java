import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Anastasya {
    public static void main(String[] args) {
        System.out.println("Введите строку ");
        Scanner scan = new Scanner(System.in);
        String stroka = scan.nextLine();

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(stroka);
while (matcher.find()) {
    System.out.println(stroka.substring(matcher.start(), matcher.end()));

}
        }
    }

