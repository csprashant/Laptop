package com.nt.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="phonenumber" , uniqueConstraints = @UniqueConstraint(columnNames = "phone_number"))
@Setter
@Getter
@NoArgsConstructor
public class PhoneNumber {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="phone_number")
	private String phoneNumber;
	private String provider;
	private String numberType;
	@Column(name = "created", columnDefinition = "timestamp default current_timestamp")
	private Timestamp created;
	@Temporal(TemporalType.DATE)
	private Date updated;
}
