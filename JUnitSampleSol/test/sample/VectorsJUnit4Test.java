/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nb
 */
public class VectorsJUnit4Test {

    public VectorsJUnit4Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void equalsCheck() {
        System.out.println("* VectorsJUnit4Test: equalsCheck()");
        assertTrue(Vectors.equal(new int[]{}, new int[]{}));
        assertTrue(Vectors.equal(new int[]{0}, new int[]{0}));
        assertTrue(Vectors.equal(new int[]{0, 0}, new int[]{0, 0}));
        assertTrue(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 0}));
        assertTrue(Vectors.equal(new int[]{5, 6, 7}, new int[]{5, 6, 7}));

        assertFalse(Vectors.equal(new int[]{}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0}, new int[]{0}));
        assertFalse(Vectors.equal(new int[]{0}, new int[]{}));

        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 0, 1}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{0, 1, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 0}, new int[]{1, 0, 0}));
        assertFalse(Vectors.equal(new int[]{0, 0, 1}, new int[]{0, 0, 3}));
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void ScalarMultiplicationCheck() {
        System.out.println("* VectorsJUnit4Test: ScalarMultiplicationCheck()");
        assertEquals(0, Vectors.scalarMultiplication(new int[]{0, 0}, new int[]{0, 0}));
        assertEquals(39, Vectors.scalarMultiplication(new int[]{3, 4}, new int[]{5, 6}));
        assertEquals(-39, Vectors.scalarMultiplication(new int[]{-3, 4}, new int[]{5, -6}));
        assertEquals(0, Vectors.scalarMultiplication(new int[]{5, 9}, new int[]{-9, 5}));
        assertEquals(100, Vectors.scalarMultiplication(new int[]{6, 8}, new int[]{6, 8}));
       
    }
    
  int a[]=null;
  int b[]=null;  
    
@Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrown(){
    
    Vectors.scalarMultiplication(a, b);
}

@Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrownforlength(){
    
    Vectors.scalarMultiplication(new int[]{0,1}, new int []{0,2,3});
}

@Test
public void testvictor(){
     Vectors v = new Vectors();
    
}

@Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrownforequals(){
    Vectors.equal(a, b);
}

 @Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrownforequalsOR(){
    Vectors.equal(a, new int[]{0,1});
}  
@Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrownforequalsOR2(){
    Vectors.equal(new int[]{0,1},b);
}  
@Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrownforequals1(){
    Vectors.scalarMultiplication(a, new int[]{1,8,5});
}
@Test (expected = IllegalArgumentException.class)
public void illegalExcetptionthrownforequals2(){
    Vectors.scalarMultiplication(new int[]{1,8,5}, b);
} 
}
