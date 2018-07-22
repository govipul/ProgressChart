package com.govipul.rest.progresschart.webservices.progresschart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.govipul.rest.progresschart.webservices.progresschart.model.dao.RbkPdmCustoms;


public interface CustomsRepository extends JpaRepository<RbkPdmCustoms, Integer> {

  @Query("SELECT c FROM RbkPdmCustoms c WHERE c.seasonCode=?1 "
      + "and dqCheck=1 and errorMessage LIKE '%SUCCESS%'")
  public List<RbkPdmCustoms> findBySeasonCodeSuccessMessage(String seasonCode);

  @Query("SELECT c FROM RbkPdmCustoms c WHERE c.seasonCode=?1 "
      + "and dqCheck=1 and errorMessage NOT LIKE '%SUCCESS%' and ERROR_MESSAGE is NOT NULL")
  public List<RbkPdmCustoms> findBySeasonCodeFailureMessage(String seasonCode);

  @Query("SELECT c FROM RbkPdmCustoms c WHERE c.seasonCode=?1 "
      + "and migrationStatus=0 and dqCheck=1 and errorMessage is NULL")
  public List<RbkPdmCustoms> findBySeasonCodePendingMessage(String seasonCode);
}
