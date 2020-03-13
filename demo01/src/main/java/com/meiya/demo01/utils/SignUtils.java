package com.meiya.demo01.utils;

/**
 * @Description
 * @ClassName SignUtils
 * @Author Administrator
 * @date 2020.01.16 11:58
 */
public class SignUtils {


    /**
     *
     *
     * @param parameter
     * @param sign
     * @return
     */
    public static boolean getSign(String parameter,String sign){

        String md5Parameter= Md5Utils.getMd5Str(parameter);
        if (!md5Parameter.equals(sign)){



        }



        return true;
    }




}
