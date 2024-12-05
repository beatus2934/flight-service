package com.jetsetgo.flight_service.entity;

import com.jetsetgo.flight_service.common.GenderEnum;
import com.jetsetgo.flight_service.common.RoleEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user",schema = "masters")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="user_id")
    private UUID userId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="middle_name")
    private String middleName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="dob")
    private LocalDateTime dob;

    @Column(name="gender")
    private GenderEnum gender;

    @Column(name="nationality")
    private String nationality;

    @Column(name="email")
    private String email;

    @Column(name="phone_no")
    private String phoneNo;

    @Column(name="profile_picture")
    private String profilePicture;
}
