package Study01;

public class YangHuiTriangle {
    public static void main(String[] args) {
        int[][] array = new int[10][];

        for (int i = 0; i < array.length; i++) {
            array[i] = new  int[i+1];
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j==0 || i==j){
                    array[i][j]=1;
                    System.out.print(array[i][j]+" ");
                }else {
                    array[i][j]=array[i-1][j]+array[i-1][j-1];;
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
