import java.util.*;
import java.util.regex.Pattern;

class ResumeSort{
    private int count;
    private int index;
    public ResumeSort(int count,int index){
        this.count=count;
        this.index=index;
    }
    public int getCount() {
        return count;
    }
    public int getIndex() {
        return index;
    }
}

class InvalidResumeException extends Exception{
    public InvalidResumeException(String message) {
        super(message);
    }
}

public class ResumeShortlisting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Resume> res = new ArrayList<>();
        Set<String> reqskills=new HashSet<>();
        while(true){
            System.out.println("1. Add Resume \n2. Add Requirement Skills \n3. See Shorted Resumes \n4. End");
            int n=sc.nextInt();
            switch (n) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter Name ->");
                    String name=sc.nextLine();
                    System.out.println("Enter Email ->");
                    String email=sc.nextLine();
                    System.out.println("Enter Phone Number ->");
                    String phoneNumber=sc.nextLine();
                    System.out.println("Enter Skills with space seprated ->");
                    String skills=sc.nextLine();
                    skills=skills.toLowerCase();
                    System.out.println("Enter Experience ->");
                    String experience=sc.nextLine();
                    try {
                        if(name.isEmpty() || phoneNumber.isEmpty() || email.isEmpty() || skills.isEmpty() || experience.isEmpty()){
                            throw new InvalidResumeException("All fields are required to proceed");
                        }
                        String nameRegex = "^[A-Za-z ]+$";
                        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
                        String phoneRegex = "^[6-9][0-9]{9}$";

                        if(!Pattern.matches(nameRegex, name)){
                            throw new InvalidResumeException("Invalid name format");
                        }
                        if(!Pattern.matches(emailRegex, email)){
                            throw new InvalidResumeException("Invalid email format");
                        }
                        if(!Pattern.matches(phoneRegex, phoneNumber)){
                            throw new InvalidResumeException("Invalid phone number format");
                        }
                        res.add(new Resume(name,email,phoneNumber,skills,experience));
                    } catch(InvalidResumeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Enter Required Skills with space seprated->");
                    String reqskill=sc.nextLine();
                    reqskill=reqskill.toLowerCase();
                    String[] reqsk=reqskill.split(" ");
                    for(String s:reqsk){
                        if(!reqskills.contains(s)){
                            reqskills.add(s);
                        }
                    }
                    break;
                case 3:
                    List<ResumeSort>list=new ArrayList<>();
                    int z=0;
                    for(Resume li:res){
                        String[] skill=li.getSkills().split(" ");
                        int count=0;
                        for(String s:skill){
                            if(reqskills.contains(s)){
                                count++;
                            }
                        }
                        list.add(new ResumeSort(count,z));
                        z++;
                    }
                    Collections.sort(list,(a,b)->b.getCount()-a.getCount());
                    System.out.println("Name of Shortlisted people based on reqired skills are ->");
                    int a=1;
                    for(ResumeSort l:list){
                        System.out.println("     "+ a +". "+res.get(l.getIndex()).getName());
                        a++;
                    }
                    System.out.println();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

