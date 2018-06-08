package cn.mi.daggersample.component;

import cn.mi.daggersample.MainActivity;
import cn.mi.daggersample.module.CustomerModule;
import dagger.Subcomponent;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */
@Subcomponent(
        modules = {
                CustomerModule.class
        }
)
public interface ShoppingComponent {
    void inject(MainActivity activity);
}
