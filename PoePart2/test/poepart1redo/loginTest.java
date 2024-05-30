/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package poepart1redo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Roland
 */
public class loginTest 
{
    
    public loginTest() 
    {
        
    }
    
    @BeforeAll
    public static void setUpClass() 
    {
        
    }
    
    @AfterAll
    public static void tearDownClass() 
    {
        
    }
    
    @BeforeEach
    public void setUp() 
    {
        
    }
    
    @AfterEach
    public void tearDown() 
    {
        
    }

   
    @Test
    public void testCheckUsername() 
    {
        System.out.println("checkUsername");
        String username = "Kyl_1";
        boolean expResult = false;
        boolean result = login.checkUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testCheckPasswordComplexity() 
    {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        boolean expResult = false;
        boolean result = login.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
    @Test
    public void testRegisterUser() 
    {
        System.out.println("registerUser");
        login instance = null;
        String expResult = "";
        String result = instance.registerUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testLoginUser() 
    {
        System.out.println("loginUser");
        login instance = null;
        boolean expResult = false;
        boolean result = instance.loginUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testReturnLoginStatus() 
    {
        System.out.println("returnLoginStatus");
        login instance = null;
        String expResult = "";
        String result = instance.returnLoginStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
