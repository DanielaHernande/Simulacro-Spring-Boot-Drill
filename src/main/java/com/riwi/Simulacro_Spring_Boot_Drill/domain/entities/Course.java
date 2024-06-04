package com.riwi.Simulacro_Spring_Boot_Drill.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity instructorId;

    @OneToMany(
        mappedBy = "courseId",
        fetch = FetchType.EAGER,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Enrollment> enrollments;

    @OneToMany(
        mappedBy = "courseId",
        fetch = FetchType.EAGER,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Lesson> lessons;

    @OneToMany(
        mappedBy = "courseId",
        fetch = FetchType.EAGER,
        cascade = CascadeType.ALL,
        orphanRemoval = false
    )
    private List<Message> messages;
}