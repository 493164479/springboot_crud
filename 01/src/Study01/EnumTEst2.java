package Study01;

public class EnumTEst2 {
    public static void main(String[] args) {
        Week week =Week.Monday;
        System.out.println(week);

    }
}

enum Week{

    Monday("星期一"),
    Tuesday("星期二");


    private final String Weekday;

    private Week(String Weekday){
        this.Weekday = Weekday;
    }

    public String getWeekday() {
        return Weekday;
    }
}
