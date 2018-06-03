package nl.delphinity.questlog.datalayerInterfaces;

import java.util.UUID;

import nl.delphinity.questlog.models.CharacterBase;

public interface IDAOPlayerCharacterObject {

	public void update(); // Return character

	public void getCharachter(UUID id); // Return character

	public void deleteCharacter(UUID id);

	public void createCharacter(CharacterBase characterClass); // needs a character as parameter

}
