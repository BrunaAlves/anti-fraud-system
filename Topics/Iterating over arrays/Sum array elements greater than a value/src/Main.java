import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.nextLine();
        int n = scanner.nextInt();
        int sum = 0;

        for (int i : arr) {
            if (i > n) {
                sum += i;
            }
        }

        System.out.println(sum);

    }
}