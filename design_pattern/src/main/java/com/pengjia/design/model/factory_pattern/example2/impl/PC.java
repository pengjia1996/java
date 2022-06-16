package com.pengjia.design.model.factory_pattern.example2.impl;

import com.pengjia.design.model.factory_pattern.example2.Computer;

/**
 * 个人电脑
 * @author pengjia
 * @date 2022/6/16 15:10
 */
public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String getCPU() {
        return cpu;
    }
}
