package com.murphy.utils;

import org.junit.Test;

import java.util.Random;
import java.util.UUID;

/**
 * @author 杨成雨
 * @create 2017-10-28 14:45
 */
public class StringUtils {

    /**
     * 获得随机字符串
     *
     * @param length 字符串长度
     * @return 指定长度的随机字符串
     */
    public static String getRandomString(int length) {
        // 字符串缓冲区
        StringBuffer sb = new StringBuffer();
        // 随机数生成器
        Random random = new Random();

        // 循环构建每一个随机字符
        for (int i = 0; i < length; ++i) {
            // 随机ASCII码
            int result = random.nextInt(94) + 33;
            // 写入缓冲区
            sb.append(String.valueOf((char) result));
        }
        // 返回随机字符串
        return sb.toString();
    }
    /**
     * 自动生成32位的UUid，对应数据库的主键id进行插入用。
     * @return
     */
    public static String getUUID() {
        /*UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        // 去掉"-"符号
        String temp = str.substring(0, 8) + str.substring(9, 13)
                + str.substring(14, 18) + str.substring(19, 23)
                + str.substring(24);
        return temp;*/

        return UUID.randomUUID().toString().replace("-", "");
    }
    @Test
    public void test(){
        System.out.println(getUUID());
    }

}
