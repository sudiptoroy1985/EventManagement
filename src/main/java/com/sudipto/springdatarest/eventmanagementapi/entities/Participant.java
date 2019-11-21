package com.sudipto.springdatarest.eventmanagementapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Table(name="PARTICIPANT")
public class Participant extends AbstractEntity {

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String email;

	@Column(name = "CHECKED_IN")
	private Boolean checkedIn;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
	private Event event;

}
