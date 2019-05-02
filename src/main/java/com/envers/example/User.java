package com.envers.example;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

/**
 * The persistent class for the account database table.
 * 
 */
@Entity
@Table(name = "user")
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@NamedQuery(name = "User.findAll", query = "SELECT a FROM User a")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_address")
	// this flag is used to check whether this column value was updated or not
	// need to add a new column for this flag
	@Audited(withModifiedFlag = true)
	private String userAddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

}