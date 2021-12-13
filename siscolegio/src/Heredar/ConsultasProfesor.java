/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heredar;

import javax.swing.ComboBoxModel;
import javax.swing.table.TableModel;

/**
 *
 * @author canow
 */
public interface ConsultasProfesor {
    //Alumnos//
    public boolean RegistrarProfesor();
    public boolean ActualizarProfesor();
    public boolean EliminarProfesor(int idP);
    
    public TableModel ListarProfesor();
    public TableModel ListarProfesorvista();
    //public TableModel BusquedaAlumnos(String ApellidosNombres);
    //public TableModel BusquedaAlumnosvista(String ApellidosNombres);
    //public TableModel BusquedaAlumnosseccion(String seccion);
    //public TableModel BusquedaAlumnosgrado(String grado);

}
