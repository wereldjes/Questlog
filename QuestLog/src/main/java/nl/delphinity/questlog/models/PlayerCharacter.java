package nl.delphinity.questlog.models;

import java.util.SortedSet;

import javax.persistence.*;

@Entity
@Table(name = "PlayerCharacters")
public class PlayerCharacter extends CharacterBase {
	@Column
	private int experience;
	
	@Column
	private int carryingCapacity;
	
	@Column
	private int deathSavesSucces;
	
	@Column
	private int deathSavesFailures;
	
	@Column
	private int athletics;
	
	@Column
	private int acrobatics;
	
	@Column
	private int sleightofhand;
	
	@Column
	private int stealth;
	
	@Column
	private int arcana;
	
	@Column
	private int history;
	
	@Column
	private int investigation;
	
	@Column
	private int nature;
	
	@Column
	private int religion;
	
	@Column
	private int animalHandling;
	
	@Column
	private int insight;
	
	@Column
	private int medicine;
	
	@Column
	private int perception;
	
	@Column
	private int survival;
	
	@Column
	private int deception;
	
	@Column
	private int intimidation;
	
	@Column
	private int performance;
	
	@Column
	private int persuasion;

	public PlayerCharacter() {
		super();
	}


	public PlayerCharacter(int iD, String name, String insertion, String lastName, SortedSet<Item> inventory,
			int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma, int armorClass,
			int hitPoints, int temporaryHitPoints, int speed, String features, String proficiencies,
			String learnedLanguages, String alignment, int level, int passiveWisdom, int proficiency, int spellDC,
			int spellAttack, int passivePerception, int weight, int size, String race, String initiative,
			int climbingSpeed, String type, String lifestyle, String backstory, String eyeColor, String skinColor,
			String className, String hairStyle, int age, String treasure, String additionalFeaturesAndTraits,
			String ideals, String bonds, String flaws, String personality, String featuresAndTraits) {
		super(iD, name, insertion, lastName, inventory, strength, dexterity, constitution, intelligence, wisdom, charisma,
				armorClass, hitPoints, temporaryHitPoints, speed, features, proficiencies, learnedLanguages, alignment, level,
				passiveWisdom, proficiency, spellDC, spellAttack, passivePerception, weight, size, race, initiative,
				climbingSpeed, type, lifestyle, backstory, eyeColor, skinColor, className, hairStyle, age, treasure,
				additionalFeaturesAndTraits, ideals, bonds, flaws, personality, featuresAndTraits);
		// TODO Auto-generated constructor stub
	}


	// method
	public void addItemToInventory(Item item) {
		this.getInventory().add(item);
	}

	//
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getCarryingCapacity() {
		return carryingCapacity;
	}

	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}

	public int getDeathSavesSucces() {
		return deathSavesSucces;
	}

	public void setDeathSavesSucces(int deathSavesSucces) {
		this.deathSavesSucces = deathSavesSucces;
	}

	public int getDeathSavesFailures() {
		return deathSavesFailures;
	}

	public void setDeathSavesFailures(int deathSavesFailures) {
		this.deathSavesFailures = deathSavesFailures;
	}

	public int getAthletics() {
		return athletics;
	}

	public void setAthletics(int athletics) {
		this.athletics = athletics;
	}

	public int getAcrobatics() {
		return acrobatics;
	}

	public void setAcrobatics(int acrobatics) {
		this.acrobatics = acrobatics;
	}

	public int getSleightofhand() {
		return sleightofhand;
	}

	public void setSleightofhand(int sleightofhand) {
		this.sleightofhand = sleightofhand;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getArcana() {
		return arcana;
	}

	public void setArcana(int arcana) {
		this.arcana = arcana;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getInvestigation() {
		return investigation;
	}

	public void setInvestigation(int investigation) {
		this.investigation = investigation;
	}

	public int getNature() {
		return nature;
	}

	public void setNature(int nature) {
		this.nature = nature;
	}

	public int getReligion() {
		return religion;
	}

	public void setReligion(int religion) {
		this.religion = religion;
	}

	public int getAnimalHandling() {
		return animalHandling;
	}

	public void setAnimalHandling(int animalHandling) {
		this.animalHandling = animalHandling;
	}

	public int getInsight() {
		return insight;
	}

	public void setInsight(int insight) {
		this.insight = insight;
	}

	public int getMedicine() {
		return medicine;
	}

	public void setMedicine(int medicine) {
		this.medicine = medicine;
	}

	public int getPerception() {
		return perception;
	}

	public void setPerception(int perception) {
		this.perception = perception;
	}

	public int getSurvival() {
		return survival;
	}

	public void setSurvival(int survival) {
		this.survival = survival;
	}

	public int getDeception() {
		return deception;
	}

	public void setDeception(int deception) {
		this.deception = deception;
	}

	public int getIntimidation() {
		return intimidation;
	}

	public void setIntimidation(int intimidation) {
		this.intimidation = intimidation;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public int getPersuasion() {
		return persuasion;
	}

	public void setPersuasion(int persuasion) {
		this.persuasion = persuasion;
	}

	@Override
	public String toString() {
		return String.format(
				"PlayerCharacter [experience=%s, carryingCapacity=%s, deathSavesSucces=%s, deathSavesFailures=%s, athletics=%s, acrobatics=%s, sleightofhand=%s, stealth=%s, arcana=%s, history=%s, investigation=%s, nature=%s, religion=%s, animalHandling=%s, insight=%s, medicine=%s, perception=%s, survival=%s, deception=%s, intimidation=%s, performance=%s, persuasion=%s, CharacterBase=%s]",
				experience, carryingCapacity, deathSavesSucces, deathSavesFailures, athletics, acrobatics,
				sleightofhand, stealth, arcana, history, investigation, nature, religion, animalHandling, insight,
				medicine, perception, survival, deception, intimidation, performance, persuasion,super.toString());
	}
	
	
	
	
	
	
	
	

}
