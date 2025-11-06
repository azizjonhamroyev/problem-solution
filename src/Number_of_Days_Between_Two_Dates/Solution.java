package Number_of_Days_Between_Two_Dates;

class Solution {
    public static final int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        int year1 = Integer.parseInt(date1.substring(0, 4)), month1 = Integer.parseInt(date1.substring(5, 7)), day1 = Integer.parseInt(date1.substring(8)),
                year2 = Integer.parseInt(date2.substring(0, 4)), month2 = Integer.parseInt(date2.substring(5, 7)), day2 = Integer.parseInt(date2.substring(8));

        return Math.abs(dayCount(year1, month1, day1) - dayCount(year2, month2, day2));
    }

    public int dayCount(int year, int month, int day) {
        int defaultYear = 1971, defaultMonth = 1, defaultDay = 1, dayCount = 0;

        for (int i = defaultYear; i < year; i++) {
            dayCount += 365;
            if (isLeapYear(i)) {
                dayCount++;
            }
        }

        boolean currYear = isLeapYear(year);

        for (int i = defaultMonth; i < month; i++) {
            if (i == 2 && currYear) dayCount++;
            dayCount += monthDays[i - 1];
        }

        dayCount += day - defaultDay;
        return dayCount;
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}