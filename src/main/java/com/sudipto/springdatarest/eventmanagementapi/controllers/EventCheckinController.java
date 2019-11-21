package com.sudipto.springdatarest.eventmanagementapi.controllers;


import com.sudipto.springdatarest.eventmanagementapi.controllers.exceptions.NotCheckedInException;
import com.sudipto.springdatarest.eventmanagementapi.entities.Participant;
import com.sudipto.springdatarest.eventmanagementapi.repositories.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventCheckinController {
  
   @Autowired
   ParticipantRepository _participantRepository;

   public ResponseEntity<PersistentEntityResource> CheckIn(@PathVariable final long Id, PersistentEntityResourceAssembler assembler) {
   Participant participant =  _participantRepository.findById(Id).orElseThrow(ResourceNotFoundException::new);
     if(participant.getCheckedIn())
     {
        throw new NotCheckedInException();
     }
     participant.setCheckedIn(true);
     _participantRepository.save(participant);
     return ResponseEntity.ok(assembler.toFullResource(participant));
    }


}