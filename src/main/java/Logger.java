import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Logger {
    protected int num = 1;

    private static Logger logger = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return logger;
    }

    public void log(String msg) {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String date = format.format(calendar.getTime());
        System.out.println("[" + date + " " + num + "]" + " " + msg);
        num++;
    }
}
