package Events;

import java.time.LocalTime;
import java.util.Calendar;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import times.ausrufungszeichenACHT;
import times.ausrufungszeichenACHTZEHN;
import times.ausrufungszeichenDREI;
import times.ausrufungszeichenDREIUNDZWANZIG;
import times.ausrufungszeichenDREIZEHN;
import times.ausrufungszeichenEINS;
import times.ausrufungszeichenEINUNDZWANZIG;
import times.ausrufungszeichenELF;
import times.ausrufungszeichenFUENF;
import times.ausrufungszeichenFUENFZEHN;
import times.ausrufungszeichenNEUN;
import times.ausrufungszeichenNULL;
import times.ausrufungszeichenSECHSZEHN;
import times.ausrufungszeichenSIEBEN;
import times.ausrufungszeichenSIEBZEHN;
import times.ausrufungszeichenVIER;
import times.ausrufungszeichenVIERZEHN;
import times.ausrufungszeichenZEHN;
import times.ausrufungszeichenZWANZIG;
import times.ausrufungszeichenZWEI;
import times.ausrufungszeichenZWEIUNDZWANZIG;
import times.ausrufungszeichenZWOELF;

public class P4TIMES extends ListenerAdapter {
    @SuppressWarnings("Duplicates")
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

        if (messageSent.equalsIgnoreCase("!modi")) {
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
                event.getChannel().sendMessage(frei);
            } else if (Tag.equals("Saturday")) {
                Samstag sa = new Samstag();
                String sam = sa.getModus();
                event.getChannel().sendMessage(sam).queue();
            } else if (Tag.equals("Sunday")) {
                Sonntag so = new Sonntag();
                String son = so.getModus();
                event.getChannel().sendMessage(son).queue();
            }
        }else {
            switch (messageSent){
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

//            if(messageSent.equalsIgnoreCase("!0")) {
//
//            ausrufungszeichenNULL NUL = new ausrufungszeichenNULL();
//            String NULL = NUL.ausrufungszeichenNULL();
//
//        } else if (messageSent.equalsIgnoreCase("!1")) {
//
//            ausrufungszeichenEINS EIN = new ausrufungszeichenEINS();
//            String EINS = EIN.ausrufungszeichenEINS();
//            event.getChannel().sendMessage(EINS).queue();
//        } else if (messageSent.equalsIgnoreCase("!2")) {
//
//            ausrufungszeichenZWEI ZWE = new ausrufungszeichenZWEI();
//            String ZWEI = ZWE.ausrufungszeichenZWEI();
//            event.getChannel().sendMessage(ZWEI).queue();
//        } else if (messageSent.equalsIgnoreCase("!3")) {
//
//            ausrufungszeichenDREI DRE = new ausrufungszeichenDREI();
//            String DREI = DRE.ausrufungszeichenDREI();
//            event.getChannel().sendMessage(DREI).queue();
//        } else if (messageSent.equalsIgnoreCase("!4")) {
//
//            ausrufungszeichenVIER VIE = new ausrufungszeichenVIER();
//            String VIER = VIE.ausrufungszeichenVIER();
//            event.getChannel().sendMessage(VIER).queue();
//        } else if (messageSent.equalsIgnoreCase("!5")) {
//
//            ausrufungszeichenFUENF FUE = new ausrufungszeichenFUENF();
//            String FUENF = FUE.ausrufungszeichenFUENF();
//            event.getChannel().sendMessage(FUENF).queue();
//        } else if (messageSent.equalsIgnoreCase("!6")) {
//            event.getChannel().sendMessage("Kein Modi um 6 :=)").queue();
//        } else if (messageSent.equalsIgnoreCase("!7")) {
//
//            ausrufungszeichenSIEBEN SIE = new ausrufungszeichenSIEBEN();
//            String SIEBEN = SIE.ausrufungszeichenSIEBEN();
//            event.getChannel().sendMessage(SIEBEN).queue();
//        } else if (messageSent.equalsIgnoreCase("!8")) {
//
//            ausrufungszeichenACHT ACH = new ausrufungszeichenACHT();
//            String ACHT = ACH.ausrufungszeichenACHT();
//            event.getChannel().sendMessage(ACHT).queue();
//        } else if (messageSent.equalsIgnoreCase("!9")) {
//
//            ausrufungszeichenNEUN NEU = new ausrufungszeichenNEUN();
//            String NEUN = NEU.ausrufungszeichenNEUN();
//            event.getChannel().sendMessage(NEUN).queue();
//        } else if (messageSent.equalsIgnoreCase("!10")) {
//
//            ausrufungszeichenZEHN ZEH = new ausrufungszeichenZEHN();
//            String ZEHN = ZEH.ausrufungszeichenZEHN();
//            event.getChannel().sendMessage(ZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!11")) {
//
//            ausrufungszeichenELF ELF = new ausrufungszeichenELF();
//            String ELFF = ELF.ausrufungszeichenELF();
//            event.getChannel().sendMessage(ELFF).queue();
//        } else if (messageSent.equalsIgnoreCase("!12")) {
//
//            ausrufungszeichenZWOELF ZWO = new ausrufungszeichenZWOELF();
//            String ZWOELF = ZWO.ausrufungszeichenZWOELF();
//            event.getChannel().sendMessage(ZWOELF).queue();
//        } else if (messageSent.equalsIgnoreCase("!13")) {
//
//            ausrufungszeichenDREIZEHN DREIZ = new ausrufungszeichenDREIZEHN();
//            String DREIZEHN = DREIZ.ausrufungszeichenDREIZEHN();
//            event.getChannel().sendMessage(DREIZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!14")) {
//
//            ausrufungszeichenVIERZEHN VIERZ = new ausrufungszeichenVIERZEHN();
//            String VIERZEHN = VIERZ.ausrufungszeichenVIERZEHN();
//            event.getChannel().sendMessage(VIERZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!15")) {
//
//            ausrufungszeichenFUENFZEHN FUENFZ = new ausrufungszeichenFUENFZEHN();
//            String FUENFZEHN = FUENFZ.ausrufungszeichenFUENFZEHN();
//            event.getChannel().sendMessage(FUENFZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!16")) {
//
//            ausrufungszeichenSECHSZEHN SECHSZ =
//                    new ausrufungszeichenSECHSZEHN();
//            String SECHSZEHN = SECHSZ.ausrufungszeichenSECHSZEHN();
//            event.getChannel().sendMessage(SECHSZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!17")) {
//
//            ausrufungszeichenSIEBZEHN SIEBZ = new ausrufungszeichenSIEBZEHN();
//            String SIEBZEHN = SIEBZ.ausrufungszeichenSIEBZEHN();
//            event.getChannel().sendMessage(SIEBZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!18")) {
//
//            ausrufungszeichenACHTZEHN ACHTZ = new ausrufungszeichenACHTZEHN();
//            String ACHTZEHN = ACHTZ.ausrufungszeichenACHTZEHN();
//            event.getChannel().sendMessage(ACHTZEHN).queue();
//        } else if (messageSent.equalsIgnoreCase("!19")) {
//
//            event.getChannel().sendMessage("Territory War / Castle War").queue();
//        } else if (messageSent.equalsIgnoreCase("!20")) {
//
//            ausrufungszeichenZWANZIG ZWAN = new ausrufungszeichenZWANZIG();
//            String ZWANZIG = ZWAN.ausrufungszeichenZWANZIG();
//            event.getChannel().sendMessage(ZWANZIG).queue();
//        } else if (messageSent.equalsIgnoreCase("!21")) {
//
//            ausrufungszeichenEINUNDZWANZIG EINUN =
//                    new ausrufungszeichenEINUNDZWANZIG();
//            String EINUNDZWANZIG = EINUN.ausrufungszeichenEINUNDZWANZIG();
//            event.getChannel().sendMessage(EINUNDZWANZIG).queue();
//        } else if (messageSent.equalsIgnoreCase("!22")) {
//
//            ausrufungszeichenZWEIUNDZWANZIG ZWEIU =
//                    new ausrufungszeichenZWEIUNDZWANZIG();
//            String ZWEIUNDZWANZIG = ZWEIU.ausrufungszeichenZWEIUNDZWANZIG();
//            event.getChannel().sendMessage(ZWEIUNDZWANZIG).queue();
//        } else if (messageSent.equalsIgnoreCase("!23")) {
//
//            ausrufungszeichenDREIUNDZWANZIG DREIU =
//                    new ausrufungszeichenDREIUNDZWANZIG();
//            String DREIUNDZWANZIG = DREIU.ausrufungszeichenDREIUNDZWANZIG();
//            event.getChannel().sendMessage(DREIUNDZWANZIG).queue();
//        }
    }

    public static boolean isBetween(LocalTime candidate, LocalTime start,
            LocalTime end) {
        return !candidate.isBefore(start) && !candidate.isAfter(end);  // Inclusive.
    }
}
