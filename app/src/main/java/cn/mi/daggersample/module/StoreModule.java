package cn.mi.daggersample.module;

import cn.mi.daggersample.Store;
import cn.mi.daggersample.TaoBaoStore;
import cn.mi.daggersample.provider.CPU;
import cn.mi.daggersample.provider.IInput;
import cn.mi.daggersample.provider.IOutput;
import cn.mi.daggersample.provider.Memory;
import cn.mi.daggersample.provider.MotherBoard;
import cn.mi.daggersample.provider.OS;
import cn.mi.daggersample.provider.Office;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

@Module(
        includes = {
                SoftwareModule.class,
                HardwareModule.class
        }
)
public class StoreModule {

    @Provides
    public Store providerStore(CPU cpu, IInput input, IOutput output,
            Memory memory, MotherBoard mobo, OS os, Office office) {
        return new TaoBaoStore(cpu, input, output, memory, mobo, os, office);
    }
}
