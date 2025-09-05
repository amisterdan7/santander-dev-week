package me.dio.service;

import me.dio.domain.model.User;



public interface UserService {

    User findById(Long id);
    boolean existsByAccountNumber(String accountNumber);

    User create(User userToCreate);
}
