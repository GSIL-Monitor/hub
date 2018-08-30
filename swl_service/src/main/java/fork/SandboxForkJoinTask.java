//package fork;
//
//import com.dianping.mobile.prisma.api.sanbox.service.SandboxService;
//import com.dianping.mobile.prisma.api.sanbox.vo.ChartDataVo;
//import com.dianping.mobile.prisma.api.sanbox.vo.SandboxSearchVo;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.concurrent.RecursiveTask;
//
///**
// * create by songweiliang on 2018/7/25
// */
//public class SandboxForkJoinTask extends RecursiveTask<List<ChartDataVo>> {
//    private static final int HOLD = 1;
//    private List<Date> dateList;
//    int start;
//    int end;
//    private SandboxService service;
//    private SandboxSearchVo sandboxSearchVo;
//
//    public SandboxForkJoinTask(List<Date> dateList, SandboxService service, SandboxSearchVo sandboxSearchVo, int start, int end){
//        this.dateList = dateList;
//        this.start = start;
//        this.end = end;
//        this.service = service;
//        this.sandboxSearchVo = sandboxSearchVo;
//    }
//    @Override
//    protected List<ChartDataVo> compute() {
//        if(end - start <= HOLD){
//
//            sandboxSearchVo.setFromTime(dateList.get(start));
//            sandboxSearchVo.setEndTime(dateList.get(end));
//            return service.getChartDataVos(sandboxSearchVo);
//
//        }else{
//            int middle = (end + start) / 2;
//
//            SandboxSearchVo sandboxSearchVo1 = new SandboxSearchVo();
//            sandboxSearchVo1.setType(sandboxSearchVo.getType());
//            SandboxSearchVo sandboxSearchVo2 = new SandboxSearchVo();
//            sandboxSearchVo2.setType(sandboxSearchVo.getType());
//            SandboxForkJoinTask forkJoinTask1 = new SandboxForkJoinTask(dateList,service,sandboxSearchVo1,start,middle);
//            if(middle*2<end+start){
//                middle = middle+1;
//            }
//            SandboxForkJoinTask forkJoinTask2 = new SandboxForkJoinTask(dateList,service,sandboxSearchVo2,middle,end);
////            invokeAll(forkJoinTask1,forkJoinTask2);
//            forkJoinTask1.fork();
//            forkJoinTask2.fork();
//            List<ChartDataVo> result1 = forkJoinTask1.join();
//            List<ChartDataVo> result2 = forkJoinTask2.join();
//            List<ChartDataVo> result = new ArrayList<>();
//            result.addAll(result1);
//            result.addAll(result2);
//            return result;
//        }
//    }
//}
