package org.appfuse.tutorial.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by Administrator on 2016/3/10.
 */
public class RandomUtil extends RandomStringUtils{
    public static String getNumeric() {
        return randomNumeric(8);
    }

    public static void main(String[] args) {
        System.out.println(Integer.parseInt(RandomUtil.getNumeric()));
    }
}
