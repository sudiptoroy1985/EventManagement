package com.sudipto.springdatarest.eventmanagementapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="VENUE")
public class Venue extends AbstractEntity {

	private String name;
	@Column(name = "STREET_ADDRESS")
	private String streetAddress;
    @Column(name = "STREET_ADDRESS2")
	private String streetAddress2;
	private String city;
	private String state;
	private String country;
	@Column(name = "POSTAL_CODE")
	private String postalCode;
}
