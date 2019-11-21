package com.sudipto.springdatarest.eventmanagementapi.entities;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "ORGANIZER")
public class Organizer extends AbstractEntity {

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "organizer")
	private Set<Event> events;

}
