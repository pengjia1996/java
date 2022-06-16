package com.pengjia.design.pattern.factory;

/**
 * 原先
 *
 * @author pengjia
 * @date 2022/6/16 14:30
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.err.println("画一个圆");
    }
}
