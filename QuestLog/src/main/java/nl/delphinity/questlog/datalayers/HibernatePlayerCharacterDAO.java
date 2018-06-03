package nl.delphinity.questlog.datalayers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import nl.delphinity.questlog.datalayerInterfaces.IDAOPlayerCharacter;
import nl.delphinity.questlog.models.PlayerCharacter;

public class HibernatePlayerCharacterDAO implements IDAOPlayerCharacter {

	private static HibernatePlayerCharacterDAO instance = null;
	private Session hSession;
	private Transaction hTransaction;
	
	public static HibernatePlayerCharacterDAO getInstance() {
		if(null == instance) {
			instance = new HibernatePlayerCharacterDAO();
		}
		return instance;
	}
	
	
	public HibernatePlayerCharacterDAO() {
		hSession = HibernateDAOFactory.getSession();
	}
	
	
	private void beginTransaction() {
		hTransaction = hSession.beginTransaction();
	}
	
	private boolean commitTransaction() {
		try {
			hTransaction.commit();
			return true;
		} catch(HibernateException hex) {
			System.err.println("ERROR: HibernatePlayerCharacterDAO::commitTransaction(): caught HibernateException. Rolling back and dumping stack trace.");
			hTransaction.rollback();
			hex.printStackTrace();
			return false;
		} catch(Exception e) {
			System.err.println("ERROR: HibernatePlayerCharacterDAO::commitTransaction(): caught Exception. rolling back and printing  stack trace...");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		}
	}
	
	
	@Override
	public boolean create(PlayerCharacter pc) {
		beginTransaction();
		hSession.save(pc);
		return commitTransaction();
	}

	@Override
	public boolean updateByPc(PlayerCharacter pc) {
		beginTransaction();
		hSession.update(pc);
		return commitTransaction();
		
	}

	@Override
	public boolean deleteByPc(PlayerCharacter pc) {
		beginTransaction();
		hSession.delete(pc);
		return commitTransaction();
	}
	

	@Override
	public PlayerCharacter get(int id) {
		beginTransaction();
		PlayerCharacter pc = (PlayerCharacter) hSession.get(PlayerCharacter.class,id);
		commitTransaction();
		if(null == pc) {
			System.err.println("ERROR: HibernatePlayerCharacterDAO::get(): getting failed. returning NULL");
		}
		return pc;
	}


	@Override
	public boolean deleteById(int id) {
		beginTransaction();
		PlayerCharacter pc = hSession.find(PlayerCharacter.class, id);
		hSession.remove(pc);
		return commitTransaction();
		
	}

}
