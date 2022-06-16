package com.pengjia.design.model.factory_pattern.example1.impl;

import com.pengjia.design.model.factory_pattern.example1.Shape;

/**
 * 正方形
 *
 * @author pengjia
 */
public class Square implements Shape {

    public void draw() {
        System.err.println("画一个正方形");
    }
}
