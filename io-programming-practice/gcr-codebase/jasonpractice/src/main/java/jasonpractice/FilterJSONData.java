package jasonpractice;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJSONData {

    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        User[] users = objectMapper.readValue(
                new File("users.json"),
                User[].class
        );

        for (User user : users) {
            if (user.getAge() > 25) {
                System.out.println(
                        user.getName() + " \nAge: " + user.getAge() + " \nEmail: " + user.getEmail()
                );
            }
        }
    }
}
