import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("students.csv");
        writer.write("ID,Name,Age,Marks\n");
        writer.write("4,Rahul,22,70\n");
        writer.write("5,Neha,23,80\n");
        writer.write("6,Amit,24,85\n");
        writer.write("7,Priya,25,88\n");
        writer.write("8,Karan,22,90\n");
        writer.close();
    }
}
