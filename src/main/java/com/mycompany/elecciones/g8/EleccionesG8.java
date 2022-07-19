/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.elecciones.g8;

import Clases.ClsJdbc;


/**
 *
 * @author davidperezarias
 */
public class EleccionesG8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ClsJdbc jdbc = new ClsJdbc();
        jdbc.CrearConexion();
       
        
    }
}
