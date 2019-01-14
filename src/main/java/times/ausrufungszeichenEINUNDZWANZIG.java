package times;

import Events.DayChecker;
import java.util.Calendar;

public class ausrufungszeichenEINUNDZWANZIG {

    public String ausrufungszeichenEINUNDZWANZIG(){

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        DayChecker x = new DayChecker();
        String Tag = x.getDayOfWeek(dayOfWeek);

        String modus = "";


        if (Tag.equals("Monday")) {
            modus = "King of Hill";
        } else if (Tag.equals("Tuesday")) {
            modus = "King of Hill";
        } else if (Tag.equals("Wednesday")) {
            modus = "King of Hill";
        } else if (Tag.equals("Thursday")) {
            modus = "King of Hill";
        } else if (Tag.equals("Friday")) {
            modus = "King of Hill";
        } else if (Tag.equals("Saturday")) {
            modus = "King of Hill";
        } else if (Tag.equals("Sunday")) {
            modus = "Skygarden at 21:30";
        }
        return modus;
    }
}
