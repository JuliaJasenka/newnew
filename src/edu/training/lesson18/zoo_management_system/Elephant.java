package edu.training.lesson18.zoo_management_system;

public class Elephant {
	private String name;
	private int age;
	private int energy;
	
	public Elephant (String name,int age) {
		this.name = name;
		this.age = age;
		this.energy = 100;
	}

	public void makeSound() {
		energy -= 40;
	}
	
	public void eat() {
		energy += 25;
	}
	public void eat(int extraEnergy) {
		energy += extraEnergy;
	}
	
	public void printEnergy() {
		System.out.println("Elephant energy: " + energy);
	}

	
	
	@Override
	public String toString() {
		return "Elephant [name=" + name + ", age=" + age + ", energy=" + energy + "]";
	}

	
}
