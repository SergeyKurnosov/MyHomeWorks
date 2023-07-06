package task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CheckForYear checkForYear = year -> {
            Help.Check(year);
            return year;
        };
        checkForYear.NumberYear(2020);
        //----------------------
        CountDays countDays = (DayBefore, DayAfter) -> {
            Help.Count(DayBefore, DayAfter);
            return DayAfter;
        };
        countDays.CountDays(12, 22);
        //---------------------------
        CountWeeks countWeeks = (DayBefore, DayAfter) -> {
            Help.Count2(DayBefore , DayAfter);
            return DayAfter;
        };
        countWeeks.CountWeeks(12 , 22);
        //----------------------------
       DayFromData dayFromData= (Day, Month, Year) -> {
           Help.StringPrintDay(Help.NumberDay(Day , Month , Year) , Year , Month);
           return Day;
       };
       dayFromData.NumberForDays(29 , "июнь" , 2023);

    }
}