package _01_AnimalFarm;

public class pig extends Animal{
	pig(String name, int weight, int intelligence, String noise) {
		super(name,"pig", weight, intelligence, noise);
		// TODO Auto-generated constructor stub
	}
public void rank(int weight, int intelligence) {
	System.out.println("This pig knows a full "+intelligence+" letters of the alphabet");
if(intelligence<20) {
	System.out.println("this pig is low ranking, and is one of Napoleon's many yes-men");
}else {
	System.out.println("This pig wants to overthrow Napolean, but keeps these wishes secret");
}
}
@Override
public void makeNoise(String name, String noise) {
	// TODO Auto-generated method stub
	System.out.println(name+": as Napolean taught us, my comrades, animalism shall never fail! "+noise+"!");
}


}
