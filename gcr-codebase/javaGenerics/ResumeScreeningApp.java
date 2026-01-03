import java.util.*;

abstract class JobRole {
    private final String roleName;

    protected JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract int requiredExperience();

    @Override
    public String toString() {
        return roleName + " | Min Experience: " + requiredExperience() + " yrs";
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    public int requiredExperience() {
        return 2;
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    public int requiredExperience() {
        return 3;
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    public int requiredExperience() {
        return 4;
    }
}

class Resume<T extends JobRole> {
    private final String candidateName;
    private final int experience;
    private final T jobRole;

    public Resume(String candidateName, int experience, T jobRole) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.jobRole = jobRole;
    }

    public boolean isEligible() {
        return experience >= jobRole.requiredExperience();
    }

    public T getJobRole() {
        return jobRole;
    }

    @Override
    public String toString() {
        return candidateName + " | Role: " + jobRole.getRoleName() +
               " | Exp: " + experience + " | Eligible: " + isEligible();
    }
}

class ScreeningUtil {
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println(resume);
    }

    public static void screenPipeline(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening pipeline ready for: " + role.getRoleName());
        }
    }
}

public class ResumeScreeningApp {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 =
                new Resume<>("Aarav", 3, new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Meera", 2, new DataScientist());

        Resume<ProductManager> r3 =
                new Resume<>("Kabir", 5, new ProductManager());

        ScreeningUtil.screenResume(r1);
        ScreeningUtil.screenResume(r2);
        ScreeningUtil.screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningUtil.screenPipeline(roles);
    }
}
