package com.govipul.rest.progresschart.webservices.progresschart.controller.customs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.govipul.rest.progresschart.webservices.progresschart.model.ResultCount;
import com.govipul.rest.progresschart.webservices.progresschart.service.customs.CustomsService;

@RestController
public class Customs {

	@Autowired
	private CustomsService service;

	@GetMapping("/customs/{seasonCode}")
	public ResultCount getStatus(@PathVariable String seasonCode) {
		ResultCount countData = new ResultCount();
		/*
		 * countData.setSuccess(service.getSuccessMessageCount(seasonCode));
		 * countData.setFailure(service.getFailureMessageCount(seasonCode));
		 * countData.setPending(service.getPendingMessageCount(seasonCode));)
		 */
		countData.setSuccess((int) (Math.random() * 10000));
		countData.setFailure((int) (Math.random() * 100));
		countData.setPending((int) (Math.random() * 10000));
		return countData;
	}
}
