package cn.edu.gdupt.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Liang Xiaobin
 * @author 1490556728@qq.com
 * @version 2019.05.30
 * @since JDK1.8
 */
public class Utils {
    /**
     * 通过指定路径，获取指定数量的数字
      * @param source
     * @param num
     * @return int[]
     */
    public static int[] getNumberByTxt(String source, int num) {
        int[] result = new int[num];
        try {
            FileReader fileReader = new FileReader(source);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String strLine;
            String p = "^[0-9]{1,}";
            int i = 0;
            Pattern pattern = Pattern.compile(p);
            while ((bufferedReader.ready())) {
                strLine = bufferedReader.readLine();
                Matcher m = pattern.matcher(strLine);
                if (m.find() && i < result.length) {
                    result[i++] = Integer.valueOf(m.group(0));
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return result;
    }

    /**
     * 将数组中的数字保存在指定路径的文件中
     * @param destination
     * @param result
     */
    public static void writeNumberToTxt(String destination, int[] result) {
        try {
            FileWriter fileWriter = new FileWriter(destination);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取指定数量级,指定个数的数字
     * @param bits
     * @param numbers
     * @return int[]
     */
    public static int[] setRandom(int bits, int numbers) {
        int[] result = new int[numbers];
        Random random = new Random();
        int startNumber = (int) Math.pow(10, (bits - 1));
        int endNumber = (int) Math.pow(10, bits);
        for (int i = 0; i < numbers; i++) {
            result[i] = random.nextInt(endNumber - startNumber) + startNumber;
        }
        return result;
    }

    /**
     * 用于设置文件的路径
     * @param filename
     * @return
     */
    public static String setPath(String filename) {
        return "E:\\java\\algorithms\\" + filename + ".txt";
    }

    /**
     * 将基本数据类型数组转换为包装数据类型数组
     * @param source
     * @return
     */
    public static Integer[] intArraytoIntegerArray(int[] source) {
        Integer[] result = new Integer[source.length];
        for (int i = 0; i < source.length; i++) {
            result[i] = source[i];
        }
        return result;
    }
}