public class Operadores {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 >= c2 " + (c1 >= c2));
        System.out.println("c1 < c2 " + (c1 < c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 != s2 " + (s1 != s2));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));

        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 != l2 " + (l1 == l2));
        System.out.println("l1 > l2 " + (l1 > l2));
        System.out.println("l1 =< l2 " + (l1 == l2));

        System.out.println("d1 != h1 " + (d1 != h1));
        System.out.println("d1 == h1 " + (d1 == h1));
        System.out.println("y1 != h1 " + (y1 != h1));
        System.out.println("y1 > h1 " + (y1 > h1));

        boolean b3 = true;
        boolean b4 = false;
        boolean b5 = true;
        boolean b6 = false;

        System.out.println("b3 && b4 " + (b3 && b4));
        System.out.println("b3 && b5 " + (b3 && b5));

        System.out.println("b4 || b5 " + (b4 || b5));
        System.out.println("b4 || b6 " + (b4 || b6));

        System.out.println("b3 ^ b5 " + (b3 ^ b5));
        System.out.println("b6 ^ b3 " + (b6 ^ b3));

        int i3 = 10;
        int i4 = 5;
        float f3 = 20f;
        float f4 = 50f;
        System.out.println("((i3 + i4) < (f4 - f3) " + ((i3 + i4) < (f4 - f3)));
        System.out.println("(i3 > i4) || (f4<f3) " + ((i3 > i4) || (f4 < f3)));

    }
}