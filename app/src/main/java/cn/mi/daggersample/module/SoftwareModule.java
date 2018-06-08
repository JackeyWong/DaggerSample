package cn.mi.daggersample.module;

import cn.mi.daggersample.provider.OS;
import cn.mi.daggersample.provider.Office;
import cn.mi.daggersample.provider.impl.WPS;
import cn.mi.daggersample.provider.impl.WindowsX;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

@Module
public class SoftwareModule {

    @Provides
    public OS provideOS() {
        return new WindowsX();
    }

    @Provides
    public Office provideOffice() {
        return new WPS();
    }
}
