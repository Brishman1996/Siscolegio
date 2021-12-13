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
public interface ConsultasAlumno {
    //Alumnos//
    public boolean RegistrarAlumno();
    public boolean ActualizarAlumno();
    public boolean EliminarAlumno(int idA);
    
    public TableModel ListarAlumnos();
    public TableModel ListarAlumnosvista();
    public TableModel BusquedaAlumnos(String ApellidosNombres);
    public TableModel BusquedaAlumnosvista(String ApellidosNombres);
    public TableModel BusquedaAlumnosseccion(String seccion);
    public TableModel BusquedaAlumnosgrado(String grado);
    
    public ComboBoxModel ListarGrado();  
}
