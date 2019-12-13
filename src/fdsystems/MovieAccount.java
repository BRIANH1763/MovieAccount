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
public class MovieAccount {

    /**
     * Declaration of MovieAccount variables
     */
    private String userID;
    private String Name;
    private String address;
    private double balance;
    private int moviesWatched;
    private int totalHD;
    private double dataStreamed;
    private int dvdsPurchased;

    private static double hdSurcharge = 0.25;
    private static double streamingCost = 0.005;
    private static double sdRate = 3.4;
    private static double dvdCost = 9.99;

    /**
     * Overloaded class constructor to initialise instances of MovieAccount for
     * existing customers
     *
     * @param ID Parameter String ID variable
     * @param name Parameter String name variable
     * @param address Parameter String address variable
     * @param balance Parameter double balance variable
     */
    MovieAccount(String ID, String name, String address, double balance) {

        this.userID = ID;
        this.Name = name;
        this.address = address;
        this.balance = balance;
    }//MovieAccount

    /**
     * Overloaded class constructor to initialise instances of MovieAccount for
     * new customers
     *
     * @param ID Parameter String ID variable
     * @param name Parameter String name variable
     * @param address Parameter String address variable
     */
    MovieAccount(String ID, String name, String address) {
        this.userID = ID;
        this.Name = name;
        this.address = address;
    }//MovieAccount

    /**
     * Method used to provide read only access to the private variable name
     *
     * @return name
     */
    public String getName() {
        return Name;
    }//getName

    /**
     * Method used to provide read only access to the private variable address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }//getAddress

    /**
     * Method used to provide read only access to the private variable
     * dvdsPurchased
     *
     * @return dvdsPurchased
     */
    public int getDvdsPurchased() {
        return dvdsPurchased;
    }//getDvdsPurchased

    /**
     * Method used to provide write access to the private variable name
     *
     * @param name Parameter String name variable
     */
    public void setName(String name) {
        this.Name = name;
    }//setName

    /**
     * Method used to provide write access to the private variable address
     *
     * @param address Parameter String address variable
     */
    public void setAddress(String address) {
        this.address = address;
    }//setAddress

    /**
     * Method used to provide write access to the private variable dvdsPurchased
     *
     * @param dvdsPurchased Parameter int dvdsPurchased variable
     */
    public void setDvdsPurchased(int dvdsPurchased) {
        this.dvdsPurchased = dvdsPurchased;
    }//setDvdsPurchased

    /**
     * Method used to provide read only access to the private variable user ID
     *
     * @return userID
     */
    public String getID() {
        return userID;
    }//getID

    /**
     * Method used to provide read only access to the private variable balance
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }//getBalance

    /**
     * Method used to provide read only access to the private variable
     * moviesWatched
     *
     * @return moviesWatched
     */
    public int getMoviesWatched() {
        return moviesWatched;
    }//getMoviesWatched

    /**
     * Method used to provide read only access to the private variable totalHD
     *
     * @return totalHD
     */
    public int getTotalHD() {
        return totalHD;
    }//getTotalHD

    /**
     * Method used to provide read only access to the private variable
     * dataStream
     *
     * @return dataStreamed
     */
    public double getDataStreamed() {
        return dataStreamed;
    }

    /**
     * Method used to provide write access to the private variable balance
     *
     * @param balance Parameter double balance variable
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }//setBalance

    /**
     * Method used to provide write access to the private variable moviesWatched
     *
     * @param MoviesWatched Parameter int MoviesWatched variable
     */
    public void setMoviesWatched(int MoviesWatched) {
        this.moviesWatched = MoviesWatched;
    }//setMoviesWatched

    /**
     * Method used to provide write access to the private variable totalHD
     *
     * @param TotalHD Parameter int TotalHD variable
     */
    public void setTotalHD(int TotalHD) {
        this.totalHD = TotalHD;
    }//setTotalHD

    /**
     * Method used to provide write access to the private variable dataStreamed
     *
     * @param DataStreamed Parameter double DataStreamed variable
     */
    public void setDataStreamed(double DataStreamed) {
        this.dataStreamed = DataStreamed;
    }//setDataStreamed

    /**
     * Method used to provide read access to the private variable sdRate
     *
     * @return sdRate
     */
    public static double getSdRate() {
        return sdRate;
    }//getSdRate

    /**
     * Method used to provide read access to the private variable hdSurcharge
     *
     * @return hdSurcharge
     */
    public static double getHdSurcharge() {
        return hdSurcharge;
    }//getHdSurcharge

    /**
     * Method used to provide read access to the private variable streamingCost
     *
     * @return streamingCost
     */
    public static double getStreamingCost() {
        return streamingCost;
    }//getStreamingCost

    /**
     * Method used to provide read access to the private variable dvdCost
     *
     * @return dvdCost
     */
    public static double getDvdCost() {
        return dvdCost;
    }//getDvdCost

    /**
     * Method used to provide write access to the private variable SdRate
     *
     * @param SdRate Parameter double SdRate variable
     */
    public void setSdRate(double SdRate) {
        this.sdRate = SdRate;
    }//setSdRate

    /**
     * Method used to provide write access to the private variable hdSurcharge
     *
     * @param hdSurcharge Parameter double hdSurcharge variable
     */
    public void sethdSurcharge(double hdSurcharge) {
        this.hdSurcharge = hdSurcharge;
    }//sethdSurcharge

    /**
     * Method used to provide write access to the private variable streamingCost
     *
     * @param streamingCost Parameter double StreamingCost variable
     */
    public void setStreamingCost(double streamingCost) {
        this.streamingCost = streamingCost;
    }//setStreamingCost

    /**
     * Method used to provide write access to the private variable DvdCost
     *
     * @param DvdCost Parameter double dvdCost variable
     */
    public void setDvdCost(double DvdCost) {
        this.dvdCost = DvdCost;
    }//setDvdCost

    /**
     * A method to return a String, identifying the user’s ID and name, their
     * current balance (to 2 decimal places) and the current number of movies
     * streamed, and DVDs purchased.
     *
     * @return user
     */
    public String userInfo() {

        DecimalFormat df = new DecimalFormat("###.##");

        String user = "\nAccount Details:" + "\nUser ID: " + userID + "\nName: " + Name + "\nBalance: £" + df.format(balance)
                + "\nCurrent Movies Streamed: " + moviesWatched + "\nDVD's Purchased: " + dvdsPurchased;
        return user;
    }//userInfo

    /**
     * A method to stream a movie,the int parameter provides the movie duration
     * in minutes, while the Boolean parameter identifies whether the movie is
     * to be streamed in standard definition (SD) or high definition (HD).
     * Return value supplying a String which informs the user of their success
     * or failure (depending on funds available) and how much it cost to stream
     * a movie for the requested duration and definition.
     *
     * @param duration Parameter int duration
     * @param sd Parameter boolean sd
     * @return moviesWatched,totalHD,
     * df.format(cost),dataStreamed,df.format(balance)
     * @throws java.lang.Exception
     *
     *
     */
    public String streamMovie(int duration, boolean sd) throws Exception {
        DecimalFormat df = new DecimalFormat("###.##");
        double cost = 0;

        if (sd == true) {
            cost = (duration * sdRate) * streamingCost;
            if (cost <= balance && duration > 0) {
                balance = balance - cost;
                moviesWatched++;
            }//if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");

            }//else
            dataStreamed += duration * sdRate;
        }//if
        else if (sd == false) {
            cost = (duration * sdRate) * streamingCost + hdSurcharge;
            if (cost <= balance && duration > 0) {
                balance = balance - cost;
                moviesWatched++;
                totalHD++;
            } //if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");

            }//else
            dataStreamed += duration * sdRate;

        }//else if

        return "\nSuccesful Purchase" + "\nMovies Streamed: " + moviesWatched + "\nTotal HD movies streamed: " + totalHD + "\nCost: " + "£" + df.format(cost) + "\nData Streamed: " + dataStreamed + "MB" + "\nNew Account balance: " + "£" + df.format(balance);
    }//streamMovie

    /**
     * A method to stream a movie and purchase a DVD copy.The int parameter
     * provides the movie duration in minutes, while the Boolean parameter
     * identifies whether the movie is to be streamed in standard definition
     * (SD) or high definition (HD). A return value should supply a String which
     * informs the user of their success or failure (depending on funds
     * available) and the cost applied to the account.
     *
     * @param duration Parameter int duration
     * @param sd Parameter boolean sd
     * @return moviesWatched,totalHD,df.format(cost),dataStreamed,dvdsPurchased;
     * @throws java.lang.Exception
     */
    public String purchaseCombo(int duration, Boolean sd) throws Exception {
        DecimalFormat df = new DecimalFormat("###.##");

        double cost = 0;

        if (sd == true) {
            cost = (duration * sdRate) * streamingCost + dvdCost;
            if (cost <= balance && duration > 0) {
                balance = balance - cost;
                moviesWatched++;
                dvdsPurchased++;

            } //if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");
            }//else
            dataStreamed += duration * sdRate;

        } //if
        else if (sd == false) {
            cost = (duration * sdRate) * streamingCost + hdSurcharge + dvdCost;
            if (cost <= balance && duration > 0) {
                balance = balance - cost;
                moviesWatched++;
                totalHD++;
                dvdsPurchased++;
            } //if
            else {
                throw new Exception("Unsuccesful purchase due to insufficient account funds or movie duration invalid");
            }//else
            dataStreamed += duration * sdRate * 2;
        }//else if

        return "\nSuccesful Purchase" + "\nMovies Streamed: " + moviesWatched + "\nTotal HD movies streamed: " + totalHD + "\nCost: " + "£" + df.format(cost) + "\nData Streamed: " + dataStreamed + "MB" + "\nDVD's Purchased: " + dvdsPurchased;
    }//purchaseCombo

    /**
     * A method to increase the balance of a MovieAccount object by the deposit
     * amount.
     *
     * @param deposit Parameter double deposit
     * @return "Your account has been topped up by " + "£" + deposit;
     * @throws java.lang.Exception
     */
    public String topUp(double deposit) throws Exception {
        if (deposit >= 0) {
            balance = balance + deposit;
        }//if
        else {
            throw new Exception("Ammount entered is invalid");
        }//else
        return "Your account has been topped up by " + "£" + deposit;
    }///topUp

}
