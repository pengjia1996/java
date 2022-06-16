package com.pengjia.design.model.factory_pattern.example2;

/**
 * 计算机
 * @author pengjia
 * @date 2022/6/16 15:06
 */
public abstract class Computer {
    //获取内存
    public abstract String getRAM();
    //获取硬盘
    public abstract String getHDD();
    //获取中央处理器
    public abstract String getCPU();

    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
