import java.util.Random;

public class Zgadywanie {
    static int N;

    public static void main(String[] args) {
        Random rand = new Random();
        N = rand.nextInt(1000);
        System.out.println(N);
        zgadywanie(0, 1000);
    }
    public static void zgadywanie(int a, int b) {

        int x = (a == 0) ? (a + b + 1) / 2 : (a + b) / 2;
        System.out.println("Myślisz o: " + x+" ?");
        if (x == N) {
            System.out.println("TAK");
            return;
        }
        if (x > N) {
            System.out.println("Szukam mniejszej liczby");
            zgadywanie(a, x - 1);
        } else {
            System.out.println("Szukam większej liczby");
            zgadywanie(x + 1, b);
        }


    }
}