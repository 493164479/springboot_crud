package Study01;

public class EnumTest {
    public static void main(String[] args) {
         SeasonTest s =SeasonTest.SPRING;
        System.out.println(s.getSeasonName());
        System.out.println(s);
    }
}

class SeasonTest{

    private final String seasonName;

    private SeasonTest(String seasonName){
        this.seasonName = seasonName;
    }


    public static  SeasonTest SPRING = new SeasonTest("春天");

    public String getSeasonName() {
        return seasonName;
    }
}
