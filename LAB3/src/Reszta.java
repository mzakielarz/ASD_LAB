import java.util.Scanner;

public class Reszta {
    Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        final int[] M = {500,200,100,50,20,10,5,2,1};
        int zl, gr, r, i = 0;
        int[] ile_monet = new int[9];
        r = 2137;
        while (r > 0)
        {
            if (r >= M[i])
            {
                System.out.print(M[i]/100.0 + " ");
                r = r - M[i];
               ile_monet[i]++;
            }
            else
                i++;
        }
        System.out.println();
        for (int j = 0; j < M.length ; j++) {
            System.out.println("Nominał "+M[j]+" wydany będzie:"+ile_monet[j]);
        }

    }
}
