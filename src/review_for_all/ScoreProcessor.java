package review_for_all;


public class ScoreProcessor {

    private int scores[];





    public ScoreProcessor(int scores[]){
        this.scores = scores;

    }



    public int countPassing(){

        int countPassing = 0;
        for(int i=0; i<scores.length; i++){
            if (scores[i]>=60){
                countPassing++;
            }
        }
        return countPassing;
    }

    public int findScore(int target){

        for (int i=0; i<scores.length; i++){
            if(scores[i] == target){
                return i;
            }
        }
        return -1;
    }

}
