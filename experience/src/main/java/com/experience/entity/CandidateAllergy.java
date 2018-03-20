package com.experience.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "candidate_allergy")
public class CandidateAllergy {

	@Column(name = "candidate_allergy_id")
	Integer candidateAllergyId;

	@Column(name = "allergy_name")
	String allergyName;

	@Column(name = "allergy_description")
	String allergyDescription;

	public Integer getCandidateAllergyId() {
		return candidateAllergyId;
	}

	public void setCandidateAllergyId(Integer candidateAllergyId) {
		this.candidateAllergyId = candidateAllergyId;
	}

	public String getAllergyName() {
		return allergyName;
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}

	public String getAllergyDescription() {
		return allergyDescription;
	}

	public void setAllergyDescription(String allergyDescription) {
		this.allergyDescription = allergyDescription;
	}

}
