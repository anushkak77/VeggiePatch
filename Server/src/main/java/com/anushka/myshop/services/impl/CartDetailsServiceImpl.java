package com.anushka.myshop.services.impl;

import com.anushka.myshop.payload.CartDetailDto;
import com.anushka.myshop.payload.CartHelp;
import com.anushka.myshop.repositories.CartRepo;
import com.anushka.myshop.repositories.UserRepo;
import com.anushka.myshop.services.CartDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartDetailsServiceImpl implements CartDetailsService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CartRepo cartRepo;




    @Override
    public CartDetailDto addProduct(CartHelp cartHelp) {
        int productId=cartHelp.getProductId();
        int quantity= cartHelp.getQuantity();
        String userEmail= cartHelp.getUserEmail();




        //get user





        return null;
    }
}
