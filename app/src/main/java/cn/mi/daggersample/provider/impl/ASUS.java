package cn.mi.daggersample.provider.impl;

import cn.mi.daggersample.Utils;
import cn.mi.daggersample.provider.MotherBoard;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public class ASUS implements MotherBoard {
    @Override
    public void run() {
        Utils.print("ASUS board running...");
    }
}
