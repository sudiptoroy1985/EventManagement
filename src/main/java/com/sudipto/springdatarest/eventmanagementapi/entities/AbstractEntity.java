package com.sudipto.springdatarest.eventmanagementapi.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hibernate.annotations.CreationTimestamp;



@MappedSuperclass
@JsonPropertyOrder({"resourceId"})
public class AbstractEntity {

	@Id
	@Column(nullable = false, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@CreationTimestamp
	@Column(updatable = false)
	protected Instant created;


	public Long getResourceId() {
		return this.id;
	}

	

}
