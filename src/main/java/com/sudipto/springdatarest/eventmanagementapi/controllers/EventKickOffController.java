package com.sudipto.springdatarest.eventmanagementapi.controllers;
import com.sudipto.springdatarest.eventmanagementapi.entities.Event;
import com.sudipto.springdatarest.eventmanagementapi.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RepositoryRestController
@RequestMapping("/events")
public class EventKickOffController {

    @Autowired
    private EventRepository _eventRepository;

    @PostMapping("/start/{Id}")
    public ResponseEntity<String> start(@PathVariable Long Id) {
        Event event = _eventRepository.findById(Id).orElseThrow(ResourceNotFoundException::new);
        event.setStarted(true);
        _eventRepository.save(event);
        return ResponseEntity.ok(String.format("event %s has started", event.getName()));
    }
}