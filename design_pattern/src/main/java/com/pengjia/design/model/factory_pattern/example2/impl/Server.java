package com.pengjia.design.model.factory_pattern.example2.impl;

import com.pengjia.design.model.factory_pattern.example2.Computer;

/**
 * 服务器
 *
 * @author pengjia
 * @date 2022/6/16 15:12
 */
public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
