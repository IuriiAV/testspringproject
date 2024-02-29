package org.ticket.com.converter;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.ticket.com.dto.UserDto;
import org.ticket.com.entity.UserEntity;
import org.ticket.com.model.Role;

@Component
public class UserDtoConverter implements Converter<UserEntity, UserDto> {

    @Override
    public UserDto toDto(UserEntity userEntity) {
        return new UserDto(userEntity.getId(),
                userEntity.getLogin(),
                userEntity.getEmail(), userEntity.getRole().name());
    }

    @Override
    public UserEntity toEntity(UserDto userDto) {
        return new UserEntity(userDto.getName(), userDto.getPassword(),
                userDto.getEmail(), Role.valueOf(userDto.getRole()));
    }
}