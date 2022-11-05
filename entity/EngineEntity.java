package com.oasys.car.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="engine")
public class EngineEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int engineid;
	private String engineBrand;
	private String engineModel;
	private int enginecc;
	private int noOfPistons;
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "engine")
	List<CarEntity> cars=new ArrayList<>();
	
	
	
	public int getEngineid() {
		return engineid;
	}
	public void setEngineid(int engineid) {
		this.engineid = engineid;
	}
	public String getEngineBrand() {
		return engineBrand;
	}
	public void setEngineBrand(String engineBrand) {
		this.engineBrand = engineBrand;
	}
	public String getEngineModel() {
		return engineModel;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	public int getEnginecc() {
		return enginecc;
	}
	public void setEnginecc(int enginecc) {
		this.enginecc = enginecc;
	}
	public int getNoOfPistons() {
		return noOfPistons;
	}
	public void setNoOfPistons(int noOfPistons) {
		this.noOfPistons = noOfPistons;
	}

}
