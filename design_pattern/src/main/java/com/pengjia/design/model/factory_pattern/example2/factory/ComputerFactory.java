package com.pengjia.design.model.factory_pattern.example2.factory;

import com.pengjia.design.model.factory_pattern.example2.Computer;
import com.pengjia.design.model.factory_pattern.example2.impl.PC;
import com.pengjia.design.model.factory_pattern.example2.impl.Server;

/**
 * @author pengjia
 * @date 2022/6/16 15:14
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("Server".equalsIgnoreCase(type)) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
