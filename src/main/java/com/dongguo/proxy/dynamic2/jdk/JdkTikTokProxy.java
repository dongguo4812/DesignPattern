package com.dongguo.proxy.dynamic2.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Administrator
 * @Date: 2023-12-22
 */
public class JdkTikTokProxy<T> implements InvocationHandler {

    private T target;

    public JdkTikTokProxy(T target) {
        this.target = target;
    }

    public static<T> T getProxy(T t){
        Object o = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new JdkTikTokProxy(t));
        return (T) o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("被代理对象执行的方法");
        return method.invoke(target, args);
    }
}
