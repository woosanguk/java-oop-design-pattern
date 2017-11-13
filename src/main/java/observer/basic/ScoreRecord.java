package observer.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanguk on 13/11/2017.
 */

public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<Integer>();

    public void addScore(int score) {
        scores.add(score);
        notifyObservers();
    }

    public List<Integer> getScoreRecord() {
        return this.scores;
    }
}
