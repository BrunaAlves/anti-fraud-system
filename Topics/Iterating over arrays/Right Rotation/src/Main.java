import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[(i+steps) % arr.length ] = arr[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            arr[i] = newArray[i];
        }

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}