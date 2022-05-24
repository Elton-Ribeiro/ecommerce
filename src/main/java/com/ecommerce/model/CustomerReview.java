package com.ecommerce.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class CustomerReview {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@Column (name = "NUM_REFERENCIA")
	private int referenceNumber;
	@Column (name = "MODELAGEM")
	private String modeling;
	@Column (name = "CINTURA")
	private double waist;
	@Column (name = "COMPRIMENTO")
	private double length;
	@Column (name = "ELASTICIDADE")
	private String elasticity;
	
	public CustomerReview(long id, int referenceNumber, String modeling, double waist, double length,
			String elasticity) {
		super();
		this.id = id;
		this.referenceNumber = referenceNumber;
		this.modeling = modeling;
		this.waist = waist;
		this.length = length;
		this.elasticity = elasticity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(int referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getModeling() {
		return modeling;
	}

	public void setModeling(String modeling) {
		this.modeling = modeling;
	}

	public double getWaist() {
		return waist;
	}

	public void setWaist(double waist) {
		this.waist = waist;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getElasticity() {
		return elasticity;
	}

	public void setElasticity(String elasticity) {
		this.elasticity = elasticity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(elasticity, id, length, modeling, referenceNumber, waist);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerReview other = (CustomerReview) obj;
		return Objects.equals(elasticity, other.elasticity) && id == other.id
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Objects.equals(modeling, other.modeling) && referenceNumber == other.referenceNumber
				&& Double.doubleToLongBits(waist) == Double.doubleToLongBits(other.waist);
	}

	@Override
	public String toString() {
		return "CustomerReview [id=" 
				+ id 
				+ ", referenceNumber=" 
				+ referenceNumber 
				+ ", modeling=" 
				+ modeling
				+ ", waist=" 
				+ waist + ", length=" 
				+ length 
				+ ", elasticity=" 
				+ elasticity 
				+ "]";
	}
	
}