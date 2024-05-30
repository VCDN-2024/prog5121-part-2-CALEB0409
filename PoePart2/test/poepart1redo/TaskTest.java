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
public class TaskTest 
{
    
    public TaskTest() 
    {
        
    }
    
    @BeforeAll
    public static void setUpClass() 
    {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTask method, of class Task.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String taskName = "Login Feature";
        int taskNum = 0;
        String taskDescription = "Create login to authenticate users";
        String developerDetails = "Robyn Harrison";
        int taskDuration = 8;
        String taskID = "LO:0:BYN";
        String taskStatus = "1";
        Task instance = new Task();
        instance.addTask(taskName, taskNum, taskDescription, developerDetails, taskDuration, taskID, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PrintTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() 
    {
        System.out.println("PrintTaskDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.PrintTaskDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ReturnTotalHour method, of class Task.
     */
    @Test
    public void testReturnTotalHour() 
    {
        System.out.println("ReturnTotalHour");
        int duration = 0;
        Task instance = new Task();
        int expResult = 0;
        int result = instance.ReturnTotalHour(duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateStatus method, of class Task.
     */
    @Test
    public void testCalculateStatus() 
    {
        System.out.println("CalculateStatus");
        int taskStat = 0;
        Task instance = new Task();
        String expResult = "";
        String result = instance.CalculateStatus(taskStat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TaskMenu method, of class Task.
     */
    @Test
    public void testTaskMenu() 
    {
        System.out.println("TaskMenu");
        Task instance = new Task();
        instance.TaskMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
