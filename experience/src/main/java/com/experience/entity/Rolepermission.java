package com.experience.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="rolepermission" ,catalog="experience_america")
public class Rolepermission  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private UserPermission permission;
	private Role role;

	public Rolepermission() {
	}

	public Rolepermission(UserPermission permission, Role role) {
		this.permission = permission;
		this.role = role;
	}

	@Id @GeneratedValue(strategy=IDENTITY)


	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="permissionid")
	public UserPermission getPermission() {
		return this.permission;
	}

	public void setPermission(UserPermission permission) {
		this.permission = permission;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="roleid")
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}


