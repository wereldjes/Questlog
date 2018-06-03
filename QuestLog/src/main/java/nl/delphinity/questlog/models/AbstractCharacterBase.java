package nl.delphinity.questlog.models;

import java.util.SortedSet;
import java.util.TreeSet;
import javax.persistence.*;

import org.hibernate.annotations.SortNatural;
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "Players")
public abstract class AbstractCharacterBase implements Comparable<AbstractCharacterBase> {

	@Id
	@GeneratedValue
	protected int ID;

	@Column
	protected String name;

	@Column
	protected String insertion;

	@Column
	protected String lastName;

	@OneToMany(cascade = CascadeType.ALL)
	@SortNatural
	protected SortedSet<Item> inventory = new TreeSet<Item>();

	@Column
	protected int strength;

	@Column
	protected int dexterity;

	@Column
	protected int constitution;

	@Column
	protected int intelligence;

	@Column
	protected int wisdom;

	@Column
	protected int charisma;

	@Column
	protected int armorClass;

	@Column
	protected int hitPoints;
	
	@Column
	protected int temporaryHitPoints;

	@Column
	protected int speed;

	@Column
	protected String features;

	@Column
	protected String proficiencies;

	@Column
	protected String learnedLanguages;

	@Column
	protected String alignment;

	@Column
	protected int level;

	@Column
	protected int passiveWisdom;

	@Column
	protected int proficiency;

	@Column
	protected int spellDC;

	@Column
	protected int spellAttack;

	@Column
	protected int passivePerception;

	@Column
	protected int weight;

	@Column
	protected int size;

	@Column
	protected String race;
	
	@Column
	protected String initiative;

	@Column
	protected int climbingSpeed;

	@Column
	protected String type;

	@Column
	protected String lifestyle;

	@Column
	protected String backstory;

	@Column
	protected String eyeColor;

	@Column
	protected String skinColor;

	@Column
	protected String className;
	
	@Column
	protected String hairStyle;

	@Column
	protected int age;

	@Column
	protected String treasure;

	@Column
	protected String additionalFeaturesAndTraits;

	@Column
	protected String ideals;

	@Column
	protected String bonds;

	@Column
	protected String flaws;

	@Column
	protected String personality;

	@Column
	protected String featuresAndTraits;

	// Constructors

	public AbstractCharacterBase(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int armorClass,
			int hitPoints, int speed, String features, String proficiencies, String learnedLanguages, String alignment,
			int level, int passiveWisdom, int proficiency, int spellDC, int spellAttack, int passivePerception,
			int weight, int size, String race, int climbingSpeed, String type, String lifestyle, String backstory,
			String eyeColor, String skinColor, String hairStyle, int age, String treasure,
			String additionalFeaturesAndTraits, String ideals, String bonds, String flaws, String personality,
			String featuresAndTraits) {
		super();
		ID = iD;
		this.name = name;
		this.insertion = insertion;
		this.lastName = lastName;
		this.inventory = inventory;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.armorClass = armorClass;
		this.hitPoints = hitPoints;
		this.speed = speed;
		this.features = features;
		this.proficiencies = proficiencies;
		this.learnedLanguages = learnedLanguages;
		this.alignment = alignment;
		this.level = level;
		this.passiveWisdom = passiveWisdom;
		this.proficiency = proficiency;
		this.spellDC = spellDC;
		this.spellAttack = spellAttack;
		this.passivePerception = passivePerception;
		this.weight = weight;
		this.size = size;
		this.race = race;
		this.climbingSpeed = climbingSpeed;
		this.type = type;
		this.lifestyle = lifestyle;
		this.backstory = backstory;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.hairStyle = hairStyle;
		this.age = age;
		this.treasure = treasure;
		this.additionalFeaturesAndTraits = additionalFeaturesAndTraits;
		this.ideals = ideals;
		this.bonds = bonds;
		this.flaws = flaws;
		this.personality = personality;
		this.featuresAndTraits = featuresAndTraits;
	}
	

	public AbstractCharacterBase(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int armorClass,
			int hitPoints, int temporaryHitPoints, int speed, String features, String proficiencies,
			String learnedLanguages, String alignment, int level, int passiveWisdom, int proficiency, int spellDC,
			int spellAttack, int passivePerception, int weight, int size, String race, String initiative,
			int climbingSpeed, String type, String lifestyle, String backstory, String eyeColor, String skinColor,
			String className, String hairStyle, int age, String treasure, String additionalFeaturesAndTraits,
			String ideals, String bonds, String flaws, String personality, String featuresAndTraits) {
		super();
		ID = iD;
		this.name = name;
		this.insertion = insertion;
		this.lastName = lastName;
		this.inventory = inventory;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.armorClass = armorClass;
		this.hitPoints = hitPoints;
		this.temporaryHitPoints = temporaryHitPoints;
		this.speed = speed;
		this.features = features;
		this.proficiencies = proficiencies;
		this.learnedLanguages = learnedLanguages;
		this.alignment = alignment;
		this.level = level;
		this.passiveWisdom = passiveWisdom;
		this.proficiency = proficiency;
		this.spellDC = spellDC;
		this.spellAttack = spellAttack;
		this.passivePerception = passivePerception;
		this.weight = weight;
		this.size = size;
		this.race = race;
		this.initiative = initiative;
		this.climbingSpeed = climbingSpeed;
		this.type = type;
		this.lifestyle = lifestyle;
		this.backstory = backstory;
		this.eyeColor = eyeColor;
		this.skinColor = skinColor;
		this.className = className;
		this.hairStyle = hairStyle;
		this.age = age;
		this.treasure = treasure;
		this.additionalFeaturesAndTraits = additionalFeaturesAndTraits;
		this.ideals = ideals;
		this.bonds = bonds;
		this.flaws = flaws;
		this.personality = personality;
		this.featuresAndTraits = featuresAndTraits;
	}


	public AbstractCharacterBase(int level, String race, String type) {
		super();
		this.level = level;
		this.race = race;
		this.type = type;
	}

	public AbstractCharacterBase(String name, String insertion, String lastName, int level, String race) {
		super();
		this.name = name;
		this.insertion = insertion;
		this.lastName = lastName;
		this.level = level;
		this.race = race;
	}

	public AbstractCharacterBase(int iD) {
		super();
		ID = iD;
	}

	public AbstractCharacterBase(String name) {
		super();
		this.name = name;
	}

	public AbstractCharacterBase() {
		super();
	}

	// Getters and setters available to all classes
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInsertion() {
		return insertion;
	}

	public void setInsertion(String insertion) {
		this.insertion = insertion;
	}
	
	public void setInitiative(String initiative) {
		this.initiative = initiative;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setInventory(TreeSet<Item> inventory) {
		this.inventory = inventory;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}
	
	public void setTemporaryHitPoints(int temporaryHitPoints) {
		this.temporaryHitPoints = temporaryHitPoints;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public void setProficiencies(String proficiencies) {
		this.proficiencies = proficiencies;
	}

	public void setLearnedLanguages(String learnedLanguages) {
		this.learnedLanguages = learnedLanguages;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public void setPassiveWisdom(int passiveWisdom) {
		this.passiveWisdom = passiveWisdom;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setProficiency(int proficiency) {
		this.proficiency = proficiency;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setSpellDC(int spellDC) {
		this.spellDC = spellDC;
	}

	public void setSpellAttack(int spellAttack) {
		this.spellAttack = spellAttack;
	}

	public void setPassivePerception(int passivePerception) {
		this.passivePerception = passivePerception;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void setClimbingSpeed(int climbingSpeed) {
		this.climbingSpeed = climbingSpeed;
	}

	public void setLifestyle(String lifestyle) {
		this.lifestyle = lifestyle;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBackstory(String backstory) {
		this.backstory = backstory;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}

	public void setHairStyle(String hairStyle) {
		this.hairStyle = hairStyle;
	}

	public void setAdditionalFeaturesAndTraits(String additionalFeaturesAndTraits) {
		this.additionalFeaturesAndTraits = additionalFeaturesAndTraits;
	}

	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public void setFeaturesAndTraits(String featuresAndTraits) {
		this.featuresAndTraits = featuresAndTraits;
	}

	public void setInventory(SortedSet<Item> inventory) {
		this.inventory = inventory;
	}

	// Abstract getters and setters
	public abstract TreeSet<Item> getInventory();

	public abstract int getStrength();

	public abstract int getDexterity();

	public abstract int getConstitution();

	public abstract int getIntelligence();

	public abstract int getWisdom();

	public abstract int getCharisma();

	public abstract int getArmorClass();

	public abstract int getHitPoints();
	
	public abstract int getTemporaryHitPoints();

	public abstract int getSpeed();
	
	public abstract String getInitiative();

	public abstract String getFeatures();

	public abstract String getProficiencies();

	public abstract String getLearnedLanguages();

	public abstract String getAlignment();

	public abstract int getPassiveWisdom();

	public abstract int getProficiency();

	public abstract int getSpellDC();

	public abstract int getSpellAttack();

	public abstract int getPassivePerception();

	public abstract int getWeight();

	public abstract int getSize();

	public abstract String getRace();

	public abstract int getClimbingSpeed();

	public abstract String getType();

	public abstract String getLifestyle();

	public abstract String getBackstory();

	public abstract String getEyeColor();

	public abstract String getSkinColor();

	public abstract String getHairStyle();

	public abstract String getTreasure();

	public abstract String getAdditionalFeaturesAndTraits();

	public abstract String getIdeals();

	public abstract String getBonds();

	public abstract String getFlaws();

	public abstract String getPersonality();

	public abstract String getFeaturesAndTraits();

	public abstract String getClassName();
	
	 public int compareTo(AbstractCharacterBase acb) {
	      return this.ID == acb.getID() ? 0 : 1;
	    }


	@Override
	public String toString() {
		return String.format(
				"AbstractCharacterBase [ID=%s, name=%s, insertion=%s, lastName=%s, inventory=%s, strength=%s, dexterity=%s, constitution=%s, intelligence=%s, wisdom=%s, charisma=%s, armorClass=%s, hitPoints=%s, temporaryHitPoints=%s, speed=%s, features=%s, proficiencies=%s, learnedLanguages=%s, alignment=%s, level=%s, passiveWisdom=%s, proficiency=%s, spellDC=%s, spellAttack=%s, passivePerception=%s, weight=%s, size=%s, race=%s, initiative=%s, climbingSpeed=%s, type=%s, lifestyle=%s, backstory=%s, eyeColor=%s, skinColor=%s, className=%s, hairStyle=%s, age=%s, treasure=%s, additionalFeaturesAndTraits=%s, ideals=%s, bonds=%s, flaws=%s, personality=%s, featuresAndTraits=%s]",
				ID, name, insertion, lastName, inventory, strength, dexterity, constitution, intelligence, wisdom,
				charisma, armorClass, hitPoints, temporaryHitPoints, speed, features, proficiencies, learnedLanguages,
				alignment, level, passiveWisdom, proficiency, spellDC, spellAttack, passivePerception, weight, size,
				race, initiative, climbingSpeed, type, lifestyle, backstory, eyeColor, skinColor, className, hairStyle,
				age, treasure, additionalFeaturesAndTraits, ideals, bonds, flaws, personality, featuresAndTraits);
	}
	 
}