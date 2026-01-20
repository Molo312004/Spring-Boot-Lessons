package com.molier.store.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import com.molier.store.entities.User;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@Table(name = "addresses")
@ToString(exclude = {"user"})
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "street")
    String street;

    @Column(name = "city")
    String city;

    @Column(name = "zip")
    String zip;

    @Column(name = "state")
    String state;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    
}
