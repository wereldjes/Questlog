package nl.delphinity.questlog.models;

import javax.persistence.*;

@Entity
@Table(name = "Weapon")
public class Weapon extends Item {

	private int damage;
	private String properties;
	@Column(name = "weaponRange")
	private int range;
	private String effect;
	private String type;
	private String quality;

	public Weapon() {
		super();
	}

	public Weapon(String name, int cost, String description, int quantity, int weight, int damage, String properties,
			int range, String effect, String type) {
		super(name, cost, description, quantity, weight);
		this.damage = damage;
		this.properties = properties;
		this.range = range;
		this.effect = effect;
		this.type = type;

	}

	public Weapon(String name, int cost, String description, int quantity, int weight) {
		super(name, cost, description, quantity, weight);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getProperties() {
		return properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "Weapon  " + super.toString() + ", damage" + damage + ", properties " + properties + ", range " + range
				+ ", effect " + effect + ", type " + type + ", quality " + quality;
	}

}
