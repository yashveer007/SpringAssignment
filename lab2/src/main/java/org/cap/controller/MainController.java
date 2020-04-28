package org.cap.controller;

import java.util.List;

import org.cap.entities.Trainee;
import org.cap.service.ITraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@Autowired
	private ITraineeService traineeService;

	@GetMapping("/")
	public ModelAndView loginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("LoginPage");
		return mv;
	}

	@GetMapping("/TrainingManagementSystem")
	public ModelAndView trainingManagementSystem() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("TrainingManagementSystem");
		return mv;
	}

	@GetMapping("/AddTrainee")
	public ModelAndView addTrainee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddTrainee");
		return mv;
	}

	@GetMapping("/DeleteTrainee")
	public ModelAndView deleteTrainee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteTrainee");
		return mv;
	}

	@GetMapping("/ModifyTrainee")
	public ModelAndView modifyTrainee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ModifyTrainee");
		return mv;
	}

	@GetMapping("/RetrieveTrainee")
	public ModelAndView retrieveTrainee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RetrieveTrainee");
		return mv;
	}

	@GetMapping("/RetrieveAllTrainees")
	public ModelAndView retrieveAllTrainees() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RetrieveAllTrainees");
		return mv;
	}

	@GetMapping("/processAddTrainee")
	public ModelAndView addTrainee(@RequestParam("traineeid") int traineeId,
			@RequestParam("traineename") String traineeName, @RequestParam("traineedomain") String traineeDomain,
			@RequestParam("traineelocation") String traineeLocation) {
		Trainee trainee = new Trainee(traineeId, traineeName, traineeDomain, traineeLocation);
		traineeService.add(trainee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("AddTrainee");

		return mv;
	}

	@GetMapping("/processDeleteTrainee")
	public ModelAndView deleteTrainee(@RequestParam("traineeid") int traineeId) {
		Trainee trainee = traineeService.delete(traineeId);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteTrainee");
		return mv;
	}

	@GetMapping("/processModifyTrainee")
	public ModelAndView modifyTrainee(@RequestParam("traineeid") int traineeId,
			@RequestParam("traineename") String traineeName, @RequestParam("traineedomain") String traineeDomain,
			@RequestParam("traineelocation") String traineeLocation) {
		Trainee trainee=traineeService.retrieve(traineeId);
		 trainee = new Trainee(traineeId,traineeName,traineeDomain,traineeLocation);
		traineeService.modify(trainee);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ModifyTrainee");
		return mv;
	}

	@GetMapping("/processRetrieveTrainee")
	public ModelAndView retrieveTrainee(@RequestParam("traineeid") int traineeId) {
		Trainee trainee = traineeService.retrieve(traineeId);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ShowTraineeDetails");
		mv.addObject("trainee", trainee);
		return mv;
	}

	@GetMapping("/processRetrieveAllTrainees")
	public ModelAndView retrieveAllTraineesDetails() {
		List<Trainee> trainee = traineeService.retrieveAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("RetrieveAllTrainees");
		mv.addObject("traineelist", trainee);
		return mv;
	}

}
