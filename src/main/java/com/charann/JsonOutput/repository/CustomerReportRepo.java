package com.charann.JsonOutput.repository;

import com.charann.JsonOutput.entity.CustomerReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerReportRepo extends JpaRepository<CustomerReport, Long> {

    Boolean existsByCustId(int custId);

    CustomerReport getByCustId(int custId);

    List<CustomerReport> findAllByOrderByPriceDesc();
}
