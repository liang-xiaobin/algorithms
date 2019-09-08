package cn.edu.gdupt.common;

import org.junit.Test;

/**
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019.09.08
 * @since JDK1.8
 */
public class UtilsTest {
    @Test
    public void setRadomTest() {
        Utils.writeNumberToTxt(Utils.setPath("result"), Utils.setRandom(5, 10000000));
    }
}
