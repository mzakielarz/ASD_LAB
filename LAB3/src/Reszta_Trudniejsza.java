public class Reszta_Trudniejsza {
    public static void main(String[] args) {
        final int[] M = {500,200,100,50,20,10,5,2,1};
        final int[] L = { 1,  2,  0,  7,2, 2, 5,2,10};
        int zl, gr, r, i = 0;
        int[] ile_monet = new int[9];
        r = 2137;
        while (r > 0)
        {
            if (r >= M[i] && L[i]!=0)
            {
                System.out.print(M[i]/100.0 + " ");
                r -= M[i];
                ile_monet[i]++;
                L[i]--;
            }
            else
                i++;
            if(i==M.length) break;
        }
        if(r>0) System.out.println("Nie mogę wydać: "+r);
        System.out.println();
        for (int j = 0; j < M.length ; j++) {
            System.out.println("Nominał "+M[j]+" wydany będzie:"+ile_monet[j]);
        }
        System.out.println("W kasie zostało:");
        for (int j = 0; j < ile_monet.length ; j++) {
            System.out.println(((double)M[j]/100) +"zł, sztuk: "+ile_monet[j] );
        }

    }
}
