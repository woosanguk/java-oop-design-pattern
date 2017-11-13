package observer.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Client {
    public static void main(String args[]){
        ScoreRecord scoreRecord = new ScoreRecord();
        DataSheetView dataSheetView = new DataSheetView(scoreRecord);
        scoreRecord.attach(dataSheetView);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);
        scoreRecord.attach(minMaxView);

        for(int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("adding " + score);
            scoreRecord.addScore(score);
        }

        scoreRecord.detach(dataSheetView);
        StatisticsView statisticsView = new StatisticsView(scoreRecord);
        scoreRecord.attach(statisticsView);

        for(int index = 1; index <= 5; index++) {
            int score = index * 10;
            System.out.println("adding " + score);
            scoreRecord.addScore(score);
        }
    }
}
