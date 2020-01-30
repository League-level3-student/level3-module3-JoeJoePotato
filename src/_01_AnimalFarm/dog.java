package _01_AnimalFarm;

public class dog extends Animal{
	dog(String name, int weight, int intelligence, String noise) {
		super(name,"dog", weight, intelligence, noise);
		// TODO Auto-generated constructor stub
	}
public void strength(int weight, int intelligence) {
	System.out.println("like many, this is one of Napolean's secret police");
if(weight<20) {
	System.out.println("this dog is a runt, shunned by its peers");
}else {
	System.out.println("This dog, which knows "+intelligence+" letters of the alphabet, is an elite guard");
}
}
@Override
public void makeNoise(String name, String noise) {
	// TODO Auto-generated method stub
	System.out.println(name+": "+noise+"! Obey comrade Napolean! "+noise+"!");
}


}
