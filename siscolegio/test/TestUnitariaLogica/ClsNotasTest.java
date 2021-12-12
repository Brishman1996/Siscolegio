/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUnitariaLogica;

import Logica.ClsNotas;
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
public class ClsNotasTest {
    
    public ClsNotasTest() {
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
     * Test of ConvertirFecha method, of class ClsNotas.
     */
    @Test
    public void testConvertirFecha() {
        System.out.println("ConvertirFecha");
        String Fecha = "";
        ClsNotas instance = new ClsNotas();
        Date expResult = null;
        Date result = instance.ConvertirFecha(Fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RegistrarNota method, of class ClsNotas.
     */
    @Test
    public void testRegistrarNota() {
        System.out.println("RegistrarNota");
        ClsNotas instance = new ClsNotas();
        boolean expResult = false;
        boolean result = instance.RegistrarNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ActualizarNota method, of class ClsNotas.
     */
    @Test
    public void testActualizarNota() {
        System.out.println("ActualizarNota");
        ClsNotas instance = new ClsNotas();
        boolean expResult = false;
        boolean result = instance.ActualizarNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EliminarNota method, of class ClsNotas.
     */
    @Test
    public void testEliminarNota() {
        System.out.println("EliminarNota");
        int idnota = 0;
        ClsNotas instance = new ClsNotas();
        boolean expResult = false;
        boolean result = instance.EliminarNota(idnota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarNota method, of class ClsNotas.
     */
    @Test
    public void testListarNota() {
        System.out.println("ListarNota");
        ClsNotas instance = new ClsNotas();
        TableModel expResult = null;
        TableModel result = instance.ListarNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of BusquedaNotas method, of class ClsNotas.
     */
    @Test
    public void testBusquedaNotas() {
        System.out.println("BusquedaNotas");
        String NombreNota = "";
        ClsNotas instance = new ClsNotas();
        TableModel expResult = null;
        TableModel result = instance.BusquedaNotas(NombreNota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ListarUnidadNota method, of class ClsNotas.
     */
    @Test
    public void testListarUnidadNota() {
        System.out.println("ListarUnidadNota");
        ClsNotas instance = new ClsNotas();
        ComboBoxModel expResult = null;
        ComboBoxModel result = instance.ListarUnidadNota();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
