public class Resume {
    private String name;
    private String email;
    private String phoneNumber;
    private String skills;
    private String experience;

    public Resume(String name, String email, String phoneNumber, String skills, String experience) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.skills = skills;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSkills() {
        return skills;
    }

    public String getExperience() {
        return experience;
    }
    
}
