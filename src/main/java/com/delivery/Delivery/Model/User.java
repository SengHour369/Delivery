package com.delivery.Delivery.Model;

import com.delivery.Delivery.enumeration.UserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jdk.jfr.Timestamp;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "db_user")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    @Column(nullable = false,unique = true)
    private String username;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    @Email(message = "email is validation")
    private String email;
    @Column(nullable = false,length = 10)
    private String gender;
    @Column(nullable = false)
    private String adress;
    @Column(nullable = false,unique = true)
    private String phone_number;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date birth;
}
