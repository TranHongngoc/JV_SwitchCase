import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month: ");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("This month have 31 day");
                        break;
                    case 2:
                        System.out.println("This month have 28 or 29 day");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("This month have 30 day");
                        break;
                        default:
                            System.out.println("Cancelled!");
        }
    }
}
