package com.anushka.myshop.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SingIn {

<<<<<<< HEAD
    private String email;
    private String password;
=======
    private String Email;
    private String Password;
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179
    private String jwt;

}
