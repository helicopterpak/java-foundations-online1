package ru.itsjava.jdbc.dao;

import java.sql.*;

public class UserJdbcImpl implements UsersDao {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/schema_online_course.users?serverTimezone=UTC";
    public static final String DB_LOGIN = "root";
    public static final String DB_PASSWORD = "";

    @Override
    public int getAgeByUserName(String firstname) {
//        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
//            PreparedStatement preparedStatement = connection.prepareStatement("SELECT age FROM schema_online_course.users where firstname = ?")
//            ){
//            preparedStatement.setString(1, "megan");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            resultSet.next();
//            return resultSet.getInt("age");
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return -1;

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             Statement statement = connection.createStatement()
        ){
            ResultSet resultSet = statement.executeQuery("SELECT age FROM schema_online_course.users " +
                    "where firstname = '" + firstname + "'");
            resultSet.next();
            System.out.println(resultSet.getInt("age"));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return 0;
        }
    }
