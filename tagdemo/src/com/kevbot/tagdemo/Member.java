package com.kevbot.tagdemo;
import java.util.ArrayList;

public class Member {
	String firstName;
	String lastName;
	boolean goldMember;
	float discountRate;
	float discountRatePercentage;
	
	public Member(String firstName, String lastName, boolean goldMember, float discountRate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.goldMember = goldMember;
		this.setDiscountRate(discountRate);
	}
	
	// Accessors
	public String getFirstName() { return this.firstName; }
	public String getLastName() { return this.lastName; }
	public boolean isGoldMember() { return this.goldMember; }
	public float getDiscountRate() { return this.discountRate; }
	public float getDiscountRatePercentage() { return this.discountRatePercentage; }
	
	// Mutators
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setGoldMember(boolean goldMember) { this.goldMember = goldMember; }
	
	public void setDiscountRate(float discountRate) {
		if (discountRate >= 0.0 && discountRate <= 1.0) {
			this.discountRate = discountRate;
		}
		else {
			this.discountRate = 0.0f;
		}
		
		// Set the discount rate percentage based off of the discount rate
		this.discountRatePercentage = Math.round(this.discountRate * 100.0f);
	}
	
	// Default list of members
	public static ArrayList<Member> getDefaultMembers() {
		ArrayList<Member> defaultList = new ArrayList<Member>();
		
		defaultList.add(new Member("Kevin", "Boese", false, 0.00f));
		defaultList.add(new Member("Jacob", "Morris", true, 0.20f));
		defaultList.add(new Member("Tyler", "Trubisky", true, 0.15f));
		
		return defaultList;
		
	}
	
}
