import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalDesk = 0;
        
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        totalDesk = class1 / 2 + class1 % 2 + 
            class2 / 2 + class2 % 2 + 
            class3 / 2 + class3 % 2;

        System.out.println(totalDesk);
    }
}
