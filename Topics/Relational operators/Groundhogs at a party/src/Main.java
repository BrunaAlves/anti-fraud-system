import java.util.Scanner;

class Main {
    private static final int TEEN = 10;
    private static final int FIFTEEN = 15;
    private static final int TWENTY = 20;
    private static final int TWENTY_FIVE = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reeseNumber = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend && reeseNumber >= FIFTEEN && reeseNumber <= TWENTY_FIVE) {
            System.out.println(true);
        } else if (!isWeekend && reeseNumber >= TEEN && reeseNumber <= TWENTY) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}