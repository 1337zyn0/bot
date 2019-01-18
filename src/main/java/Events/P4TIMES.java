package Events;

import java.time.LocalTime;
import java.util.Calendar;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class P4TIMES extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {

        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

        DayChecker x = new DayChecker();
        String Tag = x.getDayOfWeek(dayOfWeek);

        Zeiten y = new Zeiten();
        String uhrzeit = y.getTime();
        LocalTime time = LocalTime.parse(uhrzeit);

        String messageSent = event.getMessage().getContentRaw();

        String modusss = "";
        ausrufungszeichenEvent ausEvent = new ausrufungszeichenEvent();

        switch (messageSent) {
            case "!modi":
                if (Tag.equals("Monday")) {
                    Montag mo = new Montag();
                    String mon = mo.getModus();
                    event.getChannel().sendMessage(mon).queue();
                } else if (Tag.equals("Tuesday")) {
                    Dienstag di = new Dienstag();
                    String die = di.getModus();
                    event.getChannel().sendMessage(die).queue();
                } else if (Tag.equals("Wednesday")) {
                    Mittwoch mi = new Mittwoch();
                    String mit = mi.getModus();
                    event.getChannel().sendMessage(mit).queue();
                } else if (Tag.equals("Thursday")) {
                    Donnerstag doners = new Donnerstag();
                    String don = doners.getModus();
                    event.getChannel().sendMessage(don).queue();
                } else if (Tag.equals("Friday")) {
                    Freitag fr = new Freitag();
                    String frei = fr.getModus();
                    event.getChannel().sendMessage(frei).queue();
                } else if (Tag.equals("Saturday")) {
                    Samstag sa = new Samstag();
                    String sam = sa.getModus();
                    event.getChannel().sendMessage(sam).queue();
                } else if (Tag.equals("Sunday")) {
                    Sonntag so = new Sonntag();
                    String son = so.getModus();
                    event.getChannel().sendMessage(son).queue();
                }
                break;
            case "!0":
                modusss = ausEvent.checkModi("!0");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!1":
                modusss = ausEvent.checkModi("!1");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!2":
                modusss = ausEvent.checkModi("!2");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!3":
                modusss = ausEvent.checkModi("!3");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!4":
                modusss = ausEvent.checkModi("!4");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!5":
                modusss = ausEvent.checkModi("!5");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!6":
                event.getChannel().sendMessage("Kein Modi um 6 :=)").queue();
                break;
            case "!7":
                modusss = ausEvent.checkModi("!7");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!8":
                modusss = ausEvent.checkModi("!8");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!9":
                modusss = ausEvent.checkModi("!9");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!10":
                modusss = ausEvent.checkModi("!10");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!11":
                modusss = ausEvent.checkModi("!11");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!12":
                modusss = ausEvent.checkModi("!12");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!13":
                modusss = ausEvent.checkModi("!13");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!14":
                modusss = ausEvent.checkModi("!14");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!15":
                modusss = ausEvent.checkModi("!15");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!16":
                modusss = ausEvent.checkModi("!16");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!17":
                modusss = ausEvent.checkModi("!17");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!18":
                modusss = ausEvent.checkModi("!18");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!19":
                event.getChannel().sendMessage("Territory War / Castle War").queue();
                break;
            case "!20":
                modusss = ausEvent.checkModi("!20");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!21":
                modusss = ausEvent.checkModi("!21");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!22":
                modusss = ausEvent.checkModi("!22");
                event.getChannel().sendMessage(modusss).queue();
                break;
            case "!23":
                modusss = ausEvent.checkModi("!23");
                event.getChannel().sendMessage(modusss).queue();
                break;
            default:
                break;
        }
    }

    public static boolean isBetween(LocalTime candidate, LocalTime start,
            LocalTime end) {
        return !candidate.isBefore(start) && !candidate.isAfter(end);  // Inclusive.
    }
}
