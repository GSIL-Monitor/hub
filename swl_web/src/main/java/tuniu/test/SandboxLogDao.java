//package tuniu.test;
//
//import com.dianping.avatar.dao.GenericDao;
//import com.dianping.avatar.dao.annotation.DAOAction;
//import com.dianping.avatar.dao.annotation.DAOActionType;
//import com.dianping.avatar.dao.annotation.DAOParam;
//import com.dianping.mobile.basic.remote.prisma.dto.SandboxDto;
//
//import java.util.List;
//
///**
// * create by songweiliang on 2018/7/20
// */
//public interface SandboxLogDao extends GenericDao {
//
//    @DAOAction(action = DAOActionType.QUERY)
//    List<SandboxDto> queryByCondition(@DAOParam("queryDto") SandboxDto data);
//
//    @DAOAction(action = DAOActionType.INSERT)
//    int insertDo(@DAOParam("insertDto") SandboxDto data);
//
//    @DAOAction(action = DAOActionType.INSERT)
//    int batchInsertDo(@DAOParam("dtoList") List<SandboxDto> list);
//
//
//    @DAOAction(action = DAOActionType.QUERY)
//    List<SandboxDto> queryByLogTimeAndDpId(@DAOParam("queryDto") SandboxDto data);
//
//    @DAOAction(action = DAOActionType.QUERY)
//    List<SandboxDto> queryAllByLogTime(@DAOParam("queryDto") SandboxDto data);
//
//    @DAOAction(action = DAOActionType.QUERY)
//    List<SandboxDto> queryByLogTimeAndUnionId(@DAOParam("queryDto") SandboxDto data);
//}
