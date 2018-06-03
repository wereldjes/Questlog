package nl.delphinity.questlog.controllers;

import java.util.ArrayList;
import java.util.UUID;

import com.opensymphony.xwork2.ActionSupport;

import nl.delphinity.questlog.models.Adventure;
import nl.delphinity.questlog.models.AdventureManager;
import nl.delphinity.questlog.models.UserManager;


public class AdventureController extends ActionSupport {

	private static final long serialVersionUID = 6686847402427024167L;

	public Adventure adventure = new Adventure();
	public String adventureID;
	public ArrayList<Adventure> allAdventures = new ArrayList<>();
	
	public String execute() {
		allAdventures = UserManager.getInstance().getAllAdventuresOfUser(UserManager.getInstance().getLoginUser());
		return SUCCESS;
	}
	
	public String createAdventure() {
		adventure.setAdventureID(UUID.randomUUID().toString());
		AdventureManager.getInstance().createAdventure(adventure);
		AdventureManager.getInstance().addUserToAdventureList(adventure, UserManager.getInstance().getLoginUser());
		return SUCCESS;
	}
	
	public String deleteAdventure() {
		AdventureManager.getInstance().deleteAdventure(adventureID);
		return SUCCESS;
	}
	
	public String updateAdventure() {
		AdventureManager.getInstance().updateAdventure(adventure);
		return SUCCESS;
	}

}
