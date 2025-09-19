package com.anushka.myshop.repositories;


import com.anushka.myshop.entities.Cart;
import com.anushka.myshop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepo extends JpaRepository<Cart,Integer> {
   public Cart findByUser(User user);
//   public Cart findByUser_id(Integer Id);
}
