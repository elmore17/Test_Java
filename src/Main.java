import java.sql.*;
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Задание №1:");
        String userName = "root";
        String password = "";//Ваш пароль от БД
        String connectionUrl = "jdbc:mysql://localhost:3306/testdb";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
        Statement statement = connection.createStatement()){
//            statement.executeUpdate("insert into staff set surname = 'Иванов', experience = '10'");
//            statement.executeUpdate("insert into staff set surname = 'Петров', experience = '12'");
//            statement.executeUpdate("insert into staff set surname = 'Сидоров', experience = '14'");
            ResultSet resultSet = statement.executeQuery("select surname from staff order by experience desc limit 1 offset 1");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}