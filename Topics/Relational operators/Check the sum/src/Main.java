import java.util.Scanner;

class Main {
    private static int TWENTY = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 + num2 == TWENTY || num2 + num3 == TWENTY || num1 + num3 == TWENTY) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}