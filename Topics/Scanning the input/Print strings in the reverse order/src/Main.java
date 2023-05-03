import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> values = new ArrayList<>();
        values.add(scanner.next());
        values.add(scanner.next());
        values.add(scanner.next());

        for (int i = values.size() - 1; i >= 0; i--) {
            System.out.println(values.get(i));
        }

    }
}