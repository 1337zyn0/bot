package times;

import Events.DayChecker;
import java.util.Calendar;

public class ausrufungszeichenNEUN {

    public String ausrufungszeichenNEUN(){

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        DayChecker x = new DayChecker();
        String Tag = x.getDayOfWeek(dayOfWeek);

        String modus = "";

        if (Tag.equals("Monday")) {
            modus = "Battle Royal Special 2v2";
        } else if (Tag.equals("Tuesday")) {
            modus = "Battle Royal Special 2v2";
        } else if (Tag.equals("Wednesday")) {
            modus = "Battle Royal Special 2v2";
        } else if (Tag.equals("Thursday")) {
            modus = "Battle Royal Special 2v2";
        } else if (Tag.equals("Friday")) {
            modus = "Battle Royal Special 2v2";
        } else if (Tag.equals("Saturday")) {
            modus = "Battle Royal Special 2v2";
        } else if (Tag.equals("Sunday")) {
            modus = "Battle Royal Special 2v2";
        }
        return modus;
    }
}
