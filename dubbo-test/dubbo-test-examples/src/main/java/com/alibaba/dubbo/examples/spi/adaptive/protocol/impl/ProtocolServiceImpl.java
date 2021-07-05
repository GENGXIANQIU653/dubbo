package com.alibaba.dubbo.examples.spi.adaptive.protocol.impl;

import com.alibaba.dubbo.examples.spi.adaptive.protocol.api.ProtocolService;

/**
 * @author xianqiu.geng
 * @Date 2021/7/5 下午7:37
 * @Copyright zhangmen
 */
public class ProtocolServiceImpl implements ProtocolService {
    @Override
    public String sayHello(String name) {
        return "hello, " + name;
    }
}
