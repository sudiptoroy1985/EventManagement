package com.sudipto.springdatarest.eventmanagementapi.repositories;

import com.sudipto.springdatarest.eventmanagementapi.entities.Organizer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}