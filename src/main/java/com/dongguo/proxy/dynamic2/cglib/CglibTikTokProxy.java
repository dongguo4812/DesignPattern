package com.dongguo.proxy.dynamic2.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Administrator
 * @Date: 2023-12-22
 */
public class CglibTikTokProxy{
    /**
     * 创建代理
     * @param t
     * @return
     * @param <T>
     */
    public static<T> T createProxy(T t) {
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置增强类,为该类创建一个子类
        enhancer.setSuperclass(t.getClass());
        //设置回调方法
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o,
                                    Method method,
                                    Object[] args,
                                    MethodProxy proxy) throws Throwable {
                //增强逻辑
                System.out.println("cglib动态代理");
                //调用父类 即目标对象的方法
                return proxy.invokeSuper(o, args);
            }
        });
        return (T) enhancer.create();
    }
}
