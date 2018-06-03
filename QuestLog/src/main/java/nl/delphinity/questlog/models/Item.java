package nl.delphinity.questlog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "item")
public class Item implements Comparable<Item> {

	@Id
	@GeneratedValue
	private int ID;
	private String name;
	private int cost;
	private String description;
	private int quantity;
	private int weight;

	public Item() {

	}

	public Item(String name) {
		super();

		this.name = name;

	}

	public Item(String name, int cost, String description, int quantity, int weight) {
		super();
		this.ID = ID;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.quantity = quantity;
		this.weight = weight;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getcost() {
		return cost;
	}

	public void setcost(int cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int compareTo(Item i) {
		return name.compareTo(i.getName());
	}

	@Override
	public String toString() {
		return " name " + name + ", cost " + cost + ", description " + description + ", quantity " + quantity
				+ ", weight " + weight;
	}

}
