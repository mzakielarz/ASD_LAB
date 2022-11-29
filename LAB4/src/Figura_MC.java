import java.util.Random;

public class Figura_MC {


    public static void main(String[] args) {
        Random los = new Random();
        int licz =0;


        for (int i = 0; i <100 ; i++) {
            double x = (double)los.nextInt(1001)/1000;
            double y = (double)los.nextInt(1001)/1000;
            if(y<=Math.sin(x)) licz++;
        }
        System.out.println("POLE: "+(licz/100.0));
    }
}
