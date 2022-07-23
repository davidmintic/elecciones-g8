/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsEleccion;
import Clases.ClsMensaje;
import Modelos.MdlEleccion;

/**
 *
 * @author davidperezarias
 */
public class CtlEleccion {
    
    MdlEleccion modelo;

    public CtlEleccion() {
        this.modelo = new MdlEleccion();
    }
    
    
    public ClsMensaje agregarEleccion(ClsEleccion eleccion) {
        
        return this.modelo.agregarEleccion(eleccion);
    
    }
    
    
    
}
