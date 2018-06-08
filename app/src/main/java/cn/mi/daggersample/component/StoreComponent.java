package cn.mi.daggersample.component;

import cn.mi.daggersample.module.CustomerModule;
import cn.mi.daggersample.module.StoreModule;
import dagger.Component;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

@Component(
        modules = {
                StoreModule.class,
        }
)
public interface StoreComponent {

    ShoppingComponent newShoppingComponent(CustomerModule customerModule);

}
