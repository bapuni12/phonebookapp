package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "STATE_MASTER")
@Data
public class StateEntity {
	@Id
	@Column(name = "STATE_ID")
	private int stateid;
	@Column(name = "STATE_CODE")
	private String statecode;
	@Column(name = "STATE_NAME")
	private String statename;
	

}
