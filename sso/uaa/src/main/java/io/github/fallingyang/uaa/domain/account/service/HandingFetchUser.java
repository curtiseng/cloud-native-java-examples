package io.github.fallingyang.uaa.domain.account.service;

import io.github.fallingyang.uaa.domain.account.entity.Account;
import io.github.fallingyang.uaa.domain.account.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author yangzifeng
 */
@Service
public class HandingFetchUser {

    private UserRepository userRepository;

    public HandingFetchUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<Account> getUserByLogin(String login) {
        return userRepository.findOneByLogin(login);
    }

}
