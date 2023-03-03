/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ShoesManager.DAO;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class MyConnectUnitTest {
    ResultSet resultSet;
    
    
    public MyConnectUnitTest() {
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
     * Test of Select method, of class MyConnectUnit.
     */
    @Test
    public void testSelect_3args() throws Exception {
        String TableName = "tbltaikhoan";
        String Condition = "capbac>1";
        String OrderBy = "capbac";
        MyConnectUnit instance = new MyConnectUnit();
        ResultSet expResult = null;
        ResultSet result = instance.Select(TableName, Condition, OrderBy);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Select method, of class MyConnectUnit.
     */
    @Test
    public void testSelect_String_String() throws Exception {
        System.out.println("Select");
        String TableName = "";
        String Condition = "";
        MyConnectUnit instance = new MyConnectUnit();
        ResultSet expResult = null;
        ResultSet result = instance.Select(TableName, Condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Select method, of class MyConnectUnit.
     */
    @Test
    public void testSelect_String() throws Exception {
        System.out.println("Select");
        String TableName = "";
        MyConnectUnit instance = new MyConnectUnit();
        ResultSet expResult = null;
        ResultSet result = instance.Select(TableName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Insert method, of class MyConnectUnit.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("Insert");
        String TableName = "";
        HashMap<String, Object> ColumnValues = null;
        MyConnectUnit instance = new MyConnectUnit();
        boolean expResult = false;
        boolean result = instance.Insert(TableName, ColumnValues);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Update method, of class MyConnectUnit.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("Update");
        String TableName = "";
        HashMap<String, Object> ColumnValues = null;
        String Condition = "";
        MyConnectUnit instance = new MyConnectUnit();
        boolean expResult = false;
        boolean result = instance.Update(TableName, ColumnValues, Condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Delete method, of class MyConnectUnit.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("Delete");
        String TableName = "";
        String Condition = "";
        MyConnectUnit instance = new MyConnectUnit();
        boolean expResult = false;
        boolean result = instance.Delete(TableName, Condition);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnCount method, of class MyConnectUnit.
     */
    @Test
    public void testGetColumnCount() throws Exception {
        System.out.println("getColumnCount");
        ResultSet result_2 = null;
        int expResult = 0;
        int result = MyConnectUnit.getColumnCount(result_2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColumnName method, of class MyConnectUnit.
     */
    @Test(expected = ExecutionException.class)
    public void testGetColumnName() throws Exception {
        System.out.println("getColumnName");
        ResultSet result_2 = null;
        String[] expResult = null;
        String[] result = MyConnectUnit.getColumnName(result_2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Close method, of class MyConnectUnit.
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("Close");
        MyConnectUnit instance = new MyConnectUnit();
        instance.Close();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
