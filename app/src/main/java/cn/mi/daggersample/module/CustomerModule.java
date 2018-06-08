package cn.mi.daggersample.module;

import javax.inject.Inject;

import cn.mi.daggersample.Customer;
import cn.mi.daggersample.Pay;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

@Module
public class CustomerModule {

    private final Pay mPayment;

    @Inject
    public CustomerModule(Pay pay) {
        this.mPayment = pay;
    }

    @Provides
    public Customer provideCustomer() {
        return new Customer(mPayment);
    }
}
