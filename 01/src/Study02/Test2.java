package Study02;

import java.util.Scanner;

public class Test2{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int[] array = new int[5];

        int sum = 0;
        int flag=0;

        while (flag==0) {
            for (int i = 0; i < array.length; i++) {
                if (scn.hasNextInt()) {
                    array[i] = scn.nextInt();
                    sum += array[i];
                } else {
                    System.out.println("输入有误,请重新输入");
                    continue;
                }
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            System.out.println("sum:" + sum);

            if(sum==0){
                flag=1;
            }else {
                flag=0;
            }


        }
    }


}