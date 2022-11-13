package com.fake.fakeuserprovider.features.fakeuser.repository;

import com.fake.fakeuserprovider.features.fakeuser.model.FakeUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FakeUserRepository extends JpaRepository<FakeUser, Long> {

    Optional<FakeUser> findFirstByEmail(String email);

    Optional<FakeUser> findFirstByUsername(String username);
}