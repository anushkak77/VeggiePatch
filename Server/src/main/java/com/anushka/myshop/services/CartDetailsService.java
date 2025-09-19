package com.anushka.myshop.services;

import com.anushka.myshop.payload.CartDetailDto;
import com.anushka.myshop.payload.CartHelp;
import org.springframework.stereotype.Service;

@Service
public interface CartDetailsService {

    //add product
    public CartDetailDto addProduct(CartHelp cartHelp);
}
