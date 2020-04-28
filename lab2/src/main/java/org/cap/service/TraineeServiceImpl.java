package org.cap.service;

import org.cap.dao.ITraineeDao;
import org.cap.entities.Trainee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService {

	private ITraineeDao traineeDao;

	public ITraineeDao getEmployeeDao() {
		return traineeDao;
	}

	@Autowired
	public void setEmployeeDao(ITraineeDao dao) {
		this.traineeDao = dao;
	}

	@Override
	public Trainee add(Trainee trainee) {
		trainee = traineeDao.add(trainee);
		return trainee;
	}

	@Override
	public Trainee delete(int traineeId) {
		Trainee trainee = traineeDao.delete(traineeId);
		return trainee;
	}

	@Override
	public Trainee modify(Trainee trainee) {
		trainee = traineeDao.modify(trainee);
		return trainee;
	}

	@Override
	public Trainee retrieve(int traineeId) {
		Trainee trainee = traineeDao.retrieve(traineeId);
		return trainee;
	}

	@Override
	public List<Trainee> retrieveAll() {
		List<Trainee> trainees = traineeDao.retrieveAll();
		return trainees;
	}

}