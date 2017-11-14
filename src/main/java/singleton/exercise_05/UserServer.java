package singleton.exercise_05;

/**
 * Created by sanguk on 14/11/2017.
 */
public class UserServer implements Server{
    private Server server;

    public Server getServer(){
        return server;
    }

    public void doSomeThing() {
        ServerProvider factory = ServerFactory.getInstance();
        server = factory.getServer();
        server.doSomeThing();
    }
}
