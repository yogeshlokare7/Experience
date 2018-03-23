package com.experience.dto;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import com.experience.entity.User;

 
public class UserDto {
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
	private MultipartFile images;
    private String userrole;
    private Short tempactive;
    private String username;
    private String streetno;
    private String streetname;
    private String city;
    private String postalcode;
    private String province;
    private String country;
    private String gender;

	public UserDto() {
	}

	public UserDto(Integer id, String firstname, String lastname, String useremail, Integer userage, String userpwd,
			Byte userenabled, String confirmationtoken, String resettoken, Date createdon, Date lastlogin,
			String contactno, String picture, MultipartFile images, String userrole, Short tempactive, String username,
			String streetno, String streetname, String city, String postalcode, String province, String country,
			String gender) {
		this.id = id;
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
		this.contactno = contactno;
		this.picture = picture;
		this.images = images;
		this.userrole = userrole;
		this.tempactive = tempactive;
		this.username = username;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.postalcode = postalcode;
		this.province = province;
		this.country = country;
		this.gender = gender;
	}

	public UserDto(User user) {
		setFirstname(user.getFirstname());
		setLastname(user.getLastname());
		setUseremail(user.getUseremail());
		setUserage(user.getUserage());
		setUserpwd(user.getUserpwd());
		setUserenabled(user.getUserenabled());
		setConfirmationtoken(user.getConfirmationtoken());
		setResettoken(user.getResettoken());
		setCreatedon(user.getCreatedon());
		setLastlogin(user.getLastlogin());
		setContactno(user.getContactno());
		setPicture(user.getPicture());
		//setAssignroles(user.getAssignroles());
	}
	
	
	public User getEntityFromDTO(User user) {
		user.setFirstname(getFirstname());
		user.setLastname(getLastname());
		user.setUseremail(getUseremail());
		user.setUserage(getUserage());
		user.setUserenabled(getUserenabled());
		user.setContactno(getContactno());
		if(getPicture()!=null && getPicture()!="") {
			user.setPicture(getPicture());
		}
		if(getUserpwd()!=null && getUserpwd()!="") {
			user.setUserpwd(getUserpwd());
		}
		user.setUsername(getUsername());
		user.setStreetno(getStreetno());
		user.setStreetname(getStreetname());
		user.setCity(getCity());
		user.setPostalcode(getPostalcode());
		user.setCountry(getCountry());
		user.setProvince(getProvince());
		user.setGender(getGender());
		return user;
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getUseremail() {
		return this.useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public Integer getUserage() {
		return this.userage;
	}

	public void setUserage(Integer userage) {
		this.userage = userage;
	}


	public String getUserpwd() {
		return this.userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}


	public Byte getUserenabled() {
		return this.userenabled;
	}

	public void setUserenabled(Byte userenabled) {
		this.userenabled = userenabled;
	}


	public String getConfirmationtoken() {
		return this.confirmationtoken;
	}

	public void setConfirmationtoken(String confirmationtoken) {
		this.confirmationtoken = confirmationtoken;
	}


	public String getResettoken() {
		return this.resettoken;
	}

	public void setResettoken(String resettoken) {
		this.resettoken = resettoken;
	}

	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public Date getLastlogin() {
		return this.lastlogin;
	}

	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public MultipartFile getImages() {
		return images;
	}

	public void setImages(MultipartFile images) {
		this.images = images;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public Short getTempactive() {
		return tempactive;
	}

	public void setTempactive(Short tempactive) {
		this.tempactive = tempactive;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStreetno() {
		return streetno;
	}

	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", useremail=" + useremail
				+ ", userage=" + userage + ", userpwd=" + userpwd + ", userenabled=" + userenabled
				+ ", confirmationtoken=" + confirmationtoken + ", resettoken=" + resettoken + ", createdon=" + createdon
				+ ", lastlogin=" + lastlogin + ", contactno=" + contactno + ", picture=" + picture + ", images="
				+ images + ", userrole=" + userrole + ", tempactive=" + tempactive + ", username=" + username
				+ ", streetno=" + streetno + ", streetname=" + streetname + ", city=" + city + ", postalcode="
				+ postalcode + ", province=" + province + ", country=" + country + ", gender=" + gender + "]";
	}
}


