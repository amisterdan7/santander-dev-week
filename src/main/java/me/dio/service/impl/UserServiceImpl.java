package me.dio.service.impl;


import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userrepository;

    public UserServiceImpl(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    @Override
    public User findById(Long id) {
        return userrepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public boolean existsByAccountNumber(String accountNumber) {
        return false;
    }


    @Override
    public User create(User userToCreate) {
        if (userToCreate.getId() != null && userrepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("this Account number ID already exists");
    }
        return userrepository.save(userToCreate);
}
}
