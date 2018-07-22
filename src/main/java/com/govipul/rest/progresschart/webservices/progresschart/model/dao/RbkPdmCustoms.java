package com.govipul.rest.progresschart.webservices.progresschart.model.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RBK_PDM_CUSTOMS")
public class RbkPdmCustoms {

  protected RbkPdmCustoms() {

  }

  @Id
  @Column(name = "RBK_CUSTOMS_SRC_ID", nullable = false)
  private Integer customsMigId;

  @Column(name = "MODEL_NUMBER", nullable = false)
  private String modelNumber;

  @Column(name = "SEASON_CODE", nullable = false)
  private String seasonCode;

  @Column(name = "ARTICLE_NUMBER", nullable = false)
  private String articleNumber;

  @Column(name = "DQ_CHECK", nullable = false)
  private Integer dqCheck;

  @Column(name = "MIGRATION_STATUS", nullable = false)
  private Integer migrationStatus;

  @Column(name = "ERROR_MESSAGE", nullable = false)
  private String errorMessage;

  public Integer getCustomsMigId() {
    return customsMigId;
  }

  public void setCustomsMigId(Integer customsMigId) {
    this.customsMigId = customsMigId;
  }

  public String getModelNumber() {
    return modelNumber;
  }

  public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
  }

  public String getSeasonCode() {
    return seasonCode;
  }

  public void setSeasonCode(String seasonCode) {
    this.seasonCode = seasonCode;
  }

  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public Integer getDqCheck() {
    return dqCheck;
  }

  public void setDqCheck(Integer dqCheck) {
    this.dqCheck = dqCheck;
  }

  public Integer getMigrationStatus() {
    return migrationStatus;
  }

  public void setMigrationStatus(Integer migrationStatus) {
    this.migrationStatus = migrationStatus;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
