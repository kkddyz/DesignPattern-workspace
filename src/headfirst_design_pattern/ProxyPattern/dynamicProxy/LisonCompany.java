package headfirst_design_pattern.ProxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class LisonCompany implements InvocationHandler {

    // 被代理的对象
    private Object factory;

    public Object getFactory() {
        return factory;
    }

    public void setFactory(Object factory) {
        this.factory = factory;
    }

    /**
     * Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
     * @return
     */
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
        // 返回的员工就是一个代理类Instance 1. implement 接口 每一个接口都被覆盖 调用invoke方法
    }
    /**
     * 公司的服务流程 方法调用
     *
     * @param proxy  员工
     * @param method 当代理对象调用接口时 handler的invoke方法会知道调用者身份从而获取method对象
     * @param args   method.invoke(factory,args  )                              方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doSomethingBefore(); // 前置增强
        Object ret = method.invoke(factory, args);
        doSomethingEnd();    // 后置增强
        return ret;
    }

    private void doSomethingEnd() {
        System.out.println("doSomethingEnd.....");
    }

    private void doSomethingBefore() {
        System.out.println("doSomethingBefore.......");
    }
}


