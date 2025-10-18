package com.anushka.myshop.repositories;

import com.anushka.myshop.entities.Cart;
import com.anushka.myshop.entities.CartDetalis;
import com.anushka.myshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailsRepo extends JpaRepository<CartDetalis,Integer> {
    public void deleteByProductsAndCart(Product product, Cart cart);
    public CartDetalis findByProductsAndCart(Product product, Cart cart);
}
