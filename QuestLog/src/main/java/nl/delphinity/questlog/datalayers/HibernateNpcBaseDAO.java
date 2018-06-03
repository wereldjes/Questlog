package nl.delphinity.questlog.datalayers;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import nl.delphinity.questlog.datalayerInterfaces.IDAONpcBase;
import nl.delphinity.questlog.models.Monster;
import nl.delphinity.questlog.models.Npc;

public class HibernateNpcBaseDAO implements IDAONpcBase {
	private static HibernateNpcBaseDAO instance = null;

	private Session hSess = null;
	private Transaction hTransaction = null;

	public static HibernateNpcBaseDAO getInstance() {
		if (null == instance) {
			instance = new HibernateNpcBaseDAO();
		}
		return instance;
	}

	public HibernateNpcBaseDAO() {
		hSess = HibernateDAOFactory.getSession();
	}

	private void beginTransaction() {
		hTransaction = hSess.beginTransaction();
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
	public void CreateNpc(Npc npc) {
		beginTransaction();
		hSess.save(npc);
		commitTransaction();

	}

	@Override
	public Npc getNpc(int id) {
		beginTransaction();
		Npc n = hSess.find(Npc.class, id);
		commitTransaction();
		return n;
	}

	@Override
	public void removeNpc(int id) {
		beginTransaction();
		Npc n = hSess.find(Npc.class, id);
		hSess.remove(n);
		commitTransaction();
	}

	@Override
	public void createMonster(Monster monster) {
		beginTransaction();
		hSess.save(monster);
		commitTransaction();
	}

	@Override
	public Monster getMonster(int id) {
		beginTransaction();
		Monster m = hSess.find(Monster.class, id);
		commitTransaction();
		return m;
	}

	@Override
	public void removeMonster(int id) {
		beginTransaction();
		Monster m = hSess.find(Monster.class, id);
		hSess.remove(m);
		commitTransaction();
		
	}

}
