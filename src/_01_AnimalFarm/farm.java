package _01_AnimalFarm;

import java.util.ArrayList;

public class farm {
public static void main(String[] args) {
	

	// TODO Auto-generated method stub
ArrayList<Animal> farm=new ArrayList<Animal>();
cat thecat=new cat("the cat", 15, 25, "meow");
farm.add(thecat);
pig p=new pig("Unnamed pig", 35, 18, "oink");
farm.add(p);
pig pone=new pig("Second-in-command", 45, 26, "hrmmmmmmm");
farm.add(pone);
cow cow=new cow("random cow", 500, 4, "MOOOOOOO");
dog d=new dog("Guard dog", 52, 10, "GRRRRRrrrrRRRRRRrrrrr");
dog boxer=new dog("Boxer the Horse", 60, 4, "napolean is aways right");
farm.add(cow);
farm.add(d);
farm.add(boxer);

for (int i = 0; i < 6; i++) {
	Animal a=farm.get(i);
	a.overthrowFarmer(a.name, a.noise, a.intelligence, a.weight);
a.makeNoise(a.name, a.noise);
}
}
}
