/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdsystems;

/**
 *
 * @author b-hou
 */
public class FDSystems {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //PremiumAccount cust3 = new PremiumAccount("1", "James", "Belfast", 0.00);
        MovieAccount cust1 = new MovieAccount("1", "Brian", "Lisburn", 100.00);

        System.out.println("Test Case 1");
        System.out.println("Testing the getID method");
        System.out.println(cust1.getID());
        System.out.println("\nTest Case 2");
        System.out.println("Testing the getName method");
        System.out.println(cust1.getName());
        System.out.println("\nTest Case 3");
        System.out.println("Testing the getAddress method");
        System.out.println(cust1.getAddress());
        System.out.println("\nTest case 4");
        System.out.println("Testing the getBalance method");
        System.out.println(cust1.getBalance());
        System.out.println("\nTest Case 5");
        System.out.println("Testing the setName method");
        System.out.println(cust1.userInfo());
        cust1.setName("James");
        System.out.println(cust1.userInfo());
        System.out.println("\nTest Case 6");
        System.out.println("Testing the setBalance method");
        System.out.println(cust1.userInfo());
        cust1.setBalance(80);
        System.out.println(cust1.userInfo());
        System.out.println("\nTest Case 7");
        System.out.println("Testing the userInfo method");
        System.out.println(cust1.userInfo());
        System.out.println("\nTest Case 8");
        System.out.println("Testing the streamMovie method purchasing an SD movie with a duration of 100 minutes");
        System.out.println(cust1.streamMovie(100, true));
        System.out.println("\nTest Case 9");
        System.out.println("\nTesting the streamMovie method purchasing an SD movie with a duration of 100 minutes "
                + "\nwith insufficient funds in account\n");
        try {
            System.out.println(cust1.streamMovie(200, true));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("Test Case 10");
        System.out.println("\nTesting the streamMovie method purchasing an SD movie with a duration of negative 50 minutes \n");
        try {
            System.out.println(cust1.streamMovie(-50, true));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("Test Case 11");
        System.out.println("\nTesting the streamMovie method purchasing an HD movie with a duration of 100 minutes "
                + "\nwith insufficient funds in account\n");
        try {
            System.out.println(cust1.streamMovie(100, false));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("Test Case 12");
        System.out.println("\nTesting the streamMovie method purchasing an HD movie with a duration of negative 50 minutes \n");
        try {
            System.out.println(cust1.streamMovie(-50, false));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("\nTest Case 13");
        System.out.println("Testing that movies watched variable in streamMovie increments");
        System.out.println(cust1.streamMovie(100, true));
        System.out.println(cust1.streamMovie(40,true));      
        System.out.println("\nTest Case 14");
        System.out.println("Testing that totalHD variable in streamMovie increments when HD movies are watched");
        System.out.println(cust1.streamMovie(100, false));
        System.out.println(cust1.streamMovie(40, false));
        System.out.println("\nTest Case 15");
        System.out.println("Testing the purchaseCombo method by purchasing an SD movie with a duration of 140 minutes");
        System.out.println(cust1.purchaseCombo(140, true));
        System.out.println("\nTest Case 16");
        System.out.println("Testing the purchaseCombo method by purchasing an HD movie with a duration of 120 minutes");
        System.out.println(cust1.purchaseCombo(120, false));
        System.out.println("\nTest Case 17");
        System.out.println("\nPurchasing a movie with insufficient funds in account (SD movie)\n");
        try {
            System.out.println(cust1.purchaseCombo(100, true));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("\nTest Case 18");
        System.out.println("\nPurchasing a movie with invalid movie duration entered (SD movie)\n");
        try {
            System.out.println(cust1.purchaseCombo(-100, true));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("\nTest Case 19");
        System.out.println("\nPurchasing a movie with insufficient funds in account (HD movie)\n");
        try {
            System.out.println(cust1.purchaseCombo(100, false));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("\nTest Case 20");
        System.out.println("\nPurchasing a movie with invalid movie duration entered (HD movie) \n");
        try {
            System.out.println(cust1.purchaseCombo(-100, false));
        }//try
        catch (Exception ex) {
            System.out.println(ex);
        }//catch
        System.out.println("\nTest Case 21");
        System.out.println("\nTopping up account balance");
        System.out.println(cust1.userInfo());
        cust1.topUp(40.00);
        System.out.println("\nNew account balance");
        System.out.println(cust1.userInfo());
        System.out.println("\nTest Case 22");
        System.out.println("\nTopping up account balance with negative number");
        System.out.println(cust1.userInfo());
        System.out.println("");
        try {
            cust1.topUp(-40.00);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("\nNew account balance");
        System.out.println(cust1.userInfo());
        System.out.println("\nTest Case 23");
        System.out.println("\nReturning a string Informing the user of their succesful top up\n");
        System.out.println(cust1.topUp(40));

    }
}
