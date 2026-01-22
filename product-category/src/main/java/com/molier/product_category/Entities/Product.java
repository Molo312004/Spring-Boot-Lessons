package com.molier.product_category.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import java.util.HashSet;   
import com.molier.product_category.Entities.*;
import jakarta.persistence.JoinTable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "products")
@ToString
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "price")
    private float price;
    
    @ManyToMany(mappedBy = "products", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    Set<User> users = new HashSet<>();
    // @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    // @JoinColumn(name = "category_id")
    // @ToString.Exclude
    // private Category category;
}
