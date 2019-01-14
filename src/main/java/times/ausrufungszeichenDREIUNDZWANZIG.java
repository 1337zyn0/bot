package times;

import Events.DayChecker;
import java.util.Calendar;

public class ausrufungszeichenDREIUNDZWANZIG {

    public String ausrufungszeichenDREIUNDZWANZIG(){

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        DayChecker x = new DayChecker();
        String Tag = x.getDayOfWeek(dayOfWeek);

        String modus = "";

        if (Tag.equals("Monday")) {
            modus = "War of Gods";
        } else if (Tag.equals("Tuesday")) {
            modus = "War of Gods";
        } else if (Tag.equals("Wednesday")) {
            modus = "War of Gods";
        } else if (Tag.equals("Thursday")) {
            modus = "War of Gods";
        } else if (Tag.equals("Friday")) {
            modus = "War of Gods";
        } else if (Tag.equals("Saturday")) {
            modus = "War of Gods";
        } else if (Tag.equals("Sunday")) {
            modus = "War of Gods";
        }
        return modus;
    }
}
