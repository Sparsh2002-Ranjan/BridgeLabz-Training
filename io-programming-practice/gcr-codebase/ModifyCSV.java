import java.io.*;

public class ModifyCSV {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        FileWriter writer = new FileWriter("updated_employees.csv");
        String line = br.readLine();
        writer.write(line + "\n");
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[2].equals("IT")) {
                double salary = Double.parseDouble(data[3]);
                salary = salary + (salary * 0.10);
                writer.write(data[0] + "," + data[1] + "," + data[2] + "," + salary + "\n");
            } else {
                writer.write(line + "\n");
            }
        }
        br.close();
        writer.close();
    }
}
