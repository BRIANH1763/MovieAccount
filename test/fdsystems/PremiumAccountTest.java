/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdsystems;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b-hou
 */
public class PremiumAccountTest {

    /**
     *
     */
    public PremiumAccountTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of getBalance method, of class MovieAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        double expResult = 40.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class MovieAccount.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "1";
        String result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class MovieAccount.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "Lisburn";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class MovieAccount.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "Brian";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscount method, of class PremiumAccount.
     */
    @Test
    public void testGetDiscount() {
        System.out.println("getDiscount");
        double expResult = 0.8;
        double result = PremiumAccount.getDiscount();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getfreeMovies method, of class PremiumAccount.
     */
    @Test
    public void testGetfreeMovies() {
        System.out.println("getfreeMovies");
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        int expResult = 0;
        int result = instance.getfreeMovies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of streamMovie method (HD movie), of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testStreamMovie() throws Exception {
        System.out.println("streamMovie");
        int duration = 80;
        boolean sd = false;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "\nSuccesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 1\nCost: £1.09\nMoney Saved: £0.27\nData Streamed: 544.0MB\nNew Account balance: £38.91";
        String result = instance.streamMovie(duration, sd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of streamMovie method (SD movie), of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testStreamMovie2() throws Exception {
        System.out.println("streamMovie");
        int duration = 80;
        boolean sd = true;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "\nSuccesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £1.09\nMoney Saved: £0.27\nData Streamed: 272.0MB\nNew Account balance: £38.91";
        String result = instance.streamMovie(duration, sd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of streamMovie method (HD movie) with invalid duration entered, of
     * class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testStreamMovie3() throws Exception {
        System.out.println("streamMovie");
        int duration = -80;
        boolean sd = false;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "\nSuccesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 1\nCost: £1.09\nMoney Saved: £0.27\nData Streamed: 544.0MB\nNew Account balance: £38.91";
        try {
            String result = instance.streamMovie(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    /**
     * Test of streamMovie method (SD movie)with invalid duration entered, of
     * class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testStreamMovie4() throws Exception {
        System.out.println("streamMovie");
        int duration = -80;
        boolean sd = true;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "\nSuccesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £1.09\nMoney Saved: £0.27\nData Streamed: 272.0MB\nNew Account balance: £38.91";
        try {
            String result = instance.streamMovie(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of streamMovie method (SD movie)with insufficient funds in account,
     * of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testStreamMovie5() throws Exception {
        System.out.println("streamMovie");
        int duration = 80;
        boolean sd = true;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 1.00);
        String expResult = "\nSuccesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £1.09\nMoney Saved: £0.27\nData Streamed: 272.0MB\nNew Account balance: £38.91";
        try {
            String result = instance.streamMovie(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of streamMovie method (HD movie)with insufficient funds in balance,
     * of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testStreamMovie6() throws Exception {
        System.out.println("streamMovie");
        int duration = 80;
        boolean sd = false;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 1.00);
        String expResult = "\nSuccesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £1.09\nMoney Saved: £0.27\nData Streamed: 272.0MB\nNew Account balance: £38.91";
        try {
            String result = instance.streamMovie(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of viewerStats method, of class PremiumAccount.
     */
    @Test
    public void testViewerStats() {
        System.out.println("viewerStats");
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "\nViewer Stats\nNumber of movies viewed in HD: 0\nNumber of movies viewed in SD: 0\nNumber of combos purchased: 0\nTotal Amount saved in discounts: £0";
        String result = instance.viewerStats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseCombo method(HD movie), of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseCombo() throws Exception {
        System.out.println("purchaseCombo");
        int duration = 70;
        Boolean sd = false;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "Succesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 1\nCost: £8.94\nMoney Saved: £2.24\nData Streamed: 476.0MB\nDVD's Purchased: 1\nFree Movie(s): 0";
        String result = instance.purchaseCombo(duration, sd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseCombo method (SD movie), of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseCombo2() throws Exception {
        System.out.println("purchaseCombo");
        int duration = 80;
        Boolean sd = true;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "Succesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £9.08\nMoney Saved: £2.27\nData Streamed: 272.0MB\nDVD's Purchased: 1\nFree Movie(s): 0";
        String result = instance.purchaseCombo(duration, sd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseCombo method (SD movie) invalid movie duration entered,
     * of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseCombo3() throws Exception {
        System.out.println("purchaseCombo");
        int duration = -80;
        Boolean sd = true;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "Succesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £9.08\nMoney Saved: £2.27\nData Streamed: 272.0MB\nDVD's Purchased: 1\nFree Movie(s): 0";
        try {
            String result = instance.purchaseCombo(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseCombo method (HD movie) invalid movie duration entered,
     * of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseCombo4() throws Exception {
        System.out.println("purchaseCombo");
        int duration = -80;
        Boolean sd = false;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 40.00);
        String expResult = "Succesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £9.08\nMoney Saved: £2.27\nData Streamed: 272.0MB\nDVD's Purchased: 1\nFree Movie(s): 0";
        try {
            String result = instance.purchaseCombo(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseCombo method (HD movie) with insufficient balance in
     * account, of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseCombo5() throws Exception {
        System.out.println("purchaseCombo");
        int duration = 80;
        Boolean sd = false;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 8.00);
        String expResult = "Succesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £9.08\nMoney Saved: £2.27\nData Streamed: 272.0MB\nDVD's Purchased: 1\nFree Movie(s): 0";
        try {
            String result = instance.purchaseCombo(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of purchaseCombo method (SD movie) with insufficient balance in
     * account, of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseCombo6() throws Exception {
        System.out.println("purchaseCombo");
        int duration = 80;
        Boolean sd = true;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 8.00);
        String expResult = "Succesful Purchase\nMovies Streamed: 1\nTotal HD movies streamed: 0\nCost: £9.08\nMoney Saved: £2.27\nData Streamed: 272.0MB\nDVD's Purchased: 1\nFree Movie(s): 0";
        try {
            String result = instance.purchaseCombo(duration, sd);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of topUp method, of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testTopUp() throws Exception {
        System.out.println("topUp");
        double deposit = 10.0;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 50.00);
        String expResult = "Your account has been topped up by £10.0 with an additional amount of £1";
        String result = instance.topUp(deposit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of topUp method, of class PremiumAccount.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testTopUp2() throws Exception {
        System.out.println("topUp");
        double deposit = -10.0;
        PremiumAccount instance = new PremiumAccount("1", "Brian", "Lisburn", 50.00);
        String expResult = "Ammount entered is invalid";
        try {
            String result = instance.topUp(deposit);
            assertEquals(expResult, result);
        } catch (Exception ex) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
