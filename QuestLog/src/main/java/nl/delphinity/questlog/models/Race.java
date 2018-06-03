/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.delphinity.questlog.models;

/**
 *
 * @author Coen
 */
public class Race {
	private String name;
	private int strengthModifier;
	private int dexterityModifier;
	private int constitutionModifier;
	private int intelligenceModifier;
	private int wisdomModifier;
	private int charismaModifier;
	private String languages;
	private String alignment;
	private int speed;
	private String specialAbilities;
	private String size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrengthModifier() {
		return strengthModifier;
	}

	public void setStrengthModifier(int strengthModifier) {
		this.strengthModifier = strengthModifier;
	}

	public int getDexterityModifier() {
		return dexterityModifier;
	}

	public void setDexterityModifier(int dexterityModifier) {
		this.dexterityModifier = dexterityModifier;
	}

	public int getConstitutionModifier() {
		return constitutionModifier;
	}

	public void setConstitutionModifier(int constitutionModifier) {
		this.constitutionModifier = constitutionModifier;
	}

	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}

	public void setIntelligenceModifier(int intelligenceModifier) {
		this.intelligenceModifier = intelligenceModifier;
	}

	public int getWisdomModifier() {
		return wisdomModifier;
	}

	public void setWisdomModifier(int wisdomModifier) {
		this.wisdomModifier = wisdomModifier;
	}

	public int getCharismaModifier() {
		return charismaModifier;
	}

	public void setCharismaModifier(int charismaModifier) {
		this.charismaModifier = charismaModifier;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getSpecialAbilities() {
		return specialAbilities;
	}

	public void setSpecialAbilities(String specialAbilities) {
		this.specialAbilities = specialAbilities;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
