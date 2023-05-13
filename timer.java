import java.util.Timer;
import java.util.TimerTask;

public class GameTimer {
    private Timer timer;
    private int timeLeft;

    public GameTimer(int timeLimitInMinutes) {
        this.timeLeft = timeLimitInMinutes * 60;
        this.timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                timeLeft--;
                if (timeLeft == 0) {
                    timer.cancel();
                }
            }
        }, 0, 1000); // Update every second
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void stop() {
        timer.cancel();
    }
}
