package Study01;

import java.util.Arrays;
/**
 *  String ：底层 是char[]  不可变性
 *
 * 速度 String Builder  > StringBuffer >  String
 */

public class MyStringStudy {
    public static void main(String[] args) {
        String s1 = "abc123";
        System.out.println(s1.length());
        System.out.println(s1.replace("a", "y"));
        System.out.println(s1.indexOf("bc"));
        System.out.println(s1.substring(2));

        System.out.println(s1.contains("ab"));
        System.out.println(s1.charAt(4));

        char[] chars = s1.toCharArray();
        System.out.println(Arrays.toString(chars));

        String str = new String(chars);
        System.out.println(str);

        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));

        String str1 = new String(bytes);
        System.out.println(str1);


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a").append("b");
        stringBuffer.replace(0,0,"c");
        stringBuffer.deleteCharAt(1);
        stringBuffer.length();
        System.out.println(stringBuffer.charAt(1));

    }
}
