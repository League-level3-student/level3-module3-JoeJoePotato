package _01_AnimalFarm;

public class cat extends Animal{
	cat(String name, int weight, int intelligence, String noise) {
		super(name,"cat", weight, intelligence, noise);
		// TODO Auto-generated constructor stub
	}
public void schemeing(int weight, int intelligence) {
	System.out.println("this cat is a crafty schemer, who always seems to profit");
if(intelligence<24) {
	System.out.println("this cat is a background figure of little importance");
}else {
	System.out.println("this cat is merely witing for Napolean to drop his guard, and the moment that happens...");
}
}
@Override
public void makeNoise(String name, String noise) {
	// TODO Auto-generated method stub
	System.out.println(name+": Long live comrade Napolean!...uh...Long live Animalism! (as long as they're important, that is) "+noise+"!");
}


}
