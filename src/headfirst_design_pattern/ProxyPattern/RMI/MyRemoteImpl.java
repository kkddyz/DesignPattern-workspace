package headfirst_design_pattern.ProxyPattern.RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/** 远程对象 服务对象*/
public class MyRemoteImpl extends UnicastRemoteObject /*单播远程对象*/ implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    // 服务独对象不会抛出异常
    @Override
    public String sayHello()  {
        return "Server says,'hey' ";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
