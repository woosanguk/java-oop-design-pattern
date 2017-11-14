package singleton.exercise_05;

/**
 * Created by sanguk on 14/11/2017.
 */
public class ServerFactory implements ServerProvider{
    private static ServerProvider serverProvider = new ServerProvider() {
        public Server getServer() {
            return new ServerProxy();
        }
    };

    public synchronized static ServerProvider getInstance(){
        return serverProvider;
    }

    public Server getServer(){
        return serverProvider.getServer();
    }

    public static void setServer(ServerProvider sp) {
        serverProvider = sp;
    }
}
