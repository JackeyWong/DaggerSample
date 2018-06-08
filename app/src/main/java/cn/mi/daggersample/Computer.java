package cn.mi.daggersample;

import javax.inject.Inject;

import cn.mi.daggersample.provider.CPU;
import cn.mi.daggersample.provider.IInput;
import cn.mi.daggersample.provider.IOutput;
import cn.mi.daggersample.provider.Memory;
import cn.mi.daggersample.provider.MotherBoard;
import cn.mi.daggersample.provider.OS;
import cn.mi.daggersample.provider.Office;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public class Computer implements Office{

    private final CPU cpu;
    private final IInput input;
    private final IOutput output;
    private final Memory memory;
    private final MotherBoard mobo;
    private final OS os;
    private final Office office;

    @Inject
    public Computer(CPU cpu, IInput input, IOutput output, Memory memory,
            MotherBoard mobo, OS os, Office office) {
        this.cpu = cpu;
        this.input = input;
        this.output = output;
        this.memory = memory;
        this.mobo = mobo;
        this.os = os;
        this.office = office;
    }


    public void setup() {
        Utils.print("开机试试");
        this.mobo.run();
        this.cpu.run();
        this.memory.run();
        this.input.run();
        this.output.run();
        this.os.run();
    }


    public void shutdown() {
        Utils.print("shutdown byb...");
    }

    @Override
    public void word() {
        this.office.word();
    }

    @Override
    public void ppt() {
        this.office.ppt();
    }

    public static class Builder {
        private CPU cpu;
        private IInput input;
        private IOutput output;
        private Memory memory;
        private MotherBoard mobo;
        private OS os;
        private Office office;

        public Builder setCpu(CPU cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setInput(IInput input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(IOutput output) {
            this.output = output;
            return this;
        }

        public Builder setMemory(Memory memory) {
            this.memory = memory;
            return this;
        }

        public Builder setMobo(MotherBoard mobo) {
            this.mobo = mobo;
            return this;
        }

        public Builder setOS(OS os) {
            this.os = os;
            return this;
        }

        public Builder setOffice(Office office) {
            this.office = office;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, input, output, memory, mobo, os, office);
        }
    }
}
