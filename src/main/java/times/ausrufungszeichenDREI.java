package times;

import Events.DayChecker;
import java.util.Calendar;

public class ausrufungszeichenDREI {

    public String ausrufungszeichenDREI(){

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        DayChecker x = new DayChecker();
        String Tag = x.getDayOfWeek(dayOfWeek);

        String modus = "";

        if (Tag.equals("Monday")) {
            modus = "Battle of Worlds";
        } else if (Tag.equals("Tuesday")) {
            modus = "Battle of Worlds";
        } else if (Tag.equals("Wednesday")) {
            modus = "Battle of Worlds";
        } else if (Tag.equals("Thursday")) {
            modus = "Battle of Worlds";
        } else if (Tag.equals("Friday")) {
            modus = "Battle of Worlds";
        } else if (Tag.equals("Saturday")) {
            modus = "Battle of Worlds";
        } else if (Tag.equals("Sunday")) {
            modus = "Battle of Worlds";
        }
        return modus;
    }
}
