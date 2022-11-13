package com.fake.fakeuserprovider.features.fakeuser.model;

import com.fake.fakeuserprovider.common.model.BaseEntity;
import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeUser extends BaseEntity {

    @Column(unique = true, nullable = false)
    String username;

    @Column(unique = true, nullable = false)
    String email;

    @Column(nullable = false)
    String password;

    String firstname;

    String lastname;

    @Column(nullable = false)
    String role;
}