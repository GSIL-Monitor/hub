//package tuniu.test;
//
//import com.dianping.mobile.basic.prisma.dao.SandboxLogDao;
//import com.dianping.mobile.basic.remote.prisma.SanboxLogService;
//import com.dianping.mobile.basic.remote.prisma.dto.SandboxDto;
//import com.dianping.pigeon.remoting.provider.config.annotation.Service;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
///**
// * create by songweiliang on 2018/7/20
// */
//@Service
//public class SanboxLogServiceImpl implements SanboxLogService{
//
//    @Autowired
//    SandboxLogDao sandboxLogDao;
//
//    @Override
//    public List<SandboxDto> queryByCondition(SandboxDto data) {
//        return sandboxLogDao.queryByCondition(data);
//    }
//
//    @Override
//    public int insertDo(SandboxDto data) {
//        return sandboxLogDao.insertDo(data);
//    }
//
//    @Override
//    public int batchInsertDo(List<SandboxDto> dtoList) {
//        return sandboxLogDao.batchInsertDo(dtoList);
//    }
//
//    @Override
//    public List<SandboxDto> queryByLogTimeAndDpId(SandboxDto data) {
//        return sandboxLogDao.queryByLogTimeAndDpId(data);
//    }
//
//    @Override
//    public List<SandboxDto> queryAllByLogTime(SandboxDto data) {
//        return sandboxLogDao.queryAllByLogTime(data);
//    }
//
//    @Override
//    public List<SandboxDto> queryByLogTimeAndUnionId(SandboxDto data) {
//        return sandboxLogDao.queryByLogTimeAndUnionId(data);
//    }
//}
//
//
