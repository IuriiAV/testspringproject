package org.ticket.com.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.ticket.com.model.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "user_account")
@Data
@NoArgsConstructor
public class UserEntity {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private long id;

    private String login;

    private String password;

    @Email
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    public UserEntity(String login, String password, String email, Role role) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
    }
}
