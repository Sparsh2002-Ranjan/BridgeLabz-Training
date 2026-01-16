import java.lang.reflect.*;

public class BugTracker {

    @BugReport(description="Null pointer issue")
    @BugReport(description="Performance issue")
    public void process() {}

    public static void main(String[] args) throws Exception {
        Method m = BugTracker.class.getMethod("process");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);
        for (BugReport b : bugs) {
            System.out.println(b.description());
        }
    }
}