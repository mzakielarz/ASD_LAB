import java.util.Random;

public class Figura2_MC {
    public static void main(String[] args) {
        Random los = new Random();
        int licz =0;


        for (int i = 0; i <100 ; i++) {
            double x = (double)los.nextInt(701)/1000;
            double y = (double)los.nextInt(701)/1000+ 0.4;

            if(y<=Math.pow(x/10.0,x)) licz++;
        }
        System.out.println("POLE: "+(licz/100.0));
    }
}
