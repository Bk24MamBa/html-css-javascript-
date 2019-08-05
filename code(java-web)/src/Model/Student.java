package Model;

public class Student {
	private String name;
	private String pwd;
	private int age;
	private String address;
	public Student() {

	}
	public Student(String pwd, int age, String address) {
		this.pwd = pwd;
		this.age = age;
		this.address = address;
	}
	public Student(String name, String pwd, int age, String address) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
