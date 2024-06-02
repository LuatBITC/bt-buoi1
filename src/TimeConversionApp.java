public class TimeConversionApp {
    public int covertHoursToMinutes(int hours) {
        return hours * 60;
    }

    public int covertDaysToMinutes(int days) {
        return days * 24 * 60;
    }

    public static void main(String[] args) {
        TimeConversionApp timeConversionApp = new TimeConversionApp();
        
        int convertHourToMinute = timeConversionApp.covertHoursToMinutes(2);
        System.out.println(convertHourToMinute); // Output: 120
        
        int convertDayToMinute = timeConversionApp.covertDaysToMinutes(3);
        System.out.println(convertDayToMinute); // Output: 4320
    }
}