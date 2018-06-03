package nl.delphinity.questlog.models;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.SortNatural;

@Entity
public class RolePlayer extends User {

	
	@OneToMany(cascade = CascadeType.ALL)
	@SortNatural
	private SortedSet<PlayerCharacter> characters = new TreeSet<PlayerCharacter>();

	
	
	public RolePlayer(UUID userId, String name, String lastName, TreeSet<Adventure> allAdventures) {
		super(name, lastName, allAdventures);
	}
	
	
	public RolePlayer(String name, String lastName, TreeSet<Adventure> allAdventures) {
		super(name, lastName, allAdventures);
	}
	
	public RolePlayer(String name, String lastName) {
		super(name, lastName, new TreeSet<Adventure>() );
	}
	
	public RolePlayer() {
		super();
	}
	
	
	
	public void addCharacter(PlayerCharacter pc) {
		characters.add(pc);
	}
	
	public void setCharacters(TreeSet<PlayerCharacter> characters) {
		this.characters = characters;
	}
	
	public SortedSet<PlayerCharacter> getCharacters() {
		return characters;
	}

	@Override
	public String toString() {
		return String.format("RolePlayer [name='%s', lastName='%s',\n characters=%s]\n", this.getName(), this.getLastName(), characters);
	}


	
	

}
