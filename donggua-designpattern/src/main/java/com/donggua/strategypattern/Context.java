package com.donggua.strategypattern;

/**
 * 计谋有了，那还要有锦囊
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public class Context {

    private IStrategy strategy;

    /**
     * 构造函数，你要使用那个妙计
     * @param strategy
     */
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 使用计谋了，看我出招了
     */
    public void operate(){
        this.strategy.operate();
    }

}
