package Calendar;

import Foobar.Month;

public class App {

    public static void main(String[] args) {
	    int monthNumber = 0;

        System.out.println("Twoj miesiac to: "+GenerateMonth(monthNumber));
    }

    private static Month GenerateMonth(int monthNumber) {
/*        return switch (monthNumber) {
            case 1 -> Month.Styczen;
            case 2 -> Month.Luty;
            case 3 -> Month.Marzec;
            case 4 -> Month.Kwiecien;
            case 5 -> Month.Maj;
            case 6 -> Month.Czerwiec;
            case 7 -> Month.Lipiec;
            case 8 -> Month.Sierpien;
            case 9 -> Month.Wrzesien;
            case 10 -> Month.Pazdziernik;
            case 11 -> Month.Listopad;
            case 12 -> Month.Grudzien;
            default -> Month.Unknown;
        };*/
        Month[] allMonths = Month.values();

        for(int i=0;i<allMonths.length;i++)
        {
            if(i == monthNumber-1)
                return allMonths[i];
        }
        return allMonths[allMonths.length-1];
    }
}
