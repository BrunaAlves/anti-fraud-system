class Main {
    private static int THREE = 3;
    private static int NINE = 9;
    private static int TWELVE = 12;

    public static void main(String[] args) {

        for (int i = THREE; i <= TWELVE; i+= THREE) {
            if (i <= NINE) {
                System.out.println(String.format("%d %d %d", i-2 , i-1 , i));
            } else {
                System.out.println("* 0 #");
            }


        }

    }
}