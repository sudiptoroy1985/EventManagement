package com.sudipto.springdatarest.eventmanagementapi.repositories;


import com.sudipto.springdatarest.eventmanagementapi.entities.Venue;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {

}