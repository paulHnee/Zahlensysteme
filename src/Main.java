import java.util.Scanner;

public class Main {
    public static String convertNumber(String input, int fromBase, int toBase) {
        try {
            long number = Long
                    .parseLong(input, fromBase);
                return Long
                        .toString(number, toBase)
                        .toUpperCase();
            } catch (NumberFormatException e) {
                return "Invalid Input!";
            }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl: ");
        String input = scanner.nextLine();

        System.out.print("Zahl von (zahl): ");
        int fromBase = scanner.nextInt();

        System.out.print("Zahl zu (zahl): ");
        int toBase = scanner.nextInt();

        //ergebnis
        String result = convertNumber(input, fromBase, toBase);
        System.out.println("Zahl ist: "+ result);

        scanner.close();
    }
}