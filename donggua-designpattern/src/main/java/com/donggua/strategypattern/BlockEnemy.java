package com.donggua.strategypattern;

/**
 * 孙夫人断后，挡住追兵
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public class BlockEnemy extends AbstractStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
