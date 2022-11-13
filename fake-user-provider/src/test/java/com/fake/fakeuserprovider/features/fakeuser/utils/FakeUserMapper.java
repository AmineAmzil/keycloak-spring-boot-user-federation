package com.fake.fakeuserprovider.features.fakeuser.utils;

import com.fake.fakeuserprovider.features.fakeuser.dto.*;
import com.fake.fakeuserprovider.features.fakeuser.model.FakeUser;
import org.mapstruct.Mapper;

@Mapper
public interface FakeUserMapper {

    FakeUser toEntity(FakeUserPostDto dto);

    FakeUserGetDto toGetDto(FakeUser dto);
}