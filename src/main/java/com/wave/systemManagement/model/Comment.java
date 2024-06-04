package com.wave.systemManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String content;

    private LocalDate createdDateTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Issue issue;
}
