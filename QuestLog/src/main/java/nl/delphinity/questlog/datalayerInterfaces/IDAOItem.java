package nl.delphinity.questlog.datalayerInterfaces;

import java.util.TreeSet;

import nl.delphinity.questlog.models.Armour;
import nl.delphinity.questlog.models.Food;
import nl.delphinity.questlog.models.Item;
import nl.delphinity.questlog.models.Trinket;
import nl.delphinity.questlog.models.Weapon;

public interface IDAOItem {
	public void addItemToInventory(Item item);

	// get all items
	TreeSet<Item> getAllItems();

	TreeSet<Item> getAllWeapons();

	TreeSet<Item> getAllArmour();

	TreeSet<Item> getAllFoods();

	// methods get 1 item
	public Food getFood(int id);

	public Weapon getWeapon(int id);

	public Armour getArmour(int id);

	public Trinket getTrinket(int id);

	public Item getItem(int id);

}
