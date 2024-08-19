// WAP to find a power a^b (without using power and multiplication operation)

public class p20 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int result = 1;
        for (int i = 1 ;i <= y; i++) {
            result *= x;
        }
        System.out.println(result);
    }
}
