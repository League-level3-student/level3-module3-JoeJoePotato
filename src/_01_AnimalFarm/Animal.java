package _01_AnimalFarm;

public abstract class Animal {
String species;
int weight;
int intelligence;
String name;
String noise;
	Animal(String name, String species, int weight, int intelligence, String noise){
		this.species=species;
		this.weight=weight;
		this.intelligence=intelligence;
		this.name=name;
		this.noise=noise;
	}

public abstract void makeNoise(String name, String noise);
public void overthrowFarmer(String name, String noise, int intelligence, int weight) {
System.out.println("Napoleon: Comrades, the villanous farmer must go!");
System.out.println("Snowball: Animalism shall triumph!");
System.out.println(name+": Though I only know "+intelligence+" letters pf the alphabet, I agree!");
if(weight>50) {
	System.out.println(name+" attacked the farmer, dealing vicious blows");
}else {
System.out.println(name+" annoyed the farmer by yelling out their "+noise);	
}
}
}
