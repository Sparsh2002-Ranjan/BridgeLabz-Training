import java.util.*;

class Employee{
    private int id;
    private String name;
    private char status;
    private char[] attendance;

    public Employee(int id,String name,char status,char[] attendance){
        this.id=id;
        this.name=name;
        this.status=status;
        this.attendance=attendance;
    }

    public int getId(){ return id; }
    public String getName(){ return name; }
    public char getStatus(){ return status; }
    public char[] getAttendance(){ return attendance; }
    public void setAttendance(char[] attendance){ this.attendance=attendance; }
}

interface ICompanyWage{
    void addCompany(String name,int wage,int days,int hours);
    void computeCompanyWage();
    int getTotalWage(String name);
}

class Company{
    String name;
    int wagePerHour;
    int maxDays;
    int maxHours;
    int totalWage;
    ArrayList<Integer> dailyWage = new ArrayList<>();

    Company(String n,int w,int d,int h){
        name=n;
        wagePerHour=w;
        maxDays=d;
        maxHours=h;
    }
}

class CompanyWageManager implements ICompanyWage{

    ArrayList<Company> companies = new ArrayList<>();
    HashMap<String,Company> map = new HashMap<>();
    Random r = new Random();

    public void addCompany(String name,int wage,int days,int hours){
        Company c = new Company(name,wage,days,hours);
        companies.add(c);
        map.put(name,c);
    }

    private int getHours(){
        int check = r.nextInt(3);
        switch(check){
            case 1: return 8;
            case 2: return 4;
            default: return 0;
        }
    }

    public void computeCompanyWage(){
        for(Company c:companies){

            int totalH=0, totalD=0;

            while(totalH<c.maxHours && totalD<c.maxDays){
                totalD++;
                int h=getHours();
                totalH+=h;
                int daily=h*c.wagePerHour;
                c.dailyWage.add(daily);
                c.totalWage+=daily;
            }

            System.out.println(c.name+" total wage: "+c.totalWage);
        }
    }

    public int getTotalWage(String name){
        if(map.containsKey(name))
            return map.get(name).totalWage;
        return -1;
    }
}

public class EmployeeWage{

    static int computeWage(char status,int presentDays){
        switch(status){
            case 'f': return presentDays*8*20;
            case 'p': return presentDays*4*20;
            default: return 0;
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee>emp=new ArrayList<>();
        CompanyWageManager manager = new CompanyWageManager();
        Random r=new Random();
        Scanner sc=new Scanner(System.in);

        manager.addCompany("ABC",20,20,100);
        manager.addCompany("XYZ",25,22,120);
        manager.computeCompanyWage();

        while(true){

            System.out.println("\nWelcome to Employee Wage Computation Program");
            System.out.println("1. Add Employee");
            System.out.println("2. Check Attendance");
            System.out.println("3. Daily Wage");
            System.out.println("4. Monthly Wage");
            System.out.println("5. Wage till 100 hrs / 20 days");
            System.out.println("6. Query Company Wage");
            System.out.println("7. Exit");

            int n=sc.nextInt();

            switch(n){

                case 1:
                    System.out.println("Enter id");
                    int id=sc.nextInt();

                    boolean exist=false;
                    for(Employee e:emp)
                        if(e.getId()==id) exist=true;

                    if(exist){
                        System.out.println("Employee exists");
                        break;
                    }

                    System.out.println("Enter name");
                    sc.nextLine();
                    String name=sc.nextLine();

                    System.out.println("f/p?");
                    char st=sc.next().charAt(0);

                    char[] att=new char[20];
                    for(int i=0;i<20;i++){
                        int c=r.nextInt(2);
                        switch(c){
                            case 0: att[i]='A'; break;
                            case 1: att[i]='P'; break;
                        }
                    }

                    emp.add(new Employee(id,name,st,att));
                    break;

                case 2:
                    System.out.println("Enter id");
                    int aid=sc.nextInt();

                    boolean found=false;

                    for(Employee e:emp){
                        if(e.getId()==aid){
                            found=true;
                            for(char c:e.getAttendance())
                                System.out.print(c+" ");
                            System.out.println();
                        }
                    }

                    if(!found) System.out.println("Not found");
                    break;

                case 3:
                    System.out.println("Enter id");
                    int did=sc.nextInt();

                    for(Employee e:emp)
                        if(e.getId()==did)
                            System.out.println("Daily wage: "+
                                computeWage(e.getStatus(),1));
                    break;

                case 4:
                    System.out.println("Enter id");
                    int mid=sc.nextInt();

                    for(Employee e:emp){
                        if(e.getId()==mid){
                            int p=0;
                            for(char c:e.getAttendance())
                                if(c=='P') p++;

                            System.out.println("Monthly wage: "+
                                computeWage(e.getStatus(),p));
                        }
                    }
                    break;

                case 5:
                    System.out.println("UC6 simulation running...");
                    int hrs=0,days=0,wage=0;

                    while(hrs<100 && days<20){
                        days++;
                        int h=r.nextInt(3);
                        int wh=(h==1)?8:(h==2)?4:0;
                        hrs+=wh;
                        wage+=wh*20;
                    }

                    System.out.println("Total wage till limit: "+wage);
                    break;

                case 6:
                    System.out.println("Enter company name");
                    String cname=sc.next();

                    int tw=manager.getTotalWage(cname);

                    if(tw==-1) System.out.println("Company not found");
                    else System.out.println("Total company wage: "+tw);
                    break;

                case 7:
                    System.exit(0);

                default:
                    System.out.println("Invalid");
            }
        }
    }
}
