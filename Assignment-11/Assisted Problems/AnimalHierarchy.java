class Animal{
    String name;
    int age;
	public Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void makeSound(){
		System.out.println("Sounds of Animals");
	}
}
class Dog extends Animal{
	public Dog(String name,int age){
		super(name,age);
	}
	@Override
	public void makeSound(){
		System.out.println(name+" --> Woof Woof");
	}
}
class Cat extends Animal{
	public Cat(String name,int age){
		super(name,age);
	}
	@Override
	public void makeSound(){
		System.out.println(name+" --> Meow Meow");
	}
}
class Bird extends Animal{
	public Bird(String name,int age){
		super(name,age);
	}
	@Override
	public void makeSound(){
		System.out.println(name+" --> Tweet Tweet");
	}
}
public class AnimalHierarchy{
	public static void main(String[] args){
		Animal dog=new Dog("Moti",3);
		Animal cat=new Cat("bheeru",2);
		Animal bird=new Bird("baby",1);
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}