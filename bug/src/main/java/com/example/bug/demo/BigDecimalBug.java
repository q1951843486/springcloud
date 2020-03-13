package com.example.bug.demo;

import java.math.BigDecimal;

/**
 * @Description
 * @ClassName BigDecimalBug
 * @Author Administrator
 * @date 2020.01.15 10:56
 */
public class BigDecimalBug {

    /**
     * BigDecimal 在使用时 New BigDecimal会出现问题
     * 推荐使用 BigDecimal.valueOf,或者使用String作为构造函数入参
     *
     *
     */


    public static void main(String[] args) {
        //new BigDecimal(0.1)并不等于0.1 而是等于0.1000000000000000055511151231257827021181583404541015625
        //原因是 new BigDecimal(0.1)使用的是double类型的入参 而在 java中double 与float 都是不精确的
        //double 使用二进制来存储和运算的 而二进制无法精确的表示 一个小数

        //应该使用BigDecimal.valueOf或者使用String作为入参 valueOf 底层也是使用String进行入参的
        System.out.println(new BigDecimal(0.1));
        System.out.println(BigDecimal.valueOf(0.1));
        System.out.println(new BigDecimal("0.1"));

    }



}
