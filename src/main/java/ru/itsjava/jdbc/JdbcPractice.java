package ru.itsjava.jdbc;

import ru.itsjava.jdbc.dao.UserJdbcImpl;
import ru.itsjava.jdbc.dao.UsersDao;

public class JdbcPractice {
//    public static final String DB_URL = "jbdc:MySql://localhost:3306/schema_online_course.users?serverTimezone=UTC";
//    public static final String DB_LOGIN = "root";
//    public static final String DB_PASSWORD = "";
    public static void main(String[] args) {
        UsersDao dao = new UserJdbcImpl();
        System.out.println("dao.getAgeByUserName(\"megan\") = " + dao.getAgeByUserName("megan"));
    }
}
