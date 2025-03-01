package com.bookingApp.BookingApp.entity;

import com.bookingApp.BookingApp.utils.enums.GENDER;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private Long contactNumber;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private GENDER gender;

    @Column(nullable = false)
    private Integer age;

    @ManyToMany
    private Set<Booking> bookings;
}
