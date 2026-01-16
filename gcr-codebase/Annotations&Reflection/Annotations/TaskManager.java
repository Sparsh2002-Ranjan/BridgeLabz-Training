import java.lang.reflect.*;

public class TaskManager {

    @TaskInfo(priority="HIGH", assignedTo="Amit")
    public void completeTask() {}

    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("completeTask");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println(info.priority() + " " + info.assignedTo());
    }
}