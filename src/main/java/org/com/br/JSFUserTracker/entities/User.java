package org.com.br.JSFUserTracker.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	
	//Persistence class responsible for load the information from Users
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;
	@NotEmpty(message = "O nome e Obrigatorio.")
	@NotNull(message = "O nome não pode ser nullo.")
	private String name;
	
	@NotEmpty(message = "O Sobrenome e Obrigatorio.")
	@NotNull(message = "O Sobrenome não pode ser nullo.")
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	private int age;
	private String sex;
	private Boolean active;
	private String passWord;
	private String profile;
	private String level;
	
	private String zipCode;
	private String streetName;
	private String complement;
	private String district;
	private String city;
	private String state;
	private String IBGE;
	private String GIA;
	private String DDD;
	private String SIAFI;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIBGE() {
		return IBGE;
	}
	public void setIBGE(String iBGE) {
		IBGE = iBGE;
	}
	public String getGIA() {
		return GIA;
	}
	public void setGIA(String gIA) {
		GIA = gIA;
	}
	public String getDDD() {
		return DDD;
	}
	public void setDDD(String dDD) {
		DDD = dDD;
	}
	public String getSIAFI() {
		return SIAFI;
	}
	public void setSIAFI(String sIAFI) {
		SIAFI = sIAFI;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return ID == other.ID;
	}
	
	
	
	
	
	

}
