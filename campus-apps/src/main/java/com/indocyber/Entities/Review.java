package com.indocyber.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReviewId")
    private int id;

    @Column(name = "Rating",length = 1)
    private int rating;

    @Column(name = "EnrollmentId")
    private int enrollmentId;
}
