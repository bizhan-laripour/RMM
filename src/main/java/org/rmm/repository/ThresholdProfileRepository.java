package org.rmm.repository;

import org.rmm.entity.ThresholdProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThresholdProfileRepository extends BaseRepository<ThresholdProfile> {

}
