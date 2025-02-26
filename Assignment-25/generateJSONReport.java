import com.fasterxml.jackson.databind.ObjectMapper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class generateJSONReport {
    static class User {
        public String name;
        public int age;
        public User(String name, int age) { this.name = name; this.age = age; }
    }

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT name, age FROM users");
        List<User> users = new ArrayList<>();
        while (rs.next()) users.add(new User(rs.getString("name"), rs.getInt("age")));
        System.out.println(new ObjectMapper().writeValueAsString(users));
    }
}
