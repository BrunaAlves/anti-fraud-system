import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int between1 = scanner.nextInt();
        int between2 = scanner.nextInt();

        if(between1>between2){
            boolean isBetween = value <= between1 && value >= between2;
            System.out.println(isBetween);
        }else{
            boolean isBetween = value <= between2 && value >= between1;
            System.out.println(isBetween);
            
        }
    }
}
