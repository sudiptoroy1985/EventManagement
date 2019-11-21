package com.sudipto.springdatarest.eventmanagementapi.repositories;

import java.time.ZonedDateTime;
import com.sudipto.springdatarest.eventmanagementapi.entities.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
  Page<Event> findByName(@Param("name") String name, Pageable pageable);
  Page<Event> findByStartTimeLessThan(@Param("startTime") @DateTimeFormat(iso = ISO.DATE_TIME) ZonedDateTime startTime, Pageable pageable);
}