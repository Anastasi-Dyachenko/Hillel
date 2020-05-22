import java.util.Scanner;

public class Argument {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа и обычное математическое действие, которое будет проведено над ними. ");
        Scanner scan = new Scanner(System.in);
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        char b = scan.next().charAt(0); // это символ(действие над цифрами
        int result;
        switch (b){
            case '+' :
              result=a2+a1;
              break;
            case '-' :
                result=a1-a2;
                break;
            case '*' :
                result=a2*a1;
                break;
            case ':'  :
                result=a1/a2;
                break;
            case '/'  :
                result=a1/a2;
                break;
            default :
                System.out.println("Ну попросили же вводить обычные математические действия, что Вы тут выделываете");
                result =0;

        }
        System.out.println(result);
    }
}
