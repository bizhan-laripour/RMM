package org.rmm.repository;

import org.rmm.entity.AlertSeverity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertSeverityRepository extends JpaRepository<AlertSeverity , Long> {
}
