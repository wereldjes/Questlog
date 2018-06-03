package nl.delphinity.questlog.models;

import java.util.SortedSet;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="Npc")
public class Npc extends NPCBase {

	public Npc() {

	}

	public Npc(String name) {
		super(name);
	}

	public Npc(String name, String insertion, String lastName, int level, String race) {
		super(name, insertion, lastName, level, race);
	}

	public Npc(int level, String race, String type) {
		super(level, race, type);
	}

	

	public Npc(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory, int strength,
			int dexterity, int constitution, int intelligence, int wisdom, int charisma, int armorClass, int hitPoints,
			int temporaryHitPoints, int speed, String features, String proficiencies, String learnedLanguages,
			String alignment, int level, int passiveWisdom, int proficiency, int spellDC, int spellAttack,
			int passivePerception, int weight, int size, String race, String initiative, int climbingSpeed, String type,
			String lifestyle, String backstory, String eyeColor, String skinColor, String className, String hairStyle,
			int age, String treasure, String additionalFeaturesAndTraits, String ideals, String bonds, String flaws,
			String personality, String featuresAndTraits) {
		super(iD, name, insertion, lastName, inventory, strength, dexterity, constitution, intelligence, wisdom, charisma,
				armorClass, hitPoints, temporaryHitPoints, speed, features, proficiencies, learnedLanguages, alignment, level,
				passiveWisdom, proficiency, spellDC, spellAttack, passivePerception, weight, size, race, initiative,
				climbingSpeed, type, lifestyle, backstory, eyeColor, skinColor, className, hairStyle, age, treasure,
				additionalFeaturesAndTraits, ideals, bonds, flaws, personality, featuresAndTraits);
		// TODO Auto-generated constructor stub
	}

	// Methods
	@Override
	public String toString() {
		return "Npc [getName()=" + getName() + ", getInsertion()=" + getInsertion() + ", getLastName()=" + getLastName()
				+ ", getLevel()=" + getLevel() + ", getRace()=" + getRace() + "]";
	}

}
