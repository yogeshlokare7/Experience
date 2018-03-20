package com.experience.entity;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user")
public class User  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String firstname;
	private String lastname;
	private String useremail;
	private Integer userage;
	private String userpwd;
	private Byte userenabled;
	private String confirmationtoken;
	private String resettoken;
	private Date createdon;
	private Date lastlogin;
    private String contactno;
	private String picture;
    private byte[] image;
	private Set<Assignrole> assignroles = new HashSet<Assignrole>(0);
	

	public User() {
	}

	public User(String firstname, String lastname, String useremail, Integer userage, String userpwd, Byte userenabled, String confirmationtoken, String resettoken, Date createdon, Date lastlogin, Set<Assignrole> assignroles) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.useremail = useremail;
		this.userage = userage;
		this.userpwd = userpwd;
		this.userenabled = userenabled;
		this.confirmationtoken = confirmationtoken;
		this.resettoken = resettoken;
		this.createdon = createdon;
		this.lastlogin = lastlogin;
		this.assignroles = assignroles;
	}

	@Id @GeneratedValue(strategy=IDENTITY)


	@Column(name="id", unique=true, nullable=false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	@Column(name="firstname", length=50)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	@Column(name="lastname", length=50)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Column(name="useremail", length=50)
	public String getUseremail() {
		return this.useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	@Column(name="userage")
	public Integer getUserage() {
		return this.userage;
	}

	public void setUserage(Integer userage) {
		this.userage = userage;
	}


	@Column(name="userpwd", length=50)
	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}


	@Column(name="userenabled")
	public Byte getUserenabled() {
		return this.userenabled;
	}

	public void setUserenabled(Byte userenabled) {
		this.userenabled = userenabled;
	}


	@Column(name="confirmationtoken", length=45)
	public String getConfirmationtoken() {
		return this.confirmationtoken;
	}

	public void setConfirmationtoken(String confirmationtoken) {
		this.confirmationtoken = confirmationtoken;
	}


	@Column(name="resettoken", length=45)
	public String getResettoken() {
		return this.resettoken;
	}

	public void setResettoken(String resettoken) {
		this.resettoken = resettoken;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="createdon", length=19)
	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="lastlogin", length=19)
	public Date getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="user")
	public Set<Assignrole> getAssignroles() {
		return this.assignroles;
	}

	public void setAssignroles(Set<Assignrole> assignroles) {
		this.assignroles = assignroles;
	}

	@Column(name = "contactno")
	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	@Lob
	@Column(name = "image")
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

    @Column(name="picture")
	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", useremail=" + useremail
				+ ", userage=" + userage + ", userpwd=" + userpwd + ", userenabled=" + userenabled
				+ ", confirmationtoken=" + confirmationtoken + ", resettoken=" + resettoken + ", createdon=" + createdon
				+ ", lastlogin=" + lastlogin + ", contactno=" + contactno + ", picture=" + picture + ", image="
				+ Arrays.toString(image) + ", assignroles=" + assignroles + "]";
	}


}


