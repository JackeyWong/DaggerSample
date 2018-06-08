package cn.mi.daggersample;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public class Customer implements Pay {
    private final Pay mPayment;


    public Customer(Pay payment) {
        this.mPayment = payment;
    }

    @Override
    public void payment(int payment) throws NotEnoughMoneyException {
        this.mPayment.payment(payment);
    }
}
