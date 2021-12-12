/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUnitariaLogica;

import Logica.ClsCurso;
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
public class ClsCursoTest {
    
    public ClsCursoTest() {
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
     * Test of RegistrarCurso method, of class ClsCurso.
     */
    @Test
    public void testRegistrarCurso() {
        System.out.println("RegistrarCurso");
        ClsCurso instance = new ClsCurso();
        boolean expResult = false;
        boolean result = instance.RegistrarCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarCurso method, of class ClsCurso.
     */
    @Test
    public void testActualizarCurso() {
        System.out.println("ActualizarCurso");
        ClsCurso instance = new ClsCurso();
        boolean expResult = false;
        boolean result = instance.ActualizarCurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarCurso method, of class ClsCurso.
     */
    @Test
    public void testEliminarCurso() {
        System.out.println("EliminarCurso");
        int idcurso = 0;
        ClsCurso instance = new ClsCurso();
        boolean expResult = false;
        boolean result = instance.EliminarCurso(idcurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertirFecha method, of class ClsCurso.
     */
    @Test
    public void testConvertirFecha() {
        System.out.println("ConvertirFecha");
        String Fecha = "";
        ClsCurso instance = new ClsCurso();
        Date expResult = null;
        Date result = instance.ConvertirFecha(Fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarCursos method, of class ClsCurso.
     */
    @Test
    public void testListarCursos() {
        System.out.println("ListarCursos");
        ClsCurso instance = new ClsCurso();
        TableModel expResult = null;
        TableModel result = instance.ListarCursos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaCursos method, of class ClsCurso.
     */
    @Test
    public void testBusquedaCursos() {
        System.out.println("BusquedaCursos");
        String Nombrecurso = "";
        ClsCurso instance = new ClsCurso();
        TableModel expResult = null;
        TableModel result = instance.BusquedaCursos(Nombrecurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarNombrecurso method, of class ClsCurso.
     */
    @Test
    public void testListarNombrecurso() {
        System.out.println("ListarNombrecurso");
        ClsCurso instance = new ClsCurso();
        ComboBoxModel expResult = null;
        ComboBoxModel result = instance.ListarNombrecurso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
