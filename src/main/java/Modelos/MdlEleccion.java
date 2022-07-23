/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsEleccion;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;

/**
 *
 * @author davidperezarias
 */
public class MdlEleccion {
    
    
     ClsJdbc jdbc;

    public MdlEleccion() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    
    public ClsMensaje agregarEleccion(ClsEleccion eleccion) {

        ClsMensaje mensaje;

        try {
            String sql = "INSERT INTO tbl_elecciones VALUES (?, ?, ?, ?, ?, NOW(), 'abierta')";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, eleccion.getIdEleccion().substring(0, 9));
            sentencia.setString(2, eleccion.getDescripcion());
            sentencia.setString(3, eleccion.getCategoria());
            sentencia.setString(4, eleccion.getFechaInicio());
            sentencia.setString(5, eleccion.getFechaFin());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                mensaje = new ClsMensaje(ClsMensaje.OK, "Has creado una elección exitosamente");
                return mensaje;
            }

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error: " + excepcion.getMessage());
            return mensaje;
        }

    }
    
    
}
