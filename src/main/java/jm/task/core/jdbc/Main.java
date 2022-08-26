package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        UserService userDao = new UserServiceImpl();
        userDao.createUsersTable();
        userDao.saveUser("Виктор", "Калянов", (byte) 28);
        userDao.saveUser("Иван", "Сиднев", (byte) 28);
        userDao.saveUser("Евгений", "Ходов", (byte) 28);
        userDao.saveUser("Владислав", "Листопад", (byte) 22);
        System.out.println(userDao.getAllUsers());
        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        userDao.getAllUsers();
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        System.out.println(userDao.getAllUsers());
        try {
            userDao.dropUsersTable();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}