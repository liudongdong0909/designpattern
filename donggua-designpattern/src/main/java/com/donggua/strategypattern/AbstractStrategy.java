package com.donggua.strategypattern;

/**
 * $$
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public abstract class AbstractStrategy implements IStrategy {


    public void validate(){
        System.out.println("这是所有策略所共有的校验方法");
    }

}
