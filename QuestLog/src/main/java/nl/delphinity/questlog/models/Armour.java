package nl.delphinity.questlog.models;

import javax.persistence.*;

@Entity
public class Armour extends Item {
	private int armourClass;
	private int strengthRequirement;
	private String stealthDisadvantage;
	private String quality;

	public Armour() {
		super();
	}

	public Armour(String name, int cost, String description, int quantity, int weight, int armourClass,
			int strengthRequirement, String stealthDisadvantage) {
		super(name, cost, description, quantity, weight);
		this.armourClass = armourClass;
		this.strengthRequirement = strengthRequirement;
		this.stealthDisadvantage = stealthDisadvantage;
	}

	public Armour(String name, int cost, String descriptoin, int quantity, int weight) {
		super(name, cost, descriptoin, quantity, weight);
	}

	public int getArmourClass() {
		return armourClass;
	}

	public void setArmourClass(int armourClass) {
		this.armourClass = armourClass;
	}

	public int getStrengthRequirement() {
		return strengthRequirement;
	}

	public void setStrengthRequirement(int strengthRequirement) {
		this.strengthRequirement = strengthRequirement;
	}

	public String getStealthDisadvantage() {
		return stealthDisadvantage;
	}

	public void setStealthDisadvantage(String stealthDisadvantage) {
		this.stealthDisadvantage = stealthDisadvantage;
	}

	@Override
	public String toString() {
		return "Armour " + super.toString() + ", armourClass " + armourClass + ", strengthRequirement "
				+ strengthRequirement + ", stealthDisadvantage " + stealthDisadvantage + ", quality" + quality;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

}
