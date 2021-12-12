/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUnitariaLogica;

import Logica.ClsAlumno;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.table.TableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author canow
 */
public class ClsAlumnoTest {
    
    public ClsAlumnoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of RegistrarAlumno method, of class ClsAlumno.
     */
    @Test
    public void testRegistrarAlumno() {
        System.out.println("RegistrarAlumno");
        ClsAlumno instance = new ClsAlumno();
        boolean expResult = false;
        boolean result = instance.RegistrarAlumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarAlumno method, of class ClsAlumno.
     */
    @Test
    public void testActualizarAlumno() {
        System.out.println("ActualizarAlumno");
        ClsAlumno instance = new ClsAlumno();
        boolean expResult = false;
        boolean result = instance.ActualizarAlumno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarAlumno method, of class ClsAlumno.
     */
    @Test
    public void testEliminarAlumno() {
        System.out.println("EliminarAlumno");
        int idAlumno = 0;
        ClsAlumno instance = new ClsAlumno();
        boolean expResult = false;
        boolean result = instance.EliminarAlumno(idAlumno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertirFecha method, of class ClsAlumno.
     */
    @Test
    public void testConvertirFecha() {
        System.out.println("ConvertirFecha");
        String Fecha = "";
        ClsAlumno instance = new ClsAlumno();
        Date expResult = null;
        Date result = instance.ConvertirFecha(Fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarAlumnos method, of class ClsAlumno.
     */
    @Test
    public void testListarAlumnos() {
        System.out.println("ListarAlumnos");
        ClsAlumno instance = new ClsAlumno();
        TableModel expResult = null;
        TableModel result = instance.ListarAlumnos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarAlumnosvista method, of class ClsAlumno.
     */
    @Test
    public void testListarAlumnosvista() {
        System.out.println("ListarAlumnosvista");
        ClsAlumno instance = new ClsAlumno();
        TableModel expResult = null;
        TableModel result = instance.ListarAlumnosvista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaAlumnos method, of class ClsAlumno.
     */
    @Test
    public void testBusquedaAlumnos() {
        System.out.println("BusquedaAlumnos");
        String ApellidosNombres = "";
        ClsAlumno instance = new ClsAlumno();
        TableModel expResult = null;
        TableModel result = instance.BusquedaAlumnos(ApellidosNombres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaAlumnosgrado method, of class ClsAlumno.
     */
    @Test
    public void testBusquedaAlumnosgrado() {
        System.out.println("BusquedaAlumnosgrado");
        String grado = "";
        ClsAlumno instance = new ClsAlumno();
        TableModel expResult = null;
        TableModel result = instance.BusquedaAlumnosgrado(grado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaAlumnosseccion method, of class ClsAlumno.
     */
    @Test
    public void testBusquedaAlumnosseccion() {
        System.out.println("BusquedaAlumnosseccion");
        String seccion = "";
        ClsAlumno instance = new ClsAlumno();
        TableModel expResult = null;
        TableModel result = instance.BusquedaAlumnosseccion(seccion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaAlumnosvista method, of class ClsAlumno.
     */
    @Test
    public void testBusquedaAlumnosvista() {
        System.out.println("BusquedaAlumnosvista");
        String ApellidosNombres = "";
        ClsAlumno instance = new ClsAlumno();
        TableModel expResult = null;
        TableModel result = instance.BusquedaAlumnosvista(ApellidosNombres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarGrado method, of class ClsAlumno.
     */
    @Test
    public void testListarGrado() {
        System.out.println("ListarGrado");
        ClsAlumno instance = new ClsAlumno();
        ComboBoxModel expResult = null;
        ComboBoxModel result = instance.ListarGrado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
