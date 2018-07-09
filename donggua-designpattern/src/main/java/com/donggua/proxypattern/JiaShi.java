package com.donggua.proxypattern;

/**
 * $$
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/9
 */
public class JiaShi implements KindWomen{

    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("贾氏和男人 那个什么了 。。。。 ");
    }
}
