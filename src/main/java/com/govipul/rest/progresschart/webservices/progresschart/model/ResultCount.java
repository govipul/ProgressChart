package com.govipul.rest.progresschart.webservices.progresschart.model;

public class ResultCount {
  private int success;
  private int failure;
  private int pending;

  public ResultCount() {

  }


  public ResultCount(int success, int failure, int pending) {
    super();
    this.success = success;
    this.failure = failure;
    this.pending = pending;
  }

  public int getSuccess() {
    return success;
  }

  public void setSuccess(int success) {
    this.success = success;
  }

  public int getFailure() {
    return failure;
  }

  public void setFailure(int failure) {
    this.failure = failure;
  }

  public int getPending() {
    return pending;
  }

  public void setPending(int pending) {
    this.pending = pending;
  }


}
