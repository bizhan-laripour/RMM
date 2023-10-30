package org.rmm.repository;

import org.rmm.entity.Alarm;
import org.rmm.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlarmRepository extends BaseRepository<Alarm> {

    List<Alarm> findAlarmsByCategory(Category category);




}
