package com.donggua.strategypattern;

/**
 * 策略接口
 *
 * 首先定一个策略接口，这是诸葛亮老人家给赵云的三个锦囊妙计的接口
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public interface IStrategy {

    /**
     * 每个锦囊妙计都是一个可执行的算法
     */
    void operate();
}
