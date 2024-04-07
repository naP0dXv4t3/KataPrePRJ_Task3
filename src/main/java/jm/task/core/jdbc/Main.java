package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();
        userService.saveUser("Тайлер", "Дерден", (byte) 27);
        userService.saveUser("Роберт", "Полсен", (byte) 31);
        userService.saveUser("Райан", "Гослинг", (byte) 59);
        userService.saveUser("testName", "TestSurname", (byte) 60);

        userService.removeUserById(2);

        userService.getAllUsers();

        //userService.cleanUsersTable();

        //userService.dropUsersTable();
    }
}
