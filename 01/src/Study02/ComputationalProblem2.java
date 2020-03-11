package Study02;

import org.junit.Test;

public class ComputationalProblem2 {
    @Test
    public void  test(){
        System.out.println(count("abc", "abchldshajdhjkasabchajdjasacb"));

    }


    public int count(String minStr,String maxStr){
        int minlength = minStr.length();
        int maxlength = maxStr.length();

        int count = 0;
        int index=0;
        if(minlength<=maxlength){
            while ( (index =maxStr.indexOf(minStr)) !=-1){
                count++;
                maxStr = maxStr.substring(index+minlength);
            }
        }

        return count;
    }
}
