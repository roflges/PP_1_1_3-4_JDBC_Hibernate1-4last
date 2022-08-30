package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Евгений", "Смелов", (byte) 24);
        userService.saveUser("Екатерина", "Богданова", (byte) 32);
        userService.saveUser("Иван", "Петров", (byte) 31);
        userService.saveUser("Юлия", "Сергеева", (byte) 25);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}