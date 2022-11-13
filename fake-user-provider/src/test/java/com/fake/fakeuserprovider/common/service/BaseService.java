package com.fake.fakeuserprovider.common.service;

import com.fake.fakeuserprovider.common.Dto.*;

import java.util.Set;

public interface BaseService<ID> extends BaseValidation {

    Set<? extends BaseEntityGetDto> findAll();

    <S extends BaseEntityGetDto> S findById(ID id);

    <S extends BaseEntityGetDto, T extends BaseEntityPostDto> S create(T dto);

    <S extends BaseEntityGetDto, T extends BaseEntityPostDto> S updateById(ID id, T dto);

    <S extends BaseEntityGetDto> S deleteById(ID id);
}