package cn.mi.daggersample.provider.impl;

import cn.mi.daggersample.Utils;
import cn.mi.daggersample.provider.IOutput;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public class Display implements IOutput {
    @Override
    public void run() {
        Utils.print("Display runing...");
    }
}
