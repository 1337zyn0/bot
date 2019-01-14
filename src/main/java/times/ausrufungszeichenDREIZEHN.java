package times;

import Events.DayChecker;
import java.util.Calendar;

public class ausrufungszeichenDREIZEHN {

    public String ausrufungszeichenDREIZEHN(){

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        DayChecker x = new DayChecker();
        String Tag = x.getDayOfWeek(dayOfWeek);

        String modus = "";

        if (Tag.equals("Monday")) {
            modus = "Battle Royal Survivor 4v4";
        } else if (Tag.equals("Tuesday")) {
            modus = "Battle Royal Random 3v3";
        } else if (Tag.equals("Wednesday")) {
            modus = "Battle Royal Random 3v3";
        } else if (Tag.equals("Thursday")) {
            modus = "Battle Royal Random 3v3";
        } else if (Tag.equals("Friday")) {
            modus = "Battle Royal Survivor 4v4";
        } else if (Tag.equals("Saturday")) {
            modus = "Battle Royal 100% 3v3";
        } else if (Tag.equals("Sunday")) {
            modus = "Battle Royal Random 3v3";
        }
        return modus;
    }
}
