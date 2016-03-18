import com.sun.deploy.util.SessionState;

/**
 * Created by dfleuren on 18.03.2016.
 */
public class TollerChat {

    public static void main(String[] args) {
        if (args.length == 1) {
            new Client(args[0]);

        } else {
            new Server();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            new Client("127.0.0.1");
        }
    }
}
