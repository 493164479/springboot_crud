package Study02;

import org.junit.Test;

public class ComputationalProblem1 {

    @Test
    public void test(){
        System.out.println(sort("abcde", 1, 4));
    }


    public String sort( String msg,int index,int end){

        char[] chars = msg.toCharArray();

        for (int i = index,j =end; i < j ; i++,j--) {
            char temp =chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        String s = new String(chars);

        return s;
    }
}

