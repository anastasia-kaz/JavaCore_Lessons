package by.lessons.lesson12.repository;

import by.lessons.lesson12.entity.User;
import by.lessons.lesson12.exception.UserNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserRepository extends Exception{

    public static List<User> users = new ArrayList<>();

    static {
        User user1 = new User ("Masha", "qwerty", "Маша", "Иванова");
        User user2 = new User ("Pasha", "asdfg", "Паша", "Петрова");
        User user3 = new User ("Sasha", "zxcvb", "Саша", "Семенова");
        User user4 = new User ("Rasha", "qwert12", "Раша", "Михайлова");
        User user5 = new User ("Gasha", "qwert456", "Гаша", "Трофимовна");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }


    public User searchUserByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        throw new UserNotFoundException("Такого пользователя не найдено!");

    }


}
