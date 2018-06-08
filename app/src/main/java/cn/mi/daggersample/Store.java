package cn.mi.daggersample;

import android.support.annotation.Nullable;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public interface Store {

    @Nullable
    <T> T buy(Class<T> clz, Pay payment) throws PaymentException;

    class PaymentException extends Exception {
        public PaymentException(Throwable cause) {
            super(cause);
        }
    }
}
