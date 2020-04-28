package org.cap.service;

import org.cap.entities.Trainee;

import java.util.List;

public interface ITraineeService {
	Trainee add(Trainee trainee);

	Trainee delete(int traineeId);

	Trainee modify(Trainee trainee);

	Trainee retrieve(int traineeId);

	public List<Trainee> retrieveAll();
}
