public class PlecakDyn {
    final static int N = 6; // liczba wszystkich przedmiotow
    final static int MAX_V = 10; // objetosc plecaka
    final static int[] V = {6,2,3,2,3,1}; // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2};
    final static int[][] tab = new int[N][MAX_V+1];


    public static void main(String[] args){
        System.out.println("wartosc plecaka: "+ plecak(N,MAX_V+1));
    }

    public static int plecak(int n, int v){ // n- liczba przedmiotów; v- objętość plecaka

        for(int w = 0; w <n; w++){ // w- wierze k- kolumny tabeli
            for(int k = 0; k <v; k++)
            {
                if(w ==0){
                    if(k <V[w]) tab[w][k]=0;
                    else tab[w][k]= W[w];
                }
                else{
                    if(k -V[w]<0) tab[w][k]= tab[w -1][k];
                    else tab[w][k]=Math.max(tab[w -1][k],W[w]+ tab[w -1][k -V[w]]);
                }
            }
        }

        return tab[n-1][v-1];
    }

}
