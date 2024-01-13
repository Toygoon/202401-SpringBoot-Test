package com.example.sbt1.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "board")
@AllArgsConstructor
public class BoardEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String title;

    @Column(length = 400)
    private String contents;
}
