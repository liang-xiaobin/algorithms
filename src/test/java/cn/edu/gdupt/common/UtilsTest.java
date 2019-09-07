package cn.edu.gdupt.common;

import org.junit.Test;

/**
 * @author Liang Xiaobin
 * @author 1490556728@qq.com
 * @version 2019.05.31
 * @since JDK1.8
 */
public class UtilsTest {
    @Test
    public void setRadomTest() {
        Utils.writeNumberToTxt(Utils.setPath("result"), Utils.setRandom(5, 10000000));
    }
}
