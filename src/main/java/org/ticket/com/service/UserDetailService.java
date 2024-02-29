package org.ticket.com.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.ticket.com.entity.UserEntity;
import org.ticket.com.exceptions.UserNotFoundException;

import java.util.Collections;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {
//
//    private Map<String, String> userStorage = Map.of("admin", "$2a$10$gwiPpr.7eVh1fSOiZpMOx..iIZU1Hu/BF.4JSeoU2jq5UHMAZNAie",
//            "user", "$2a$10$fbQ1im9FA76cm86o.q1AEeHHNgC4MKoQwTaKQv8CA9cjNgbUUhEpm");

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity;
        try {
            userEntity = userService.getByLogin(username);
        } catch (UserNotFoundException exception) {
            throw new UsernameNotFoundException(exception.getMessage());
        }

        return new User(userEntity.getLogin(), userEntity.getPassword(),
                Collections.singleton(userEntity.getRole()));
    }
}
