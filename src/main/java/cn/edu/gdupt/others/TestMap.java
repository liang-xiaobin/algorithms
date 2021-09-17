package cn.edu.gdupt.others;

import java.util.HashMap;

/**
 * 注意基本数据类型不能作为Map中的键,只有对象才能作为键使用
 *
 * @author Liang Xiaobin<1490556728@qq.com>
 * @version 2019/11/15
 * @since JDK1.8
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
    }
}
