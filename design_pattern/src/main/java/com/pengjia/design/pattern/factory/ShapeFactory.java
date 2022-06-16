package com.pengjia.design.pattern.factory;

/**
 * 形状工厂，生产不同的形状
 *
 * @author pengjia
 * @date 2022/6/16 14:35
 */
public class ShapeFactory {


    /**
     * 使用 getShape 方法获取形状类型的对象
     *
     * @param shapeType 要创建的形状
     * @return 形状
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
