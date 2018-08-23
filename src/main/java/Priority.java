import java.util.ArrayList;
import java.util.List;

/**
 * 测试线程的优先级
 */
public class Priority {
    private static volatile boolean nostart = true;
    private static volatile boolean noend = true;

    public static void main(String[] args){
        List<Job> jobs = new ArrayList<>();
        for (int i=0; i<10; i++){
            int priority = i < 5 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY;
            Job job = new Job(priority);
            jobs.add(job);
            Thread thread = new Thread(job, "Thread" + i);
            thread.setPriority(priority);
            thread.start();
        }

        nostart = false;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        noend = false;
        for (Job job : jobs){
            System.out.println("Job Priority : " + job.priority + ", Count : " + job.jobCount);
        }
    }

    static class Job implements Runnable{
        private int priority;
        private long jobCount;

        public Job(int priority) {
            this.priority = priority;
        }

        @Override
        public void run() {
            while (nostart){
                Thread.yield();
            }
            while (noend){
                Thread.yield();
                jobCount++;
            }
        }
    }
}
