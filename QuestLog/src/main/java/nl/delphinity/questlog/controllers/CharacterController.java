package nl.delphinity.questlog.controllers;

import com.opensymphony.xwork2.ActionSupport;

import nl.delphinity.questlog.models.PlayerCharacter;
import nl.delphinity.questlog.services.PlayerAdderServiceHardCoded;

public class CharacterController extends ActionSupport {
	
	/**
	 * generated SerialVersionUID
	 */
	private static final long serialVersionUID = 8650229062305744588L;
	
	
	private PlayerCharacter pc = new PlayerCharacter();
	
	public PlayerCharacter getPc() { 
		return pc;
	}
	
	public void setPc(PlayerCharacter pc) {
		this.pc = pc;
	}
	
	public String Execute() {
		return SUCCESS;
	}
	 
	public String createCharacter() {
		PlayerAdderServiceHardCoded.getInstance().addPlayerCharacterToPlayer(pc);
		return SUCCESS;
	}
	
}