package com.meiya.demo01.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @Description
 * @ClassName Md5Utils
 * @Author Administrator
 * @date 2020.01.16 11:47
 */
public class Md5Utils {
    private static final String SALT = "sdaghiuewq2j3oia";


    /**
     * 获取MD5加密后的字符串
     * @param str 原始字符串
     * @return 加密后的字符串
     */
    public static String getMd5Str(String str){

        StringBuilder stringBuilder = new StringBuilder(str);
        //将盐值追加到原始字符串后
        stringBuilder.append(SALT);
        System.out.println(stringBuilder);
        String md5String =DigestUtils.md5Hex(stringBuilder.toString());
        System.out.println(md5String);
        return md5String;

    }

}
