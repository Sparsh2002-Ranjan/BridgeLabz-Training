import java.io.*;

public class ConvertImage {
    private static final String File1 = "source.txt";

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream(File1);
             ByteArrayOutputStream stm = new ByteArrayOutputStream()) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                stm.write(byteData);
            }
            System.out.println("Original content from file:");
             System.out.println(new String(stm.toByteArray()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
