package com.pengjia.design.model.factory_pattern.example1.impl;

import com.pengjia.design.model.factory_pattern.example1.Shape;

/**
 * 长方形
 *
 * @author pengjia
 */
public class Rectangle implements Shape {

    public void draw() {
        System.err.println("画一个长方形");
    }
}
