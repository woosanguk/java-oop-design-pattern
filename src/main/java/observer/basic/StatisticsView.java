package observer.basic;

import java.util.List;

/**
 * Created by sanguk on 13/11/2017.
 */
public class StatisticsView implements Observer {
    private ScoreRecord scoreRecord;

    public StatisticsView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayStatistics(record);
    }

    private void displayStatistics(List<Integer> record) {
        int sum = 0;
        for (int score:record){
            sum += score;
        }
        float aveerage = (float) sum / record.size();
        System.out.println("Sum : " + sum + " Average : " + aveerage);
    }
}
