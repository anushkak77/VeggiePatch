package com.anushka.myshop.repositories;

import com.anushka.myshop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
}
