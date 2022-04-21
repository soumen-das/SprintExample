package eric.com.example;

import java.util.Date;

public class Student {
	private String id;
	private String name;
	private long mobile;
	private Date doj;
	private Address addr;
	
	public Student() {
	}

	public Student(String id, String name, int mobile, Date doj, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.doj = doj;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", doj=" + doj + ", addr=" + addr + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
}
