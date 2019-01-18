package Events;

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

public class ausrufungszeichenEvent {

    String befehl = "";

    public ausrufungszeichenEvent() {
    }

    public String checkModi(String bef) {
        String modus = "";
        switch (bef) {
            case "!0":
                ausrufungszeichenNULL NUL = new ausrufungszeichenNULL();
                modus = NUL.ausrufungszeichenNULL();
                break;
            case "!1":
                ausrufungszeichenEINS EIN = new ausrufungszeichenEINS();
                modus = EIN.ausrufungszeichenEINS();
                break;
            case "!2":
                ausrufungszeichenZWEI ZWE = new ausrufungszeichenZWEI();
                modus = ZWE.ausrufungszeichenZWEI();
                break;
            case "!3":
                ausrufungszeichenDREI DRE = new ausrufungszeichenDREI();
                modus = DRE.ausrufungszeichenDREI();
                break;
            case "!4":
                ausrufungszeichenVIER VIE = new ausrufungszeichenVIER();
                modus = VIE.ausrufungszeichenVIER();
                break;
            case "!5":
                ausrufungszeichenFUENF FUE = new ausrufungszeichenFUENF();
                modus = FUE.ausrufungszeichenFUENF();
                break;
            case "!7":
                ausrufungszeichenSIEBEN SIE = new ausrufungszeichenSIEBEN();
                modus = SIE.ausrufungszeichenSIEBEN();
                break;
            case "!8":
                ausrufungszeichenACHT ACH = new ausrufungszeichenACHT();
                modus = ACH.ausrufungszeichenACHT();
                break;
            case "!9":
                ausrufungszeichenNEUN NEU = new ausrufungszeichenNEUN();
                modus = NEU.ausrufungszeichenNEUN();
                break;
            case "!10":
                ausrufungszeichenZEHN ZEH = new ausrufungszeichenZEHN();
                modus = ZEH.ausrufungszeichenZEHN();
                break;
            case "!11":
                ausrufungszeichenELF ELF = new ausrufungszeichenELF();
                modus = ELF.ausrufungszeichenELF();
                break;
            case "!12":
                ausrufungszeichenZWOELF ZWO = new ausrufungszeichenZWOELF();
                modus = ZWO.ausrufungszeichenZWOELF();
                break;
            case "!13":
                ausrufungszeichenDREIZEHN DREIZ = new ausrufungszeichenDREIZEHN();
                modus = DREIZ.ausrufungszeichenDREIZEHN();
                break;
            case "!14":
                ausrufungszeichenVIERZEHN VIERZ = new ausrufungszeichenVIERZEHN();
                modus = VIERZ.ausrufungszeichenVIERZEHN();
                break;
            case "!15":
                ausrufungszeichenFUENFZEHN FUENFZ = new ausrufungszeichenFUENFZEHN();
                modus = FUENFZ.ausrufungszeichenFUENFZEHN();
                break;
            case "!16":
                ausrufungszeichenSECHSZEHN SECHSZ =
                        new ausrufungszeichenSECHSZEHN();
                modus = SECHSZ.ausrufungszeichenSECHSZEHN();
                break;
            case "!17":
                ausrufungszeichenSIEBZEHN SIEBZ = new ausrufungszeichenSIEBZEHN();
                modus = SIEBZ.ausrufungszeichenSIEBZEHN();
                break;
            case "!18":
                ausrufungszeichenACHTZEHN ACHTZ = new ausrufungszeichenACHTZEHN();
                modus = ACHTZ.ausrufungszeichenACHTZEHN();
                break;
            case "!20":
                ausrufungszeichenZWANZIG ZWAN = new ausrufungszeichenZWANZIG();
                modus = ZWAN.ausrufungszeichenZWANZIG();
                break;
            case "!21":
                ausrufungszeichenEINUNDZWANZIG EINUN =
                        new ausrufungszeichenEINUNDZWANZIG();
                modus = EINUN.ausrufungszeichenEINUNDZWANZIG();
                break;
            case "!22":
                ausrufungszeichenZWEIUNDZWANZIG ZWEIU =
                        new ausrufungszeichenZWEIUNDZWANZIG();
                modus = ZWEIU.ausrufungszeichenZWEIUNDZWANZIG();
                break;
            case "!23":
                ausrufungszeichenDREIUNDZWANZIG DREIU =
                        new ausrufungszeichenDREIUNDZWANZIG();
                modus = DREIU.ausrufungszeichenDREIUNDZWANZIG();
                break;
        }
        return modus;
    }
}