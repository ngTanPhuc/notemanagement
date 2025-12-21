package com.ngtanphuc.notemanagement.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity  // tells the JPA (Java Persistence API) that this class would be a synonym to a DB table
// Tells the Lombok to create the getter, setter, hashCode, equals,... methods
// for each of the attributes. e.g. getPassword()
@Data
public class User {
    @Id  // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto generate value
    private Long id;

    @Column(unique = true, nullable = false)  // Column's uniqueness and nullability
    private String email;

    private String displayName;
    private String password;
    private boolean active = false;
}
