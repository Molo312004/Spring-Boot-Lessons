package com.molier.store.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import com.molier.store.entities.*;
import jakarta.persistence.JoinTable;
import java.util.Set;
import jakarta.persistence.CascadeType;
import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.HashSet;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "users")
// @ToString(exclude = {"address", "tags"})
@ToString
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "password")
    private String password;

    @Builder.Default
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<Address> address = new ArrayList<>();

    public void addAddress(Address address){
        this.address.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address){
        this.address.remove(address);
        address.setUser(null);
    }

    


    public void addTag(String tagName){
        var tag = new Tag(tagName);
        tags.add(tag);
        tag.getUsers().add(this);

    }

    public void removeTag(String tagName){
        Tag tagToRemove = null;

        for(Tag tag : tags){
            if(tag.getName().equals(tagName)){
                tagToRemove = tag;
                break;
            }
        }

        if(tagToRemove != null){
            tags.remove(tagToRemove);
            tagToRemove.getUsers().remove(this);
            System.out.println("Tag Removed: " + tagName);
            return;
        }
        System.out.println("Tag Not Found!");
    }

    @ManyToMany
    @JoinTable(
        name = "user_tags",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    Set<Tag> tags = new HashSet<>();

    @OneToOne(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Profile profile;

}
