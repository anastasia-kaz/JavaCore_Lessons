package by.lessons.lesson12.service;

import by.lessons.lesson12.entity.User;
import by.lessons.lesson12.exception.NotCorrectPasswordException;
import by.lessons.lesson12.repository.UserRepository;

public class UserService {
    public User authenticate (String login, String password){
        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);
        if (user.getPassword().equals(password)){
            System.out.println("Аутентификация прошла успешно");
            return user;
        }
        throw new NotCorrectPasswordException("Неверный логин или пароль!");

    }
}
