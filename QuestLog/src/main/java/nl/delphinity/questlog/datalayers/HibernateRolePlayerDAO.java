package nl.delphinity.questlog.datalayers;

import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import nl.delphinity.questlog.datalayerInterfaces.IDAORolePlayer;
import nl.delphinity.questlog.models.RolePlayer;

public class HibernateRolePlayerDAO implements IDAORolePlayer {

	
	
	
	
	private Session hSession = null;
	private Transaction hTransaction = null;
	
	private static HibernateRolePlayerDAO instance = null;

	public static HibernateRolePlayerDAO getInstance() {
		if (null == instance) {
			instance = new HibernateRolePlayerDAO();
		}
		return instance;
	}
	
	public HibernateRolePlayerDAO() {
		hSession = HibernateDAOFactory.getSession();
	}
	
	
	
	
	private void beginTransaction() {
		hTransaction = hSession.beginTransaction();
	}

	private boolean commitTransaction() {
		try {
			hTransaction.commit();
			return true;
		} catch (HibernateException e) {
			System.err.println(
					"HibernateRolePlayerDAO::commitTransaction(): caught HibernateException. Rolling back.");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			System.err.println("HibernateRolePlayerDAO::commitTransaction(): caught Exception. Rolling back.");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	
	@Override
	public boolean createRolePlayer(RolePlayer rp) {
		beginTransaction();
		hSession.save(rp);
		return commitTransaction();
	}

	@Override
	public boolean updateRolePlayer(RolePlayer rp) {
		beginTransaction();
		hSession.update(rp);
		return commitTransaction();
		
	}

	@Override
	public boolean deleteRolePlayer(RolePlayer rp) {
		beginTransaction();
		hSession.remove(rp);
		return commitTransaction();
		
	}

	@Override
	public RolePlayer getRolePlayer(UUID id) {
		beginTransaction();
		RolePlayer rp = (RolePlayer) hSession.get(RolePlayer.class, id);
		commitTransaction();
		return rp;
	}

}
