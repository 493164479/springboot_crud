package Study01;

public class EnumTEst2 {
    public static void main(String[] args) {
        WeekTest w=WeekTest.Mondy;
        System.out.println(w);//Mondy
        System.out.println(w.getWeekDES());
    }
}

enum  WeekTest{

    Mondy("星期一"),
    Tuesday("星期二");

    private  final String weekDES;

    private WeekTest(String weekDES){
        this.weekDES=weekDES;
    }

    public String getWeekDES() {
        return weekDES;
    }
}
