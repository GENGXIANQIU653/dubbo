package com.alibaba.dubbo.examples.spi.base;

/**
 * @author xianqiu.geng
 * @Date 2021/7/3 下午7:17
 * @Copyright zhangmen
 * OptimusPrim
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
