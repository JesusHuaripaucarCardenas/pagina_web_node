/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crud2.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hostname = "rds.c568qm82elso.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/banco_db";
        String user = "admin";
        String password = "admin123";
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(jdbcUrl,user,password);
            if(con !=null){
                System.out.println("conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion: "+e);
        }
    }
    
}
