/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUnitariaLogica;

import Logica.ClsProfesor;
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
public class ClsProfesorTest {
    
    public ClsProfesorTest() {
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
     * Test of RegistrarProfesor method, of class ClsProfesor.
     */
    @Test
    public void testRegistrarProfesor() {
        System.out.println("RegistrarProfesor");
        ClsProfesor instance = new ClsProfesor();
        boolean expResult = false;
        boolean result = instance.RegistrarProfesor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarProfesor method, of class ClsProfesor.
     */
    @Test
    public void testActualizarProfesor() {
        System.out.println("ActualizarProfesor");
        ClsProfesor instance = new ClsProfesor();
        boolean expResult = false;
        boolean result = instance.ActualizarProfesor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarProfesor method, of class ClsProfesor.
     */
    @Test
    public void testEliminarProfesor() {
        System.out.println("EliminarProfesor");
        int idProfesor = 0;
        ClsProfesor instance = new ClsProfesor();
        boolean expResult = false;
        boolean result = instance.EliminarProfesor(idProfesor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarProfesor method, of class ClsProfesor.
     */
    @Test
    public void testListarProfesor() {
        System.out.println("ListarProfesor");
        ClsProfesor instance = new ClsProfesor();
        TableModel expResult = null;
        TableModel result = instance.ListarProfesor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarProfesorvista method, of class ClsProfesor.
     */
    @Test
    public void testListarProfesorvista() {
        System.out.println("ListarProfesorvista");
        ClsProfesor instance = new ClsProfesor();
        TableModel expResult = null;
        TableModel result = instance.ListarProfesorvista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaProfesor method, of class ClsProfesor.
     */
    @Test
    public void testBusquedaProfesor() {
        System.out.println("BusquedaProfesor");
        String ApellidosNombres = "";
        ClsProfesor instance = new ClsProfesor();
        TableModel expResult = null;
        TableModel result = instance.BusquedaProfesor(ApellidosNombres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaProfesoresvista method, of class ClsProfesor.
     */
    @Test
    public void testBusquedaProfesoresvista() {
        System.out.println("BusquedaProfesoresvista");
        String ApellidosNombres = "";
        ClsProfesor instance = new ClsProfesor();
        TableModel expResult = null;
        TableModel result = instance.BusquedaProfesoresvista(ApellidosNombres);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
