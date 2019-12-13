/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdsystems;

import java.text.DecimalFormat;

/**
 *
 * @author b-hou
 */
public class PremiumAccount extends MovieAccount {

    /**
     * Declaration of variables for PremiumAccount
     */
    private static double discount = 0.8;
    private int freeMovies;
    private double totalSaved = 0;

    /**
     * A method that provides read only access to the private variable discount
     *
     * @return discount variable
     */
    public static double getDiscount() {
        return discount;
    }//getDiscount

    /**
     * A method that provides read only access to the private variable
     * freeMovies
     *
     * @return freeMovies variable
     */
    public int getfreeMovies() {
        return freeMovies;
    }//getfreeMovies

    /**
     * A constructor method to initialise the PremiumAccount
     *
     * @param ID Parameter Sting variable ID
     * @param name Parameter String variable name
     * @param address Parameter String variable address
     * @param balance Parameter double variable double
     */
    public PremiumAccount(String ID, String name, String address, double balance) {

        super(ID, name, address, balance);

    }//PremiumAccount

    /**
     *
     * @param duration Parameter int duration
     * @param sd Parameter boolean SD
     * @return
     * this.getMoviesWatched(),df.format(cost),df.format(totalSaved),this.getDataStreamed(),df.format(this.getBalance()
     * @throws java.lang.Exception
     */
    @Override
    public String streamMovie(int duration, boolean sd) throws Exception {

        DecimalFormat df = new DecimalFormat("##.##");
        double cost = 0;

        if (sd == true) {
            cost = (duration * getSdRate()) * getStreamingCost();
            totalSaved += cost * 0.20;
            cost = cost * discount;
            if (cost <= getBalance() && duration > 0) {
                this.setBalance(this.getBalance() - cost);
                this.setMoviesWatched(this.getMoviesWatched() + 1);
            }//if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");
            }//else
            if (cost > 5.00) {
                freeMovies++;
            }//if
            this.setDataStreamed(this.getDataStreamed() + duration * getSdRate());

        }//if
        else if (sd == false) {
            cost = (duration * getSdRate()) * getStreamingCost();
            totalSaved += cost * 0.20;
            cost = cost * discount;
            if (cost <= getBalance() && duration > 0) {
                this.setBalance(this.getBalance() - cost);
                this.setMoviesWatched(this.getMoviesWatched() + 1);
                this.setTotalHD(this.getTotalHD() + 1);
            }//if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");
            }//else
            if (cost > 5.00) {
                freeMovies++;
            }//if
            this.setDataStreamed(this.getDataStreamed() + duration * getSdRate() * 2);

        }//else if

        return "\nSuccesful Purchase" + "\nMovies Streamed: " + this.getMoviesWatched()
                + "\nTotal HD movies streamed: " + this.getTotalHD() + "\nCost: " + "£" + df.format(cost) + "\nMoney Saved: " + "£" + df.format(totalSaved) + "\nData Streamed: " + this.getDataStreamed() + "MB" + "\nNew Account balance: " + "£" + df.format(this.getBalance());
    }//Method streamMovie

    /**
     * A method to return client statistics as a String
     *
     * @return
     */
    public String viewerStats() {
        DecimalFormat df = new DecimalFormat("##.##");

        return "\nViewer Stats" + "\nNumber of movies viewed in HD: " + this.getTotalHD()
                + "\nNumber of movies viewed in SD: " + this.getMoviesWatched() + "\nNumber of combos purchased: " + getDvdsPurchased() + "\nTotal Amount saved in discounts: "
                + "£" + df.format(totalSaved);
    }//Method viewerStats

    /**
     *
     * @param duration Parameter int duration
     * @param sd Parameter boolean sd
     * @return
     * this.getMoviesWatched(),this.getTotalHD(),df.format(cost),df.format(totalSaved),this.getDataStreamed(),this.getDvdsPurchased(),freeMovies
     * @throws java.lang.Exception
     */
    @Override
    public String purchaseCombo(int duration, Boolean sd) throws Exception {
        DecimalFormat df = new DecimalFormat("###.##");

        double cost = 0;

        if (sd == true) {
            cost = (duration * getSdRate()) * getStreamingCost() + getDvdCost();
            totalSaved += cost * 0.20;
            cost = cost * discount;
            if (cost <= getBalance() && duration > 0) {
                this.setBalance(this.getBalance() - cost);
                this.setMoviesWatched(this.getMoviesWatched() + 1);
                this.setDvdsPurchased(this.getDvdsPurchased() + 1);

            }//if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");
            }//else if
            if (cost > 10.00) {
                freeMovies++;
            }//if
            this.setDataStreamed(this.getDataStreamed() + duration * getSdRate());

        } //if
        else if (sd == false) {
            cost = (duration * getSdRate()) * getStreamingCost() + getDvdCost();
            totalSaved += cost * 0.20;
            cost = cost * discount;
            if (cost <= getBalance() && duration > 0) {

                this.setBalance(this.getBalance() - cost);
                this.setMoviesWatched(this.getMoviesWatched() + 1);
                this.setTotalHD(this.getTotalHD() + 1);
                this.setDvdsPurchased(this.getDvdsPurchased() + 1);
            } //if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");
            }//else
            if (cost > 10.00) {
                freeMovies++;
            }//if
            this.setDataStreamed(this.getDataStreamed() + duration * getSdRate() * 2);
        }//else if

        return "Succesful Purchase" + "\nMovies Streamed: " + this.getMoviesWatched() + "\nTotal HD movies streamed: " + this.getTotalHD() + "\nCost: " + "£" + df.format(cost) + "\nMoney Saved: " + "£" + df.format(totalSaved) + "\nData Streamed: " + this.getDataStreamed() + "MB" + "\nDVD's Purchased: " + this.getDvdsPurchased() + "\nFree Movie(s): " + freeMovies;
    }//purchaseCombo Method

    /**
     * A method to increase the balance of a PremiumAccount object by the amount
     * deposit, for every whole £10 deposited, the user will be awarded an
     * additional £1.
     *
     * @param deposit Parameter double deposit
     * @return deposit, (int)(deposit / 10)
     * @throws java.lang.Exception
     */
    @Override
    public String topUp(double deposit) throws Exception {

        if (deposit >= 10) {
            this.setBalance(this.getBalance() + deposit + (int) (deposit / 10));

        } //if
        else {
            throw new Exception("Ammount entered is invalid");

        }//else
        return "Your account has been topped up by " + "£" + deposit + " with an additional amount of " + "£" + (int) (deposit / 10);
    }//topUp method

}//Class
