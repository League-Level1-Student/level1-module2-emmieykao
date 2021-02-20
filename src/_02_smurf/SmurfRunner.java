package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handysmurf=new Smurf("Handy Smurf");
	System.out.println(handysmurf.getName());
	handysmurf.eat();
	
	Smurf papasmurf=new Smurf("Papa Smurf");
	System.out.println(papasmurf.getName());
	System.out.println(papasmurf.getHatColor());
	System.out.println(papasmurf.isGirlOrBoy());
	
	Smurf smurfette=new Smurf("Smurfette");
	System.out.println(smurfette.getName());
	System.out.println(smurfette.getHatColor());
	System.out.println(smurfette.isGirlOrBoy());
}
}
