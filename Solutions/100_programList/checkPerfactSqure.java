public class checkPerfactSqure {
    public static void main(String[] args) {
        int n = 5;

        int start = 1;
        for(start=1;start*start<=n;start++){}

        System.out.println(start-1);
    }
}
