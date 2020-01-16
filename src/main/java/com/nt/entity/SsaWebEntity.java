package com.nt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "SSA_WEB")
public class SsaWebEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SSAWEB_SEQ")
	@SequenceGenerator(name="SSAWEB_SEQ", sequenceName="SSAWEB_SEQ", allocationSize=1)
	@Column(name = "SSAID")
	private int ssaid;
	@Column(name = "FNAME")
	private String fname;
	@Column(name = "LNAME")
	private String lname;
	@Column(name = "DOB")
	private Date dob;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "STATE")
	private String state;
}
