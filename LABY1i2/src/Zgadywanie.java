import java.util.Random;

public class Zgadywanie {

    private static int N; //szukana liczba
    private static final int A = 0;//początek przedziału
    private static final int B = 1000;//koniec przedziału


    public static void main(String[] args) {
        Random rand = new Random();
        N = rand.nextInt(B);
        System.out.println("OSOBA A: Pomyślałem o liczbie z przedziału " + A + "-" + B);
        System.out.println("OSOBA A :Zgadnij co to za liczba");
        System.out.println(N);
        search(A, B);
    }

    public static void search(int a, int b) {

        int x = (a == 0) ? (b + a + 1) / 2 : (b + a) / 2; //x to środek przedziału
        System.out.println("OSOBA B: Czy ta liczba to " + x + "?");
        if (x == N) {
            System.out.println("OSOBA A: TAK");
            return;
        }

        if (x > N) {
            System.out.println("OSOBA A: ZA DUŻA");
            search(a, x - 1);
        } else {
            System.out.println("OSOBA A: ZA MAŁA");
            search(x + 1, b);
        }

    }
}