package com.pengjia.design.model.test;

import com.pengjia.design.model.factory_pattern.example1.Shape;
import com.pengjia.design.model.factory_pattern.example1.factory.ShapeFactory;

/**
 * 测试工厂模式
 *
 * @author pengjia
 * @date 2022/6/16 14:37
 */
public class TestShapeFactory {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //调用 Square 的 draw 方法
        shape3.draw();
    }

}
