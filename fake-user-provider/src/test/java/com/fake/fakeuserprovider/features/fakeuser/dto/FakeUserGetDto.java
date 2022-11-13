package com.fake.fakeuserprovider.features.fakeuser.dto;

import com.fake.fakeuserprovider.common.Dto.BaseEntityGetDto;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FakeUserGetDto extends BaseEntityGetDto {

    String email;

    String username;

    String firstname;

    String lastname;
}