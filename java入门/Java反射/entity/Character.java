package entity;

public class Character {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sleep(){
		System.out.println("少女休息中....");
	}
	public void eat(){
		System.out.println("少女吃饭中....");
	}
	public int attack(int k){
		System.out.println("少女发起了攻击，造成了"+k+"点伤害");
		return k;
		
	}
}
