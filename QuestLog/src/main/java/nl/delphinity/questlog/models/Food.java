package nl.delphinity.questlog.models;

import javax.persistence.Entity;

@Entity
public class Food extends Item {
	private String quality;

	public Food() {
		super();
	}

	public Food(String name, int cost, String description, int quantity, int weight, String quality) {
		super(name, cost, description, quantity, weight);
		this.quality = quality;
	}

	public Food(String name, int cost, String descriptoin, int quantity, int weight) {
		super(name, cost, descriptoin, quantity, weight);
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Food " + super.toString() + ", quality " + quality;
	}

}
