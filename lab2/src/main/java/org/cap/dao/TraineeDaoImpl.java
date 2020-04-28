package org.cap.dao;

import org.cap.entities.Trainee;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class TraineeDaoImpl implements ITraineeDao {

	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext // @Autowired
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Trainee add(Trainee trainee) {

		trainee = entityManager.merge(trainee);
		return trainee;
	}

	@Override
	public Trainee delete(int traineeId) {

		Trainee trainee = retrieve(traineeId);
		entityManager.remove(trainee);
		return trainee;
	}

	@Override
	public Trainee modify(Trainee trainee) {
		trainee = entityManager.merge(trainee);
		return trainee;
	}

	@Override
	public Trainee retrieve(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		return trainee;
	}

	@Override
	public List<Trainee> retrieveAll() {
		String jql = "from Trainee";
		TypedQuery<Trainee> query = entityManager.createQuery(jql, Trainee.class);
		List<Trainee> list = query.getResultList();
		return list;
	}

}