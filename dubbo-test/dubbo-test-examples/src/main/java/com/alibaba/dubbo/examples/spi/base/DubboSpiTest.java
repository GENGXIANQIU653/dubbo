package com.alibaba.dubbo.examples.spi.base;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * @author xianqiu.geng
 * @Date 2021/7/5 上午10:38
 * @Copyright zhangmen
 */
public class DubboSpiTest {

    public static void main(String[] args) {

        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
        optimusPrime.sayHello();
    }

}
