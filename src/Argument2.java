import java.util.Scanner;

public class Argument2 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа и математическое обычное действие, которое хотите применить к числам. Вводите компьтерные обозначанеия.");
        Scanner scan = new Scanner(System.in);
        int result = 0;
        int a = scan.nextInt();
        int b = scan.nextInt();
        String symvol  = scan.next(); // это символ(действие над цифрами
       if (symvol.equals("*")){
           result = a*b;
        }
      else  if (symvol.equals("/")){
            result = a/b;
        }
       else  if (symvol.equals("+")){
            result = a+b;
        }
        else if (symvol.equals("-")){
            result = a-b;
        }
else  {
            System.out.println("Действие не выполняется, так как кто-то схитрил!!!");

        }
        System.out.println(result);
    }
}
