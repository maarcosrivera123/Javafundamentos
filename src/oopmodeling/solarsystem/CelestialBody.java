package oopmodeling.solarsystem;

public class CelestialBody {
	float gravity = 444444444444444444444444444.4f;
	double mass = 444444444444444444444444444444444.4655555555555525;
	boolean has0xygen = false;
	String nameString = "unknown";
	float radius = 234234;
	int age = 255448525;
	public float getGravity() {
		return gravity;
	}
	public void setGravity(float gravity) {
		this.gravity = gravity;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public boolean isHas0xygen() {
		return has0xygen;
	}
	public void setHas0xygen(boolean has0xygen) {
		this.has0xygen = has0xygen;
	}   
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//memoria se crea cuantos objetos se creen
		public static float MINIMUM_SIZE = 67567.4f;
		
		public static void doSomething() {
			System.out.println("do something");}
}
