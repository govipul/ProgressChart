package com.govipul.rest.progresschart.webservices.progresschart.service;

import java.util.Set;

import com.govipul.rest.progresschart.webservices.progresschart.exception.ProgressChartException;

public interface ProgressCountService {

  public int getSuccessMessageCount(String seasonCode) throws ProgressChartException;

  public int getFailureMessageCount(String seasonCode) throws ProgressChartException;

  public int getPendingMessageCount(String seasonCode) throws ProgressChartException;

  public Set<String> getErrorMessage(String seasonCode) throws ProgressChartException;
}
