package com.dx.ssh.entities;

public class Member {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
package com.dx.ssh.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity //@Entity表示被持久化
@Table
public class Member {
	
	@Id
	@GeneratedValue(generator="nativeGenerator") 	
	@GenericGenerator(name="nativeGenerator",strategy="native") 
    private Integer id;
	
	@Basic //@Basic表示该字段被持久化到Hibernate和数据库，不写这个注解时 系统会自动加上
	@Column(name="name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
*/