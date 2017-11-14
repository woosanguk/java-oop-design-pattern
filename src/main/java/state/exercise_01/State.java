package state.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public interface State {
    void insertCoin(int money);
    void pushButton();
    void returnCoin();
}
