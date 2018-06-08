package cn.mi.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import cn.mi.daggersample.component.DaggerStoreComponent;
import cn.mi.daggersample.module.CustomerModule;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main();
    }


    @Inject
    Store mStore;
    @Inject
    Customer mCustomer;

    private void main() {
        final Pay alipay = new Pay() {
            @Override
            public void payment(int payment) throws NotEnoughMoneyException {
                if (payment > 5000) {
                    throw new NotEnoughMoneyException();
                }
                Utils.print("cash money : " + payment );
            }
        };

        DaggerStoreComponent.create()
                .newShoppingComponent(new CustomerModule(alipay))
                .inject(this);

        Computer computer = null;
        try {
            computer = mStore.buy(Computer.class, mCustomer);
        } catch (Store.PaymentException e) {
            Utils.print("payment fail....");
            return;
        }
        computer.setup();
        computer.word();
        computer.ppt();
        computer.shutdown();
    }

}
