package review_for_all;

public class Leaderboard {


    private int scores[];
    private int count;



    public Leaderboard (int capacity){

        this.scores = new int[capacity];
        this.count =0;

    }



    public void addScore(int score){

        if (count<scores.length){

            scores[count] = score;
            count++;
        }else{
            System.out.println("Error: Leaderboard is full!");
        }

    }


    public void sortBoard(){

        for(int i=0; i<count; i++){
            int minIndex = i;

            for(int j = i + 1; j<count; j++){

                if (scores[j] < scores[minIndex]){
                    minIndex = j;

                }


            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;



        }

    }



}
