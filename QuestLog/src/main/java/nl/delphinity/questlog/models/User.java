package nl.delphinity.questlog.models;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.UUID;
import javax.persistence.*;

@Entity
public class User implements Comparable<User>{

	@Id
	private UUID userID;
	private String name;
	private String lastName;
	private TreeSet<Adventure> allAdventures = new TreeSet<>();
	private ArrayList<User> users;
	
	public User(UUID userID, String name, String lastName) {
		super();
		this.userID = userID;
		this.name = name;
		this.lastName = lastName;
	}

	public User(UUID userID, String name, String lastName, TreeSet<Adventure> allAdventures) {
		super();
		this.userID = userID;
		this.name = name;
		this.lastName = lastName;
		this.allAdventures = allAdventures;
	}
	
	//added constructors to be able to use constructors in RolePlayer
	public User(String name, String lastName, TreeSet<Adventure> allAdventures) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.allAdventures = allAdventures;
	}

	//added for RolePlayer as well
	public User() {
		super();
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName; 
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public TreeSet<Adventure> getAllAdventures() {
		return allAdventures;
	}

	public void setAllAdventures(TreeSet<Adventure> allAdventures) {
		this.allAdventures = allAdventures;
	}
	
	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}

	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	// toString implementeren.
	@Override
	public String toString() {
		return  name + lastName;
	}

}
