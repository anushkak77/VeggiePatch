package com.anushka.myshop.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class CartDetalis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CartDetalisId;

    @ManyToOne
    private Product products;
    private int Quantity;
    private int Amount;

    @ManyToOne
    private Cart cart;
<<<<<<< HEAD
=======





>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
}
