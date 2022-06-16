package com.pengjia.design.model.test;

import com.pengjia.design.model.factory_pattern.example2.Computer;
import com.pengjia.design.model.factory_pattern.example2.factory.ComputerFactory;

/**
 *  测试计算机工厂
 * @author pengjia
 * @date 2022/6/16 15:21
 */
public class TestComputerFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
