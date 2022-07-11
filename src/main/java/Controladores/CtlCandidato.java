/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Modelos.MdlCandidato;

/**
 *
 * @author davidperezarias
 */
public class CtlCandidato {
    
    MdlCandidato modeloCandidato;

    public CtlCandidato() {
        this.modeloCandidato = new MdlCandidato();
    }
    
    
    
    public boolean agregarCandidato(ClsCandidato candidato){
        
        
        boolean respuesta = this.modeloCandidato.agregarCandidato(candidato);
        
        return respuesta;
    }
    
}
