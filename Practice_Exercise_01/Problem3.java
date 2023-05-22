package Practice_Exercise_01;

public class Problem3 {
    public static void main(String[] args){
        //3. Declare 5 variables as below
        byte c2 = 20;
        short d2 = 123;
        long e2 = 1362442;
        float a2 = 12.3f;
        double b2 = 52.82;
        int f2 = 44;

        short result = (short)e2;
        short result_2 = (short) (c2 - e2);
        short result_3 = (short) (e2 - a2);
        System.out.println(result);
        System.out.println(result_2);
        System.out.println(result_3);

        //Try other combinations of long to int, int to short, double to float, float to byte -- reducing.
        int r = (int)e2;
        int r1 = d2;
        float r2 = (float)b2;
        byte r3 = (byte) a2;
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        // Try other combination of int to long , short to long, float to double, byte to float -- expanding.
        long r4 = f2;
        long r5 = d2;
        double r6 = a2;
        float r7 = c2;
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);

    }
}
