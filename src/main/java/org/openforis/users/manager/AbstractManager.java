package org.openforis.users.manager;

import java.util.List;

import org.jooq.Configuration;
import org.jooq.DAO;
import org.jooq.TransactionalRunnable;
import org.jooq.impl.DSL;
import org.openforis.users.model.IdentifiableObject;

@SuppressWarnings("rawtypes")
public abstract class AbstractManager<E extends IdentifiableObject, D extends DAO> {
	
	protected D dao;
	
	public AbstractManager(D dao) {
		this.dao = dao;
	}

	@SuppressWarnings("unchecked")
	public E findById(Long id) {
		return (E) dao.findById(id);
	}
	
	@SuppressWarnings("unchecked")
	public List<E> findAll() {
		return dao.findAll();
	}
	
	@SuppressWarnings("unchecked")
	public void save(E item) {
		runInTransaction(new Runnable() {
			public void run() {
				if (item.getId() == null) {
					dao.insert(item);
				} else {
					dao.update(item);
				}
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public void delete(E item) {
		runInTransaction(new Runnable() {
			public void run() {
				dao.delete(item);
			}
		});
	}
	
	@SuppressWarnings("unchecked")
	public boolean deleteById(Long id) {
		runInTransaction(new Runnable() {
			public void run() {
				dao.deleteById(id);
			}
		});
		return true;
	}
	
	protected void runInTransaction(Runnable runnable) {
		DSL.using(dao.configuration()).transaction(new TransactionalRunnable() {
			public void run(Configuration configuration) throws Exception {
				runnable.run();
			}
		});
	}
}