
import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    public boolean isWeekendAvailable() { return weekendAvailable; }
    public String getSpecialty() { return specialty; }
    public String toString() { return name + " - " + specialty; }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = List.of(
            new Doctor("Dr.A", "Cardiology", true),
            new Doctor("Dr.B", "Neurology", false),
            new Doctor("Dr.C", "Orthopedics", true)
        );

        doctors.stream()
               .filter(Doctor::isWeekendAvailable)
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
