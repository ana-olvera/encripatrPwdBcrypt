/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.semarnat.encritarpasswordsbcrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Chely
 */
public class PasswordEncode {
    
    private static BCryptPasswordEncoder passwordEncode = new BCryptPasswordEncoder();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenaEncriptada = passwordEncode.encode("Prueba.");
        System.out.println("password:|"+cadenaEncriptada+"|");
    }
    
}
