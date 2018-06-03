package nl.delphinity.questlog.models;

import javax.persistence.Entity;

@Entity
public class Trinket extends Item {

	private String backStory;

	public Trinket() {
		super();
	}

	public Trinket(String name, int cost, String description, int quantity, int weight, String backStory) {
		super(name, cost, description, quantity, weight);
		this.backStory = backStory;
	}

	public Trinket(String name, int cost, String description, int quantity, int weight) {
		super(name, cost, description, quantity, weight);
	}

	public String getBackStory() {
		return backStory;
	}

	public void setBackStory(String backStory) {
		this.backStory = backStory;
	}

	@Override
	public String toString() {
		return "Trinket " + super.toString() + backStory + ", backStory ";
	}

}
