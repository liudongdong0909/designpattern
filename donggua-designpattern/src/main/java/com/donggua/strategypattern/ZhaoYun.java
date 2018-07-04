package com.donggua.strategypattern;

/**
 * 赵云 - 使用锦囊妙计
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/4
 */
public class ZhaoYun {


    public static void main(String[] args) {

        Context context;

        // 刚到吴国拆开第一个锦囊
        System.out.println("=== 刚到吴国 打开第一锦囊 ===");
        // 拿到妙计
        context = new Context(new BackDoor());
        // 执行妙计
        context.operate();

        System.out.println("\n\n");


        // 刘备乐不思蜀拆开第二个锦囊
        System.out.println("=== 刘备乐不思蜀 打开第二个锦囊 ===");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n");

        // 后有追兵拆开第三个锦囊
        System.out.println("=== 后有追兵 打开第三个锦囊 ===");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n");
    }
}


