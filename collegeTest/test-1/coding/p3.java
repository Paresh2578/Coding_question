class p3{
    public static void main(String[] args) {
        int hours = 3 , minit = 30;

        double mA = (minit*6);
        double hA = (hours*30) + (minit*0.5);

        double ans = Math.abs(hA - mA);

        if(ans > 180){
            ans -= 180;
        }

        System.out.println(ans);
    }
}