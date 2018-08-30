//package tuniu.test;
//
//import com.dianping.mobile.basic.AbstractTestObject;
//import com.dianping.mobile.basic.remote.prisma.dto.SandboxDto;
//import org.joda.time.DateTime;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.zip.CRC32;
//
//import static org.junit.Assert.*;
//
///**
// * create by songweiliang on 2018/7/20
// */
//public class SanboxLogServiceImplTest extends AbstractTestObject{
//
//    @Autowired
//    SanboxLogServiceImpl sanboxLogService;
//
//    @Test
//    public void queryByCondition() {
//        SandboxDto sandboxDto = new SandboxDto();
//        sandboxDto.setUnionId("989998999999889");
//        List<SandboxDto> sandboxDtos = sanboxLogService.queryByCondition(sandboxDto);
//        System.out.println(sandboxDtos);
//    }
//
//    @Test
//    public void insertDo() {
//        SandboxDto sandboxDto = new SandboxDto();
//        sandboxDto.setAppId(1);
//        sandboxDto.setAppVersion("10.0.1");
//        sandboxDto.setDeviceModel("iphone");
//        sandboxDto.setDpId("1111111111");
//        sandboxDto.setLogTime(new Date());
//        sandboxDto.setLogType("sandbox");
//        sandboxDto.setPlatform("iOS");
//        sandboxDto.setSize(100);
//        sandboxDto.setSysVersion("11.03");
//        sandboxDto.setUnionId("98999899898989989");
//        sanboxLogService.insertDo(sandboxDto);
//    }
//
//    @Test
//    public void batchInsertDo() {
//        List<SandboxDto> sandboxDtoList = new ArrayList<>();
//        CRC32 crc32 = new CRC32();
//        for(int i=0;i<100;i++){
//            SandboxDto sandboxDto = new SandboxDto();
//            sandboxDto.setAppId(1);
//            sandboxDto.setAppVersion("10.0.1");
//            sandboxDto.setDeviceModel("iphone");
//            sandboxDto.setDpId(1111111111+i+"");
//            sandboxDto.setLogTime(new Date());
//            sandboxDto.setLogType("sandbox");
//            sandboxDto.setPlatform("iOS");
//            sandboxDto.setSize(100);
//            sandboxDto.setSysVersion("11.03");
//            sandboxDto.setUnionId(989998999999888L+1+"");
//            crc32.update(sandboxDto.getDpId().getBytes());
//            sandboxDto.setDpIdCrc32(crc32.getValue());
//            crc32.update(sandboxDto.getUnionId().getBytes());
//            sandboxDto.setUnionIdCrc32(crc32.getValue());
//            sandboxDtoList.add(sandboxDto);
//        }
//        sanboxLogService.batchInsertDo(sandboxDtoList);
//    }
//
//    @Test
//    public void test() throws ParseException {
//        SandboxDto sandboxDto = new SandboxDto();
//        CRC32 crc32 = new CRC32();
//        crc32.update("4953536233762774077".getBytes());
//        sandboxDto.setDpIdCrc32(crc32.getValue());
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        sandboxDto.setFromTime(dateFormat.parse("2018-07-22 00:00:00"));
//        sandboxDto.setEndTime(dateFormat.parse("2018-07-22 21:00:00"));
//        List<SandboxDto> re = sanboxLogService.queryByLogTimeAndDpId(sandboxDto);
//        System.out.println(re);
//    }
//    @Test
//    public void test1() throws ParseException {
//        SandboxDto sandboxDto = new SandboxDto();
//        CRC32 crc32 = new CRC32();
//        crc32.update("-8240256779564194800".getBytes());
//        sandboxDto.setUnionIdCrc32(crc32.getValue());
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        sandboxDto.setFromTime(dateFormat.parse("2018-07-22 00:00:00"));
//        sandboxDto.setEndTime(dateFormat.parse("2018-07-22 21:00:00"));
//        List<SandboxDto> re = sanboxLogService.queryByLogTimeAndUnionId(sandboxDto);
//        System.out.println(re);
//    }
//    @Test
//    public void test2() throws ParseException {
//        SandboxDto sandboxDto = new SandboxDto();
//
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        sandboxDto.setFromTime(dateFormat.parse("2018-07-22 00:00:00"));
//        sandboxDto.setEndTime(dateFormat.parse("2018-07-22 01:00:00"));
//        List<SandboxDto> re = sanboxLogService.queryAllByLogTime(sandboxDto);
//        System.out.println(re);
//    }
//}