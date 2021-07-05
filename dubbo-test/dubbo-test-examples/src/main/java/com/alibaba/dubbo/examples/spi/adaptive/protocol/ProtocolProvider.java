package com.alibaba.dubbo.examples.spi.adaptive.protocol;

import com.alibaba.dubbo.examples.version.VersionProvider;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xianqiu.geng
 * @Date 2021/7/5 下午7:39
 * @Copyright zhangmen
 */
public class ProtocolProvider {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");
        String config = ProtocolProvider.class.getPackage().getName().replace('.', '/') + "/protocol-provider.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
        System.in.read();
    }
}
