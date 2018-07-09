package com.donggua.proxypattern;

/**
 * 定义一种类型的女人，王婆和潘金莲都属于这个类型的女人
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/9
 */
public interface KindWomen {

    // 这种女人要做的就是下面的两件事情

    /**
     * 抛媚眼
     */
    public void makeEyesWithMan();

    /**
     * What?
     */
    public void happyWithMan();
}
