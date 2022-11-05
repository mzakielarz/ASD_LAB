public class PlecakDyn {
    final static int N = 6; // liczba wszystkich przedmiotow
    final static int MAX_V = 10; // objetosc plecaka
    final static int[] V = {6,2,3,2,3,1}; // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2};
    final static int[][] backpack = new int[N][MAX_V+1];


    public static void main(String[] args){
        System.out.println("Najlepsza wartość: "+ plecak(N,MAX_V+1));
        printtable();

    }

    public static int plecak(int n, int v){ // n- liczba przedmiotów; v- objętość plecaka

        for(int w = 0; w <n; w++){ // w- wierze c- kolumny
            for(int c = 0; c<v; c++)
            {
                if(w ==0){
                    if(c<V[w]) backpack[w][c]=0;
                    else backpack[w][c]= W[w];
                }
                else{
                    if(c-V[w]<0) backpack[w][c]=backpack[w -1][c];
                    else backpack[w][c]=Math.max(backpack[w -1][c],W[w]+backpack[w -1][c-V[w]]);
                }
            }
        }

        return backpack[n-1][v-1];
    }


    public static void printtable(){
        for(int i =0; i<backpack.length;i++){
            for(int j =0; j<backpack[0].length;j++){
                System.out.print(backpack[i][j]+" ");
            }
            System.out.println();
        }
    }
}
