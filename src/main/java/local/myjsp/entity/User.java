package local.myjsp.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity	//@Entity表示被持久化
@Table(name="t_user")	//若想数据库中建立的表的名字和类名一致，则无需@Table的name注释
public class User implements Serializable{
	/** System Generated Serialized Version ID */
	private static final long serialVersionUID = 2653106719866483072L;

	@Id
	@GeneratedValue(generator="nativeGenerator") 				//或者这里直接写@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@GenericGenerator(name="nativeGenerator",strategy="native") //然后这里的@GenericGenerator去掉 
	@Column(name="uid")		//与@Table注解同理，若想生成的名字和这个字段名一致，则无需写@Column name=“”注释
	private Integer id;

	@Basic					//@Basic表示该字段被持久化到Hibernate和数据库，不写这个注解时 系统会自动加上
	@Column(name="uusername")
	private String username;
	
	@Basic
	@Column(name="upassword")
	private String password; 
	
	@Basic
	@Column(name="uage")
	private Integer age;
		
	@Transient				//@Transient表示不被持久化到HIbernate和数据库，仅仅在Hibernate容器外的内存中存在
	private String token;
	
	public User() {} 
	public User(String username, String password, int age) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
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
		if (age != other.age)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	public int getAge() {
		return age;
	}
	
	public String getPassword() {
		return password;
	}

	public String getToken() {
		return token;
	}
	
	public String getUsername() {
		return username;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() { 
		return "class: " + getClass().getName() + ", username : " + username + ", password : "+password + ", age : " + age;
	}
  
}
