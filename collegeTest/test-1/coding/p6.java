public class p6 {
    public static void main(String[] args) {
        System.out.print("Pronic numbers between 1 to 100: ");
        for (int i = 0; i < 100; i++) {
            if (isPronic(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPronic(int num) {
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) return true;
        }
        return false;
    }
}
