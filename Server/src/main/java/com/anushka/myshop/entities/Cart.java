package com.anushka.myshop.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;   // ✅ renamed to singular

    private float totalAmount;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    private List<CartDetalis> cartDetalis;

    public void setCartDetalis(List<CartDetalis> pro) {
        this.cartDetalis = pro;
    }
}
