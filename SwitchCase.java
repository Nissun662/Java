import java.util.Scanner;
// class Weather {
//     public static final int Summer = 1;
//     public static final int Winter = 2;
//     public static final int Fall = 3;
//     public static final int Spring = 4;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Damn it is hot outside");
                break;
            case 2:
                System.out.println("It's cold af outside");
                break;
            case 3:
                System.out.println("We all love fall season");
                break;
            case 4:
                System.out.println("Oh my god, I have a itchy nose");
                break;
            default:
                System.out.println("Invalid choice");
                break;

        }
        scanner.close();
    }
}
