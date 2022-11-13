package com.fake.fakeuserprovider.features.fakeuser.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FakeUserPostDto {

    @NotBlank(message = "username cannot be empty.")
    String username;

    @NotBlank(message = "email cannot be empty.")
    String email;

    @NotBlank(message = "password cannot be empty.")
    String password;

    String firstname;

    String lastname;
}