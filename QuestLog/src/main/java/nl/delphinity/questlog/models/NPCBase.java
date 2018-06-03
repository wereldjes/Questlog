package nl.delphinity.questlog.models;

import java.util.SortedSet;

public class NPCBase extends CharacterBase {

	private int experienceDropped;
	private int challenge;
	private DungeonMaster dungeonmaster;

	// Constructors
	public NPCBase() {

	}

	public NPCBase(String name) {
		super(name);
	}

	/**
	 * Npc constructor
	 * 
	 * @param name
	 * @param insertion
	 * @param lastName
	 * @param level
	 * @param race
	 */
	public NPCBase(String name, String insertion, String lastName, int level, String race) {
		super(name, insertion, lastName, level, race);
	}

	/**
	 * Monster constructor
	 * 
	 * @param level
	 * @param race
	 * @param type
	 */
	public NPCBase(int level, String race, String type) {
		super(level, race, type);
	}



	

	
	public NPCBase(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory, int strength,
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

	public NPCBase(int iD) {
		super(iD);
		// TODO Auto-generated constructor stub
	}

	// Getters en Setters
	public int getExperienceDropped() {
		return experienceDropped;
	}

	public void setExperienceDropped(int experienceDropped) {
		this.experienceDropped = experienceDropped;
	}

	public int getChallenge() {
		return challenge;
	}

	public void setChallenge(int challenge) {
		this.challenge = challenge;
	}

	public DungeonMaster getDungeonmaster() {
		return dungeonmaster;
	}

	public void setDungeonmaster(DungeonMaster dungeonmaster) {
		this.dungeonmaster = dungeonmaster;
	}

	
}
