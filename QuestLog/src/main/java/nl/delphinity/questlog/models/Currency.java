package nl.delphinity.questlog.models;

import javax.persistence.Entity;

@Entity
public class Currency extends Item {
	private double copper;
	private double silver;
	private double electum;
	private double platinum;
	private double gold;

	public Currency() {
		super();
	}

	public Currency(String name, int cost, String description, int quantity, int weight, double copper, double silver,
			double electum, double platinum, double gold) {
		super(name, cost, description, quantity, weight);
		this.copper = copper;
		this.silver = silver;
		this.electum = electum;
		this.platinum = platinum;
		this.gold = gold;
	}

	public Currency(String name, int cost, String descriptoin, int quantity, int weight) {
		super(name, cost, descriptoin, quantity, weight);
	}

	public double getCopper() {
		return copper;
	}

	public void setCopper(double copper) {
		this.copper = copper;
	}

	public double getSilver() {
		return silver;
	}

	public void setSilver(double silver) {
		this.silver = silver;
	}

	public double getElectum() {
		return electum;
	}

	public void setElectum(double electum) {
		this.electum = electum;
	}

	public double getPlatinum() {
		return platinum;
	}

	public void setPlatinum(double platinum) {
		this.platinum = platinum;
	}

	public double getGold() {
		return gold;
	}

	public void setGold(double gold) {
		this.gold = gold;
	}

}
