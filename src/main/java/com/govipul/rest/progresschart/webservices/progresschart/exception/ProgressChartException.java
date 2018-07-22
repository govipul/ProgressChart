package com.govipul.rest.progresschart.webservices.progresschart.exception;


public class ProgressChartException extends Exception {

  private static final long serialVersionUID = 3031187633292245809L;

  public ProgressChartException() {
    super();
  }

  public ProgressChartException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public ProgressChartException(String message, Throwable cause) {
    super(message, cause);
  }

  public ProgressChartException(String message) {
    super(message);
  }

  public ProgressChartException(Throwable cause) {
    super(cause);
  }

}
