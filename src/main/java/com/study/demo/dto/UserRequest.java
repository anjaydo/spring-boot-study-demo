package com.study.demo.dto;

import com.study.demo.model.User.Gender;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequest {

    @NotBlank(message = "Username is required")
    private String username;

    private String password;

    private String name;
    private String address;
    private Gender gender;
    private LocalDate dateOfBirth;
}
