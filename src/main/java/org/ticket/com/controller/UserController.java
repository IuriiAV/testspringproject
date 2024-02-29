package org.ticket.com.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.ticket.com.converter.Converter;
import org.ticket.com.dto.UserDto;
import org.ticket.com.entity.UserEntity;
import org.ticket.com.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final Converter<UserEntity, UserDto> converter;

    @GetMapping
    public List<UserDto> list() {
        return userService.getAll()
                .stream()
                .map(converter::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping
    public UserDto create(@RequestBody UserDto dto) {
        return converter.toDto(userService.create(converter.toEntity(dto)));
    }
}