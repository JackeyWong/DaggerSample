package cn.mi.daggersample.module;

import cn.mi.daggersample.provider.CPU;
import cn.mi.daggersample.provider.IInput;
import cn.mi.daggersample.provider.IOutput;
import cn.mi.daggersample.provider.Memory;
import cn.mi.daggersample.provider.MotherBoard;
import cn.mi.daggersample.provider.impl.ASUS;
import cn.mi.daggersample.provider.impl.Display;
import cn.mi.daggersample.provider.impl.InterCPU;
import cn.mi.daggersample.provider.impl.Keyboard;
import cn.mi.daggersample.provider.impl.SSD;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

@Module
public class HardwareModule {
    @Provides
    public CPU provideCPU() {
        return new InterCPU();
    }

    @Provides
    public IInput provideIInput() {
        return new Keyboard();
    }

    @Provides
    public IOutput provideIOutput() {
        return new Display();
    }

    @Provides
    public Memory provideMemory() {
        return new SSD();
    }

    @Provides
    public MotherBoard provideMotherBoard() {
        return new ASUS();
    }
}
