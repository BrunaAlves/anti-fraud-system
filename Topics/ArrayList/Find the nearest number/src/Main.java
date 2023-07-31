import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String[] lineInArray = scanner.nextLine().split("\\s+");
        int[] valuesArr = Arrays.stream(lineInArray).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbersInput = Arrays.stream(valuesArr) .boxed() .collect(Collectors.toList());
        Collections.sort(numbersInput);

        int numberToCheck = scanner.nextInt();

        List<Integer> numbersOutput = new ArrayList<>();

        int lastValueAdded = numbersInput.get(0);

        for (int i = 1; i < numbersInput.size(); i++) {
            int currentNumber = numbersInput.get(i);
            if (Math.abs(numberToCheck - currentNumber) <  Math.abs(numberToCheck - lastValueAdded)) {
                lastValueAdded = currentNumber;
                if (!numbersOutput.isEmpty()) {
                    numbersOutput.removeIf(n -> n == numbersOutput.get(numbersOutput.size()-1));
                    numbersOutput.add(currentNumber);
                } else {
                    numbersOutput.add(currentNumber);
                }

            } else if (Math.abs(numberToCheck - currentNumber) ==  Math.abs(numberToCheck - lastValueAdded)) {
                if (numbersOutput.isEmpty()) {
                    numbersOutput.add(currentNumber);
                    numbersOutput.add(lastValueAdded);
                } else {
                    lastValueAdded = currentNumber;
                    numbersOutput.add(currentNumber);
                }
            }

        }

        System.out.println(numbersOutput.stream().map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}