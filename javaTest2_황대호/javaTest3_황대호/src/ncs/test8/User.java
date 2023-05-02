package ncs.test8;

import java.util.Objects;

public class User implements Cloneable {

	private String id;
	private String password;
	
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " "+ password + " "+name+ " "+age+ " "+gender+ " "+phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, name, password, phone);
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
		return age == other.age && gender == other.gender && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone);
	}

	@Override
	public  User clone()  {
		 Object obj = null;
	        try {
	            obj = super.clone();
	        } catch (CloneNotSupportedException e) {
	        }
	        return (User)obj;
	    }
	
//	
//	@Override
//	public String toString() {
//		return  " "+id + " "+ name+ " "+age+ " "+gender+ " "+phone;
//	}

	
	
	
}
