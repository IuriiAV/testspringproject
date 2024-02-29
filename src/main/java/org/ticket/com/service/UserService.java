package org.ticket.com.service;

import org.ticket.com.entity.UserEntity;

import java.util.List;

public interface UserService {

    UserEntity create(UserEntity userEntity);

    UserEntity getByLogin(String login);

    List<UserEntity> getAll();
}
