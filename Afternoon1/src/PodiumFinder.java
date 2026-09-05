public class PodiumFinder {
    static int[] findTopThreeScores(int[] scores){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(score : scroes ){
            if(score >= first){
                third =second;
                second = first;
                first = score;
            } else if (scores>=second) {
                third = second;
                second = score;

            } else if (score>=third) {
                third = score;

            }

        }
        return  new int[] {first , second, third};
    }


    public static void main(String[] args) {
        int[] scroes = {45, 82, 79, 90, 33, 90, 61};

    }
}
