import java.lang.reflect.*;

public class ExecutionLogger {

    @LogExecutionTime
    public void heavyTask() throws Exception {
        Thread.sleep(200);
    }

    public static void main(String[] args) throws Exception {
        ExecutionLogger obj = new ExecutionLogger();
        Method m = obj.getClass().getMethod("heavyTask");
        if (m.isAnnotationPresent(LogExecutionTime.class)) {
            long start = System.nanoTime();
            obj.heavyTask();
            long end = System.nanoTime();
            System.out.println(end - start);
        }
    }
}