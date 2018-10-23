package org.programirame.configuration.security;

import org.programirame.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    public User createUser(String username, String password) {
        return userRepository.save(new User(username, passwordEncoder.encode(password)));
    }

}
