import java.util.Arrays;

public class HackathonScoreCurveBooster {
    static void curveScores(int[] scores, int bonus){
        for(int i  =0; i<scores.length; i++){
            scores[i] = scores[i]+bonus;

        }

    }


    public static void main(String[] args) {
        int[] scroes = {50, 60, 50};
        curveScores(scroes , 10);
        System.out.println(scroes);
        System.out.println(Arrays.toString(scroes));




    }
}
