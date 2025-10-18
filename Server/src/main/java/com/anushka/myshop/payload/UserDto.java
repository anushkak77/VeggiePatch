package com.anushka.myshop.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


<<<<<<< HEAD
    private int userid;

    private String name;
    private String email;
    private String password;
    private String contact;
=======
    private int Userid;

    private String Name;
    private String Email;
    private String Password;
    private String Contact;
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179


    private Date date;

<<<<<<< HEAD
    private String role;
=======
    private String Role;
>>>>>>> f770588a39155b20a93052505e3ab8e7bf705179

//     private CartDto cart;

}
