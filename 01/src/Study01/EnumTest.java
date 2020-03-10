package Study01;

public class EnumTest {
    public static void main(String[] args) {
        SeasonTest s = SeasonTest.SPRIING;
        System.out.println(s.getSeasonName());

    }
}

class SeasonTest{


    private  final String seasonName;

    private  final String  seasonDesc;


    private SeasonTest(String seasonName,String  seasonDesc){
        this.seasonName =seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static  final SeasonTest SPRIING = new SeasonTest("春天","春暖花开");
    public static  final SeasonTest WINTER = new SeasonTest("冬天","天寒地冻");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
