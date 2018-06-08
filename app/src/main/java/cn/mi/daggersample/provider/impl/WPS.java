package cn.mi.daggersample.provider.impl;

import cn.mi.daggersample.Utils;
import cn.mi.daggersample.provider.Office;

/**
 * Created by Jackwang on 08/06/2018.
 * Email: jackwang2048@gmail.com
 * Github: wangjie2013
 */

public class WPS implements Office {
    @Override
    public void word() {
        Utils.print("open word.");
    }

    @Override
    public void ppt() {
        Utils.print("open ppt.");
    }
}
