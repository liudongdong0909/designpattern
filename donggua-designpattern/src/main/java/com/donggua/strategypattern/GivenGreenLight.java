package com.donggua.strategypattern;

/**
 * 求吴国太开个绿灯
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public class GivenGreenLight extends AbstractStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开个绿灯,放行!");
    }

}
