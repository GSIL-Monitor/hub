package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by songweiliang on 2017/8/14.
 */
public class ServiceImpl extends UnicastRemoteObject implements IService{

    protected ServiceImpl() throws RemoteException{
        super();
    }
    private static final long serialVersionUID = 682805210518738166L;
    public String queryName(String bo) throws RemoteException {
        //具体方法实现
        System.out.print("hello" + bo);
        return String.valueOf(System.currentTimeMillis());
    }
}
