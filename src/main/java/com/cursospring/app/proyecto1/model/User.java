package com.cursospring.app.proyecto1.model;
/**
 * Clase User para la obtención de los datos del usuario
 * @author Luis Parra
 *
 */
public class User {
	
	private String passion;

	private Integer salary;
	
	private Integer age;
	
	private String creditCard;
	
	public User(String passion, Integer salary, Integer age, String creditCard) {
		this.passion = passion;
		this.salary = salary;
		this.age = age;
		this.creditCard = creditCard;
	}
	
	public User() {

	}
	
	public String getPassion() {
		return passion;
	}
	public void setPassion(String passion) {
		this.passion = passion;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String toString() {
		return "User [passion=" + passion + ", salary=" + salary + ", age=" + age + ", creditCard=" + creditCard + "]";
	}
	
	
	
	
}
