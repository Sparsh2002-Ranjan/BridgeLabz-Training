package jasonpractice;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = objectMapper.readValue(new File("user.json"), User.class);

        System.out.println("User Name: " + user.getName());
        System.out.println("Skills: " + user.getSkills());
    }
}
