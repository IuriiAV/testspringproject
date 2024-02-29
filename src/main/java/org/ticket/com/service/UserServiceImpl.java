package org.ticket.com.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.ticket.com.entity.UserEntity;
import org.ticket.com.exceptions.UserNotFoundException;
import org.ticket.com.repository.UserJpaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserJpaRepository repository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserEntity create(UserEntity userEntity) {
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));
        return repository.save(userEntity);
    }

    @Override
    public UserEntity getByLogin(String login) {
        return repository.findAllByLogin(login).orElseThrow(
                () -> new UserNotFoundException("User with login " + login +
                        "not found"));
    }

    @Override
    public List<UserEntity> getAll() {
        return repository.findAll();
    }
}
