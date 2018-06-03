package nl.delphinity.questlog.models;

import java.util.SortedSet;
import java.util.TreeSet;

//import org.hibernate.annotations.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Characters")
public class CharacterBase extends AbstractCharacterBase {

	public CharacterBase() {
		super();
	}

	public CharacterBase(int iD) {
		super(iD);
	}

	public CharacterBase(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int armorClass,
			int hitPoints, int speed, String features, String proficiencies, String learnedLanguages, String alignment,
			int level, int passiveWisdom, int proficiency, int spellDC, int spellAttack, int passivePerception,
			int weight, int size, String race, int climbingSpeed, String type, String lifestyle, String backstory,
			String eyeColor, String skinColor, String hairStyle, int age, String treasure,
			String additionalFeaturesAndTraits, String ideals, String bonds, String flaws, String personality,
			String featuresAndTraits) {
		super(iD, name, insertion, lastName, inventory, strength, dexterity, constitution, intelligence, wisdom,
				charisma, armorClass, hitPoints, speed, features, proficiencies, learnedLanguages, alignment, level,
				passiveWisdom, proficiency, spellDC, spellAttack, passivePerception, weight, size, race, climbingSpeed,
				type, lifestyle, backstory, eyeColor, skinColor, hairStyle, age, treasure, additionalFeaturesAndTraits,
				ideals, bonds, flaws, personality, featuresAndTraits);
	}

	public CharacterBase(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int armorClass,
			int hitPoints, int temporaryHitPoints, int speed, String features, String proficiencies,
			String learnedLanguages, String alignment, int level, int passiveWisdom, int proficiency, int spellDC,
			int spellAttack, int passivePerception, int weight, int size, String race, String initiative,
			int climbingSpeed, String type, String lifestyle, String backstory, String eyeColor, String skinColor,
			String className, String hairStyle, int age, String treasure, String additionalFeaturesAndTraits,
			String ideals, String bonds, String flaws, String personality, String featuresAndTraits) {
		super(iD, name, insertion, lastName, inventory, strength, dexterity, constitution, intelligence, wisdom,
				charisma, armorClass, hitPoints, temporaryHitPoints, speed, features, proficiencies, learnedLanguages,
				alignment, level, passiveWisdom, proficiency, spellDC, spellAttack, passivePerception, weight, size,
				race, initiative, climbingSpeed, type, lifestyle, backstory, eyeColor, skinColor, className, hairStyle,
				age, treasure, additionalFeaturesAndTraits, ideals, bonds, flaws, personality, featuresAndTraits);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Monster constructor
	 */
	public CharacterBase(int level, String race, String type) {
		super(level, race, type);
	}

	public CharacterBase(String name) {
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
	public CharacterBase(String name, String insertion, String lastName, int level, String race) {
		super(name, insertion, lastName, level, race);
	}

	@Override
	public TreeSet<Item> getInventory() {
		return (TreeSet<Item>) inventory;
	}

	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public int getDexterity() {
		return dexterity;
	}

	@Override
	public int getConstitution() {
		return constitution;
	}

	@Override
	public int getIntelligence() {
		return intelligence;
	}

	@Override
	public int getWisdom() {
		return wisdom;
	}

	@Override
	public int getCharisma() {
		return charisma;
	}

	@Override
	public int getArmorClass() {
		return armorClass;
	}

	@Override
	public int getHitPoints() {
		return hitPoints;
	}

	@Override
	public int getSpeed() {
		return speed;
	}

	@Override
	public String getFeatures() {
		return features;
	}

	@Override
	public String getProficiencies() {
		return proficiencies;
	}

	@Override
	public String getLearnedLanguages() {
		return learnedLanguages;
	}

	@Override
	public String getAlignment() {
		return alignment;
	}

	@Override
	public int getPassiveWisdom() {
		return passiveWisdom;
	}

	@Override
	public int getProficiency() {
		return proficiency;
	}

	@Override
	public int getSpellDC() {
		return spellDC;
	}

	@Override
	public int getSpellAttack() {
		return spellAttack;
	}

	@Override
	public int getPassivePerception() {
		return passivePerception;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String getRace() {
		return race;
	}

	@Override
	public int getClimbingSpeed() {
		return climbingSpeed;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getLifestyle() {
		return lifestyle;
	}

	@Override
	public String getBackstory() {
		return backstory;
	}

	@Override
	public String getEyeColor() {
		return eyeColor;
	}

	@Override
	public String getSkinColor() {
		return skinColor;
	}

	@Override
	public String getHairStyle() {
		return hairStyle;
	}

	@Override
	public String getTreasure() {
		return treasure;
	}

	@Override
	public String getAdditionalFeaturesAndTraits() {
		return additionalFeaturesAndTraits;
	}

	@Override
	public String getIdeals() {
		return ideals;
	}

	@Override
	public String getBonds() {
		return bonds;
	}

	@Override
	public String getFlaws() {
		return flaws;
	}

	@Override
	public String getPersonality() {
		return personality;
	}

	@Override
	public String getFeaturesAndTraits() {
		return featuresAndTraits;
	}

	@Override
	public int getTemporaryHitPoints() {
		return temporaryHitPoints;
	}

	@Override
	public String getInitiative() {
		return initiative;
	}

	@Override
	public String getClassName() {
		return className;
	}

}
