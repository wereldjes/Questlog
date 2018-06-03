package nl.delphinity.questlog.models;

import java.util.TreeSet;

public class ProxyCharacterBase extends AbstractCharacterBase {

	private CharacterBase characterBase = null;
	
	public void CheckCharacter() {
		if(characterBase == null) {
			characterBase = new CharacterBase();
		}
	}
	
	@Override
	public TreeSet<Item> getInventory() {
		CheckCharacter();
		return characterBase.getInventory();
	}

	@Override
	public int getStrength() {
		CheckCharacter();
		return characterBase.getStrength();
	}

	@Override
	public int getDexterity() {
		CheckCharacter();
		return characterBase.getDexterity();
	}

	@Override
	public int getConstitution() {
		CheckCharacter();
		return characterBase.getConstitution();
	}

	@Override
	public int getIntelligence() {
		CheckCharacter();
		return characterBase.getIntelligence();
	}

	@Override
	public int getWisdom() {
		CheckCharacter();
		return characterBase.getWisdom();
	}

	@Override
	public int getCharisma() {
		CheckCharacter();
		return characterBase.getCharisma();
	}

	@Override
	public int getArmorClass() {
		CheckCharacter();
		return characterBase.getArmorClass();
	}

	@Override
	public int getHitPoints() {
		CheckCharacter();
		return characterBase.getHitPoints();
	}
	
	@Override
	public int getTemporaryHitPoints() {
		CheckCharacter();
		return characterBase.getTemporaryHitPoints();
	}

	@Override
	public int getSpeed() {
		CheckCharacter();
		return characterBase.getSpeed();
	}

	@Override
	public String getFeatures() {
		CheckCharacter();
		return characterBase.getFeatures();
	}

	@Override
	public String getProficiencies() {
		CheckCharacter();
		return characterBase.getProficiencies();
	}

	@Override
	public String getLearnedLanguages() {
		CheckCharacter();
		return characterBase.getLearnedLanguages();
	}

	@Override
	public String getAlignment() {
		CheckCharacter();
		return characterBase.getAlignment();
	}

	@Override
	public int getPassiveWisdom() {
		CheckCharacter();
		return characterBase.getPassiveWisdom();
	}

	@Override
	public int getProficiency() {
		CheckCharacter();
		return characterBase.getProficiency();
	}

	@Override
	public int getSpellDC() {
		CheckCharacter();
		return characterBase.getSpellDC();
	}

	@Override
	public int getSpellAttack() {
		CheckCharacter();
		return characterBase.getSpellAttack();
	}

	@Override
	public int getPassivePerception() {
		CheckCharacter();
		return characterBase.getPassivePerception();
	}

	@Override
	public int getWeight() {
		CheckCharacter();
		return characterBase.getWeight();
	}

	@Override
	public int getSize() {
		CheckCharacter();
		return characterBase.getSize();
	}

	@Override
	public String getRace() {
		CheckCharacter();
		return characterBase.getRace();
	}

	@Override
	public int getClimbingSpeed() {
		CheckCharacter();
		return characterBase.getClimbingSpeed();
	}

	@Override
	public String getType() {
		CheckCharacter();
		return characterBase.getType();
	}

	@Override
	public String getLifestyle() {
		CheckCharacter();
		return characterBase.getLifestyle();
	}

	@Override
	public String getBackstory() {
		CheckCharacter();
		return characterBase.getBackstory();
	}

	@Override
	public String getEyeColor() {
		CheckCharacter();
		return characterBase.getEyeColor();
	}

	@Override
	public String getSkinColor() {
		CheckCharacter();
		return characterBase.getSkinColor();
	}

	@Override
	public String getHairStyle() {
		CheckCharacter();
		return characterBase.getHairStyle();
	}

	@Override
	public String getTreasure() {
		CheckCharacter();
		return characterBase.getTreasure();
	}

	@Override
	public String getAdditionalFeaturesAndTraits() {
		CheckCharacter();
		return characterBase.getAdditionalFeaturesAndTraits();
	}

	@Override
	public String getIdeals() {
		CheckCharacter();
		return characterBase.getIdeals();
	}

	@Override
	public String getBonds() {
		CheckCharacter();
		return characterBase.getBonds();
	}

	@Override
	public String getFlaws() {
		CheckCharacter();
		return characterBase.getFlaws();
	}

	@Override
	public String getPersonality() {
		CheckCharacter();
		return characterBase.getPersonality();
	}

	@Override
	public String getFeaturesAndTraits() {
		CheckCharacter();
		return characterBase.getFeaturesAndTraits();
	}

	@Override
	public String getInitiative() {
		CheckCharacter();
		return characterBase.getInitiative();
	}

	@Override
	public String getClassName() {
		CheckCharacter();
		return characterBase.getClassName();
	}

	@Override
	public int compareTo(AbstractCharacterBase arg0) {
		
		return 0;
	}

	

}
