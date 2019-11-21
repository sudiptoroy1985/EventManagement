package com.sudipto.springdatarest.eventmanagementapi.entities.projections;

import java.time.ZonedDateTime;
import com.sudipto.springdatarest.eventmanagementapi.entities.Event;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="partial", types = Event.class)
public interface EventProjection {
    String getName();
    ZonedDateTime getStartTime();
}