package nl.delphinity.questlog.datalayers;

import java.util.ArrayList;
import java.util.UUID;

import nl.delphinity.questlog.datalayerInterfaces.IDAOPlayerCharacterObject;
import nl.delphinity.questlog.models.CharacterBase;

public class TestPlayerCharacterDAO implements IDAOPlayerCharacterObject {
	ArrayList<CharacterBase> allCharacters = new ArrayList();
	private static TestPlayerCharacterDAO instance = null;

	public static TestPlayerCharacterDAO getInstance() {
		if (instance == null) {
			instance = new TestPlayerCharacterDAO();
		}
		return instance;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCharachter(UUID id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCharacter(UUID id) {

	}

	@Override
	public void createCharacter(CharacterBase characterBase) {
		allCharacters.add(characterBase);

	}

}
