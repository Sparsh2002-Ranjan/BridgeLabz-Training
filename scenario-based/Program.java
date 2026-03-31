import java.util.*;

class CreatorStats{
    private String CreatorName;
    private double[] WeeaklyLikes;

    public CreatorStats(String CreatorName,double[] WeeaklyLikes){
        this.CreatorName=CreatorName;
        this.WeeaklyLikes=WeeaklyLikes;
    }
    public String getCreatorName(){
        return CreatorName;
    }
    public double[] getWeeaklyLikes(){
        return WeeaklyLikes;
    }
    
    @Override
    public String toString(){
        return "CreatorName = "+CreatorName+"\n"+
                ",WeeaklyLikes = "+ Arrays.toString(WeeaklyLikes);
    }
}


public class Program {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<CreatorStats> EngagementBoard=new ArrayList<>();
        while(true){
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    EngagementBoard.add(AddCreator());
                    break;
                case 2:
                    show(EngagementBoard);
                    break;
                case 3:
                    Avg(EngagementBoard);
                    break;
                case 4:
                System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public static CreatorStats AddCreator(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Creator Name:");
        String name=sc.nextLine();
        double[] likes=new double[4];
        System.out.println("Enter weekly likes (Week 1 to 4):");
        for(int i=0;i<4;i++){
            likes[i]=sc.nextDouble();
        }
        System.out.println("Creator registered successfully");
        CreatorStats creator=new CreatorStats(name,likes);
        return creator;
    }
    public static void show(ArrayList<CreatorStats>EngagementBoard){
        System.out.println("Enter like threshold:");
        Scanner sc=new Scanner(System.in);
        double thold=sc.nextDouble();
        for(int i=0;i<EngagementBoard.size();i++){
            double[] likes=EngagementBoard.get(i).getWeeaklyLikes();
            int count=0;
            for(int j=0;j<likes.length;j++){
                if(likes[j]>=thold){
                    count++;
                }
            }
            if(count>0)System.out.println(EngagementBoard.get(i).getCreatorName() + " - " +count);
            else System.out.println("No top-performing posts this week");
        } 

    }

    public static void Avg(ArrayList<CreatorStats> EngagementBoard){
        double sum=0;
        for(int i=0;i<EngagementBoard.size();i++){
            double[] likes=EngagementBoard.get(i).getWeeaklyLikes();
            for(int j=0;j<likes.length;j++){
                sum=sum+likes[j];
            }
        }
        System.out.println("Overall average weekly likes:" + sum/(EngagementBoard.size()*4));
    }
}
