package com.donggua.proxypattern;

/**
 * 定义一个西门庆，这人色中饿鬼
 *
 * @author donggua
 * @version 1.0
 * @create 2018/7/9
 */
public class XiMenQing {

    /**
     * 水浒里是这样写的:西门庆被潘金莲用竹竿敲了一下难道，痴迷了，
     * 被王婆看到了,就开始撮合两人好事，王婆作为潘金莲的代理人
     * 收了不少好处费，那我们假设一下:
     * 如果没有王婆在中间牵线，这两个不要脸的能成吗?难说的很!
     *
     * @param args
     */
    public static void main(String[] args) {

        // 王婆出来
        WangPo wangPo = new WangPo();

        // 然后西门庆就说，我要和潘金莲happy，然后王婆就安排了西门庆丢筷子的那出戏:
        wangPo.makeEyesWithMan(); //看到没，虽然表面上时王婆在做，实际上爽的是潘金莲
        wangPo.happyWithMan();

        // 勾结贾氏
        WangPo wangPo1 = new WangPo(new JiaShi()); //让王婆作为贾氏的代理人
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}
