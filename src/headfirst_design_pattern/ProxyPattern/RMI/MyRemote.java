package headfirst_design_pattern.ProxyPattern.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

// 制作远程接口 目的是什么？？ 调用实现MyRemote接口的stub对象
public interface MyRemote extends Remote /*1.扩展remote接口 */ {
    public String sayHello() throws RemoteException/*2. 所有方法都抛出异常，涉及到网络和IO是有风险的*/;

}
