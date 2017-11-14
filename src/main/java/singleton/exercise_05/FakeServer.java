package singleton.exercise_05;

/**
 * Created by sanguk on 14/11/2017.
 */
public class FakeServer implements Server {
    private StringBuffer result = new StringBuffer();

    public void doSomeThing() {
        result.append("invoked");
    }

    public String getResult(){
        return result.toString();
    }
}
