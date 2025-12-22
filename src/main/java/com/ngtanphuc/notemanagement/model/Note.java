package com.ngtanphuc.notemanagement.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;

    @Column(unique = false, nullable = false)
    @CreationTimestamp
    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDateTime createdDate;
}
