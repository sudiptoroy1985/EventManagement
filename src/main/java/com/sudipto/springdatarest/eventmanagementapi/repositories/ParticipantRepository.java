package com.sudipto.springdatarest.eventmanagementapi.repositories;


import com.sudipto.springdatarest.eventmanagementapi.entities.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {

}