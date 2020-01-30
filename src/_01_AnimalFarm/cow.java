package _01_AnimalFarm;

public class cow extends Animal{

	cow(String name, int weight, int intelligence, String noise) {
		super(name,"cow", weight, intelligence, noise);
		// TODO Auto-generated constructor stub
	}
public void milk(int weight, int intelligence) {
	System.out.println((3*weight-intelligence)+" pints of milk were milked from this cow");
if(intelligence>10) {
	System.out.println("this cow saw through the pig's ruse, and was eventually killed by Napolean's dogs");
}else {
	System.out.println("the pigs secretly stole this cow's milk");
}
}
@Override
public void makeNoise(String name, String noise) {
	// TODO Auto-generated method stub
	System.out.println(name+": "+noise+" animalism shall live forever "+noise);
}
}
