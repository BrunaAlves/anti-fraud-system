import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = new int[3];
        for (int i = 0; i < 3; i++) {
            firstArray[i] = scanner.nextInt();
        }
        scanner.nextLine();

        int[] secondArray = new int[3];
        for (int i = 0; i < 3; i++) {
            secondArray[i] = scanner.nextInt();
        }

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (firstArray[0] < secondArray[0] && firstArray[1] < secondArray[1] && firstArray[2] < secondArray[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (firstArray[0] > secondArray[0] && firstArray[1] > secondArray[1] && firstArray[2] > secondArray[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incompatible");
        }


    }
}