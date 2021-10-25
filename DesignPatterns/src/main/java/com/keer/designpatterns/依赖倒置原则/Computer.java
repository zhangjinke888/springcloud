package com.keer.designpatterns.依赖倒置原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class Computer {
    Cpu cpu;
    HardDisk hardDisk;
    Memory memory;

    public void run(){
        System.out.println("运行计算机");
        cpu.run();
        hardDisk.get();
        memory.save();

    }
    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
