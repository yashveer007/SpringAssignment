package org.cap.dao;

import org.cap.entities.Trainee;

import java.util.List;

public interface ITraineeDao {
	Trainee add(Trainee trainee);

	Trainee delete(int traineeId);

	Trainee modify(Trainee trainee);

	Trainee retrieve(int traineeId);

	public List<Trainee> retrieveAll();

}
