package cn.mi.daggersample;

import android.support.annotation.Nullable;

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

public class TaoBaoStore implements Store {

    private final CPU cpu;
    private final IInput input;
    private final IOutput output;
    private final Memory memory;
    private final MotherBoard mobo;
    private final OS os;
    private final Office office;

    public TaoBaoStore(CPU cpu, IInput input, IOutput output,
            Memory memory, MotherBoard mobo, OS os, Office office) {
        this.cpu = cpu;
        this.input = input;
        this.output = output;
        this.memory = memory;
        this.mobo = mobo;
        this.os = os;
        this.office = office;
    }

    @Override
    public @Nullable
    <T> T buy(Class<T> clz, Pay payment) throws PaymentException {
        Utils.print("去淘宝买电脑...");
        try {
            payment.payment(5000);
        } catch (Pay.NotEnoughMoneyException e) {
            throw new PaymentException(e);
        }
        if (Computer.class == clz) {
            Computer c = new Computer.Builder()
                    .setCpu(cpu)
                    .setInput(input)
                    .setOutput(output)
                    .setMemory(memory)
                    .setMobo(mobo)
                    .setOS(os)
                    .setOffice(office)
                    .build();
            return (T) c;
        }
        return null;

    }
}
