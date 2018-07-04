package com.donggua.strategypattern;

/**
 *
 * 找乔国老帮忙，使孙权不能杀刘备
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public class BackDoor extends AbstractStrategy {

    @Override
    public void operate() {
        //super.validate();
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }

}
