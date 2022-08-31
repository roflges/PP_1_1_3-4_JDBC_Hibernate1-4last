package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("John", "Doe", (byte) 36);
        userDao.saveUser("Jane", "Doe", (byte) 24);
        userDao.saveUser("Jake", "Doe", (byte) 25);
        userDao.saveUser("Joe", "Doe", (byte) 31);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
