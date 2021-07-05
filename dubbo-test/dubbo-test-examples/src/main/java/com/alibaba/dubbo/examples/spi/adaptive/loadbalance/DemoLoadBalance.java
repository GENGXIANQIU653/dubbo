package com.alibaba.dubbo.examples.spi.adaptive.loadbalance;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invocation;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.dubbo.rpc.cluster.LoadBalance;

import java.util.List;

/**
 * @author xianqiu.geng
 * @Date 2021/7/5 下午5:44
 * @Copyright zhangmen
 */
public class DemoLoadBalance implements LoadBalance {
    @Override
    public <T> Invoker<T> select(List<Invoker<T>> invokers, URL url, Invocation invocation) throws RpcException {
        System.out.println("[DemoLoadBalance] Select the first invoker...");
        return invokers.get(0);
    }
}
