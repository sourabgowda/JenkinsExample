package com.jenkins.project;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @BeforeClass
    public static void createConfiFile() {
        
    }
    
    @Test
    public void testApp(){
    	int response = App.callMethod();
    	Assert.assertEquals(2,response);
    }

}
