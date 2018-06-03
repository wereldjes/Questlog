package nl.delphinity.questlog.datalayerInterfaces;

import java.util.UUID;

import nl.delphinity.questlog.models.RolePlayer;

public interface IDAORolePlayer {
	public boolean createRolePlayer(RolePlayer rp);
	public boolean updateRolePlayer(RolePlayer rp);
	public boolean deleteRolePlayer(RolePlayer rp);
	
	public RolePlayer getRolePlayer(UUID id);
}
