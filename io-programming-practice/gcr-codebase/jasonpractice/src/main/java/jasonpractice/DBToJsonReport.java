package jasonpractice;

import java.sql.*;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DBToJsonReport {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";

        Connection con = DriverManager.getConnection(url, user, pass);
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(
                "SELECT id, name, age, email FROM users"
        );

        List<Map<String, Object>> report = new ArrayList<>();

        while (rs.next()) {
            Map<String, Object> row = new LinkedHashMap<>();
            row.put("id", rs.getInt("id"));
            row.put("name", rs.getString("name"));
            row.put("age", rs.getInt("age"));
            row.put("email", rs.getString("email"));
            report.add(row);
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new java.io.File("report.json"), report);

        con.close();
    }
}

