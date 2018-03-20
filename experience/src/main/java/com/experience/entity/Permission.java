package com.experience.entity;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="permission",catalog="experience_america")
public class Permission  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String description;
	private Set<Rolepermission> rolepermissions = new HashSet<Rolepermission>(0);

	public Permission() {
	}

	

	public Permission(Integer id, String name, String description, Set<Rolepermission> rolepermissions) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.rolepermissions = rolepermissions;
	}



	@Id @GeneratedValue(strategy=IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@Column(name="name", length=50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Column(name="description", length=70)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="permission")
	public Set<Rolepermission> getRolepermissions() {
		return this.rolepermissions;
	}

	public void setRolepermissions(Set<Rolepermission> rolepermissions) {
		this.rolepermissions = rolepermissions;
	}

}


