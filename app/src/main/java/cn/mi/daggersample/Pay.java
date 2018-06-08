package cn.mi.daggersample;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public interface Pay {

    void payment(int payment) throws NotEnoughMoneyException;

    class NotEnoughMoneyException extends Exception {
    }
}
