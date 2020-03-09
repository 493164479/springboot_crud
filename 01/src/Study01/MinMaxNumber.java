package Study01;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        int b =scn.nextInt();

        int max = a>b?a:b;
        int min = a>b?b:a;

        for (int i = min; i >0 ; i--) {
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }

        for (int i = max; i <=a*b ; i++) {
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
}
