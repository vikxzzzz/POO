public class Programa {
    public static void main(String[] args) {

        int i, j, k;
        i = 10;
        j = i++;
        k = ++j;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        int a, b, c;
        a = 12;
        b = ++a;
        c = ++b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
