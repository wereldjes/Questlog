package nl.delphinity.questlog.datalayers;

import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import nl.delphinity.questlog.datalayerInterfaces.IDAOCharacterBase;
import nl.delphinity.questlog.models.CharacterBase;

public class HibernateCharacterBaseDAO implements IDAOCharacterBase {
	private static HibernateCharacterBaseDAO instance = null;

	private Session hSession = null;
	private Transaction hTransaction = null;

	public static HibernateCharacterBaseDAO getInstance() {
		if (null == instance) {
			instance = new HibernateCharacterBaseDAO();
		}
		return instance;
	}

	public HibernateCharacterBaseDAO() {
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
					"HibernateCharacterBaseDAO::commitTransaction(): caught HibernateException. Rolling back.");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		} catch (Exception e) {
			System.err.println("HibernateCharacterBaseDAO::commitTransaction(): caught Exception. Rolling back.");
			hTransaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createCharacterBase(CharacterBase cb) {
		beginTransaction();
		hSession.save(cb);
		return commitTransaction();

	}

	@Override
	public boolean deleteCharacterBase(CharacterBase cb) {
		beginTransaction();
		hSession.remove(cb);
		return commitTransaction();

	}

	@Override
	public boolean updateCharacterBase(CharacterBase cb) {
		beginTransaction();
		hSession.update(cb);
		return commitTransaction();

	}

	@Override
	public CharacterBase getCharacterBase(UUID id) {
		beginTransaction();
		CharacterBase cb = (CharacterBase) hSession.get(CharacterBase.class, id);
		commitTransaction();
		return cb; // NULL check? trycatch?
	}

	public CharacterBase getCharacterBase(String name) {
		beginTransaction();
		//System.out.println(hSession.get(CharacterBase.class, name));
		CharacterBase cb = (CharacterBase) hSession.get(CharacterBase.class, name);
		if (null == cb) {
			System.out.println("HibernateCharacterBaseDAO::GetCharacterBase(string): cb == null");
		}
		commitTransaction();
		return cb;
	}

}
