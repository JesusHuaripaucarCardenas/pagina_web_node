/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud2.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class Conexion {

    String hostname = "rds.c568qm82elso.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/faq";
    String usuario = "admin";
    String password = "admin123";
    Connection con;
    
    public Conexion() {
        try {
            con=DriverManager.getConnection(jdbcUrl,usuario,password);
        } catch (Exception e) {
            System.out.println("Error en la clase conexion: "+e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
}
