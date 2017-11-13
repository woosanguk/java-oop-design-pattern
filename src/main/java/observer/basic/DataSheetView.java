package observer.basic;

import java.util.List;

/**
 * Created by sanguk on 13/11/2017.
 */
public class DataSheetView implements Observer {
    private ScoreRecord scoreRecord;

    public DataSheetView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    public void update() {
        List<Integer> record = this.scoreRecord.getScoreRecord();
        displayScores(record, record.size());
    }

    private void displayScores(List<Integer> record, int viewCount) {
        System.out.println("List of " + viewCount + " entries: ");
        for (int i = 0; i < viewCount; i++) {
            System.out.print(record.get(i) + " ");
        }
        System.out.println();
    }
}
