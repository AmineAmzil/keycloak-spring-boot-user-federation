package com.fake.fakeuserprovider.common.model;

import lombok.*;
import lombok.experimental.*;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Data
@NoArgsConstructor
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
