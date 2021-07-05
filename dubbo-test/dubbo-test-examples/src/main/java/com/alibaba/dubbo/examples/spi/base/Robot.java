package com.alibaba.dubbo.examples.spi.base;


import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author xianqiu.geng
 * @Date 2021/7/3 下午7:14
 * @Copyright zhangmen
 */
@SPI
public interface Robot {
    /***
     * method
     */
    void sayHello();
}
