package nl.delphinity.questlog.datalayers;

import java.util.List;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import nl.delphinity.questlog.datalayerInterfaces.IDAOItem;
import nl.delphinity.questlog.models.Armour;
import nl.delphinity.questlog.models.Food;
import nl.delphinity.questlog.models.Item;
import nl.delphinity.questlog.models.Trinket;
import nl.delphinity.questlog.models.Weapon;

public class HibernateItemDAO implements IDAOItem {
	private static HibernateItemDAO instance = null;
	private Session hSess = null;
	private Transaction hTransaction = null;
	private EntityManager entityManager;

	public static HibernateItemDAO getInstance() {
		if (null == instance) {
			instance = new HibernateItemDAO();
		}
		return instance;
	}

	public HibernateItemDAO() {
		hSess = HibernateDAOFactory.getSession();
	}

	private void beginTransaction() {
		hTransaction = hSess.beginTransaction();
	}

	private boolean commitTransaction() {
		try {
			hTransaction.commit();
			return true;
		} catch (HibernateException e) {
			System.err.println("HibernateItemDAO::commitTransaction(): caught HibernateException. Rolling back.");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			System.err.println("HibernateItemDAO::commitTransaction(): caught Exception. Rolling back.");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public void addItemToInventory(Item item) {
		beginTransaction();
		hSess.save(item);
		commitTransaction();
	}

	public Item getItem(int id) {
		beginTransaction();
		Item i = hSess.find(Item.class, id);
		commitTransaction();
		return i;
	}

	public TreeSet<Item> getAllItems() {
		TreeSet<Item> inventory = new TreeSet<>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Questlog");
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Item> listItems = entityManager.createQuery("From Item").getResultList();
		if (listItems == null) {
			System.out.println("No items found. ");
			return null;
		}
		inventory.addAll(listItems);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();

		return inventory;

	}

	@Override
	public TreeSet<Item> getAllWeapons() {
		TreeSet<Item> AllWeapons = new TreeSet<>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Questlog");
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Item> listItems = entityManager.createQuery("From Weapon").getResultList();
		if (listItems == null) {
			System.out.println("No items found. ");
			return null;
		}
		AllWeapons.addAll(listItems);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();

		return AllWeapons;

	}

	@Override
	public TreeSet<Item> getAllArmour() {
		TreeSet<Item> AllArmour = new TreeSet<>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Questlog");
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Item> listItems = entityManager.createQuery("From Armour").getResultList();
		if (listItems == null) {
			System.out.println("No items found. ");
			return null;
		}
		AllArmour.addAll(listItems);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();

		return AllArmour;
	}

	@Override
	public TreeSet<Item> getAllFoods() {
		TreeSet<Item> AllFood = new TreeSet<>();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Questlog");
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
		List<Item> listItems = entityManager.createQuery("From Food").getResultList();
		if (listItems == null) {
			System.out.println("No items found. ");
			return null;
		}
		AllFood.addAll(listItems);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();

		return AllFood;
	}

	@Override
	public Food getFood(int id) {
		beginTransaction();
		Food f = hSess.find(Food.class, id);
		commitTransaction();
		return f;
	}

	@Override
	public Weapon getWeapon(int id) {
		beginTransaction();
		Weapon w = hSess.find(Weapon.class, id);
		commitTransaction();
		return w;
	}

	@Override
	public Armour getArmour(int id) {
		beginTransaction();
		Armour a = hSess.find(Armour.class, id);
		commitTransaction();
		return a;
	}

	@Override
	public Trinket getTrinket(int id) {
		beginTransaction();
		Trinket t = hSess.find(Trinket.class, id);
		commitTransaction();
		return t;
	}

}
