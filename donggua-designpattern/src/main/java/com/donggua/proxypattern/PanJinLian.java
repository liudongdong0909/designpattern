package com.donggua.proxypattern;

/**
 * 定一个潘金莲是什么样的人
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/9
 */
public class PanJinLian implements KindWomen {

    @Override
    public void makeEyesWithMan() {
        System.out.println("潘金莲抛媚眼");
    }

    @Override
    public void happyWithMan() {
        System.out.println("潘金莲和man 那个什么了。。。。。");
    }
}
