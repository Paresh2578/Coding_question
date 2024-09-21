class p3{
    public static void main(String[] args) {
        int h=12,m=30;

        double m_ungle = m*6;
        double h_angle = h*30 + (m*0.5);


        double ans =Math.abs(h_angle - m_ungle);

        if(ans > 180){
            ans = 360 - ans;
        }

        System.out.print(ans);
    }
}