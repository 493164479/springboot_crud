package Study01;

public class NineMultiplyNine {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i*j<10){
                    System.out.print(j+"*"+i+"= "+i*j+" ");
                }else {
                    System.out.print(j+"*"+i+"="+i*j+" ");
                }
            }
            System.out.println();
        }
    }
}
