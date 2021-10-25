package com.keer.designpatterns.依赖倒置原则;

/**
 * @auther keer
 * @data 2021/10/25
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Memory kingstonMemory = new KingstonMemory();
        Cpu intelCpu = new IntelCpu();
        HardDisk  xiJieHardDisk = new XiJieHardDisk();
        computer.setCpu(intelCpu);
        computer.setHardDisk(xiJieHardDisk);
        computer.setMemory(kingstonMemory);
        computer.run();
    }
}
