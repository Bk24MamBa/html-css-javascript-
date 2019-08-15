package Model;

public class login {
	private String name;
	private String pwd;
	private int age;
	private String cla;
	public login() {
		
	}
	public login(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	public login(String name, String pwd, int age, String cla) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.cla = cla;
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
	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
}
