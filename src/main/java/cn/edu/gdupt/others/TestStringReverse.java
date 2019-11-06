package cn.edu.gdupt.others;

/**
 * 如何将字符串反转
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/6
 * @since JDK1.8
 */
public class TestStringReverse {
    //利用StringBuffer或者StringBuilder的reverse成员方法
    public static String reverse1(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    //利用String的toCharArray方法先将字符串转化为char类型数组,然后
    //将各个字符串重新拼接
    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }

    //3.利用String的CharAt方法取出字符串中的各个字符:
    //charAt
    public static String reverse3(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "abc123";
        System.out.println("reverse1:" + reverse1(s));
        System.out.println("reverse2:" + reverse2(s));
        System.out.println("reverse3:" + reverse3(s));
    }
}
