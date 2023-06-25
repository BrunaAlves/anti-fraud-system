import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = scanner.nextInt();

        for (int i = startNumber + 1; i < 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}