
public class StudentClass {

	public StudentClass(String name, Integer age, char gender, String module) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.module = module;
	}
	
	private String name;
	private Integer age;
	private char gender;
	private String module;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
}
