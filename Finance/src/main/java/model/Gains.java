/**
 * @author Ryan Juelsgaard - rjuelsgaard
 * CIS175 - Spring 2022
 * Feb 11, 2022
 */
package model;

public class Gains {
	private double amt;
	private double rate;
	private double tenYearAmt;
	
	public Gains() {
		super();
	}
	
	public Gains(double amt, double rate) {
		super();
		this.amt = amt;
		this.rate = rate;
		tenYearGain(amt, rate);
	}
	
	public void tenYearGain(double amt, double rate) {
		setTenYearAmt(amt * Math.pow(1+((rate / 100)/12), 10*12));
	}

	/**
	 * @return the amt
	 */
	public double getAmt() {
		return amt;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(double amt) {
		this.amt = amt;
	}

	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(double rate) {
		this.rate = rate;
	}

	/**
	 * @return the tenYearAmt
	 */
	public double getTenYearAmt() {
		return Math.round((tenYearAmt * 100.0)/100.0);
	}

	/**
	 * @param tenYearAmt the tenYearAmt to set
	 */
	public void setTenYearAmt(double tenYearAmt) {
		this.tenYearAmt = tenYearAmt;
	}
}
