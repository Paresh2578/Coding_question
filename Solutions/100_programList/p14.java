// problem 14:  WAP to calculate an angle between hour and minute hand. (Hours and minutes should be taken from user).

public class p14 {
    public static void main(String[] args) {
        int h = 1 , m =24;
        
        double minAngle = (m * 6);
        double hourAngle = (h * 30) + (m * 0.5);

        double angle = Math.abs(minAngle - hourAngle);

        if(angle > 180){
            angle = 360 - angle;
        }

        System.out.println(angle);
    }
}
