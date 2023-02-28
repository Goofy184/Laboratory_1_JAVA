public class Lab_1_1 {
    private static double x;
    public static void main(String[] args) {
        double y=50;
        x=30;
        System.out.println(" +--------------------+------+");
        while(x<=50)
        {
            y = Math.pow((Math.pow(x, 2) + 2 * x), 0.7);
            System.out.println(" |y="+y+ "|x="+x+"|");
            System.out.println(" +--------------------+------+");
            x+=2.5;
        }
    }
}
