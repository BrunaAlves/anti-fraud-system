import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();

            if(value == -1) {
                smaller++;
            }else if(value == 0) {
                perfect++;
            }else if(value == 1) {
                larger++;
            }
        }

        System.out.println(perfect  + " " +larger + " " + smaller);
    }
}