package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by songweiliang on 2017/8/14.
 */
public interface IService extends Remote {
    public String queryName(String bo) throws RemoteException;
}
