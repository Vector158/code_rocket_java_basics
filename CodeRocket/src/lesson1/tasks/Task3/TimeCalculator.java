package lesson1.tasks.Task3;



public class TimeCalculator {
    public void division(double Minutes){

        int Years;
        double minutesInYear = 60 * 24 * 365;
        Years = (int) (Minutes / minutesInYear);
        int Days = (int) ((Minutes / 60 / 24) % 365);


        System.out.println((int) Minutes + " Minutes is approximately " +Years + " years and " +Days +" Days");

    }


}
