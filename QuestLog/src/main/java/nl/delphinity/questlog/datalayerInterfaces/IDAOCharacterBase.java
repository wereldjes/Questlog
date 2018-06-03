package nl.delphinity.questlog.datalayerInterfaces;

import java.util.UUID;

import nl.delphinity.questlog.models.CharacterBase;

public interface IDAOCharacterBase {
	public boolean createCharacterBase(CharacterBase cb);
	public boolean deleteCharacterBase(CharacterBase cb);
	public boolean updateCharacterBase(CharacterBase cb);
	
	public CharacterBase getCharacterBase(UUID id);
}
