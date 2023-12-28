public class first {
    public static void main(String[] args) {
        final int a = 0;
        final int b = 0;
        final int n = 0;
        final int m = 4;
        final int C = 1;// 1303%3 =1=C ; O1="-" ;O2="+" ;C7=1=> sort i,j ;
        double s = 0;

        if (a < 2) {
            System.out.println("Division by zero!");
        } else {
            for (short i = a; i <= n; i++) {
                for (short j = b; j <= m; j++) {
                    s += (double) (i + j) / (i - C);
                }
            }
            System.out.println("S=" + s);
        }
        System.out.println(3 / 2);
    }
}