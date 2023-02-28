public class Lab_1_2 {
    private static double x;
    public static void main(String[] args) {
        double y=0;
        x=3;
        while (x<=5){
            if (x<4) {
                y=Math.sin(x+3);
            }
            else{
                y=Math.log(x+2);
            }
            System.out.println(" y="+y+ "; x="+x);
            x+=0.25;
        }
    }
}
