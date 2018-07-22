package com.govipul.rest.progresschart.webservices.progresschart.service.customs;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.govipul.rest.progresschart.webservices.progresschart.dao.CustomsRepository;
import com.govipul.rest.progresschart.webservices.progresschart.model.dao.RbkPdmCustoms;
import com.govipul.rest.progresschart.webservices.progresschart.service.ProgressCountService;

@Component
public class CustomsService implements ProgressCountService {

	@Autowired
	private CustomsRepository customRepository;

	@Override
	public int getSuccessMessageCount(String seasonCode) {
		List<RbkPdmCustoms> sucessData = customRepository.findBySeasonCodeSuccessMessage(seasonCode);
		return sucessData.size();
	}

	@Override
	public int getFailureMessageCount(String seasonCode) {
		List<RbkPdmCustoms> failureMessage = customRepository.findBySeasonCodeFailureMessage(seasonCode);
		return failureMessage.size();
	}

	@Override
	public int getPendingMessageCount(String seasonCode) {
		List<RbkPdmCustoms> pendingMessage = customRepository.findBySeasonCodePendingMessage(seasonCode);
		return pendingMessage.size();
	}

	@Override
	public Set<String> getErrorMessage(String seasonCode) {
		return null;
	}

}
