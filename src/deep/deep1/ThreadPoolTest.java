package deep.deep1;

import deep.Main;

import java.util.Collection;
import java.util.concurrent.*;

/** 线程池的创建
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/14/2018 11:22 AM
 */
public class ThreadPoolTest {

    public void create(){
        ExecutorService executorService = new ThreadPoolExecutor(2,2,0,
                TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(512),
                new ThreadPoolExecutor.DiscardPolicy());
        Future<Object> future = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception{
                throw new RuntimeException("exception in call");
            }
        });
        try{
            Object result = future.get();
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch(ExecutionException e){
            e.printStackTrace();
        }
    }

    public void solve(Executor executor, Collection<Callable<Main>> solvers) throws InterruptedException, ExecutionException {
        CompletionService<Main> ecs = new ExecutorCompletionService<Main>(executor);
        for(Callable<Main> s:solvers){   //提交所有任务
            ecs.submit(s);
        }
        int n = solvers.size();
        for(int i=0;i<n;i++){          //获取每一个完成的任务
            Main main = ecs.take().get();
            if(main != null){

            }

        }
    }
}
