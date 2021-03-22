/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author carlo
 */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({container.ContainerTest.class, container.WarehouseTest.class, container.PackageTest.class, container.MainTest.class})
public class ContainerSuite {

    public ContainerSuite() {
        super();
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    
    public static TestSuite suite() {
        TestSuite suite = new TestSuite("ContainerSuite");
        suite.addTest(new junit.framework.JUnit4TestAdapter(MainTest.class));
        suite.addTest(new junit.framework.JUnit4TestAdapter(PackageTest.class));
        suite.addTest(new junit.framework.JUnit4TestAdapter(ContainerTest.class));
        suite.addTest(new junit.framework.JUnit4TestAdapter(WarehouseTest.class));
        return suite;        
    }

}
