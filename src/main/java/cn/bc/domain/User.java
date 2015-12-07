package cn.bc.domain;

import javax.persistence.*;

/**
 * Created by bcsoft on 2015/12/2.
 */
@Entity
@Table(name="USERINFO")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="CODE")
	private String code;
	@Column(name="NAME")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
