package rmi;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by songweiliang on 2017/8/14.
 */
public class Server {
    public static void main(String[] arg){
        Registry registry = null;
        try {
            registry = LocateRegistry.createRegistry(8088);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        ServiceImpl service = null;
        try {
            service = new ServiceImpl();
            //创建一个服务
            registry.bind("vince",service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

        System.out.println("bind service success");
    }
}
