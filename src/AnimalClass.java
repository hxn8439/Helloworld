
public class AnimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Animal 
{
	protected String name;
	
	abstract String getName();

}

class FlyingAnimal extends Animal{
	protected String name = "FlyingAnimal";

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class LandAnimal extends Animal{
	protected String name = "LandAnimal";

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class WaterAnimal extends Animal{
	protected String name = "WaterAnimal";

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}

class Chicken extends FlyingAnimal implements Walks, EggLaying, Herbivore, Carnivore
{
	private String name = "Chicken";
	private String sound = "BawkakBawk";
	private int size = 4;
	
	public String getName() {
		return name;
	}
	
	public String getSound() {
		return sound;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String carn() {
		// TODO Auto-generated method stub
		return "This animal is a carnivore eater";
	}

	@Override
	public String herb() {
		// TODO Auto-generated method stub
		return "This animal is a herbivore eater";
	}

	@Override
	public String LaysEgg() {
		// TODO Auto-generated method stub
		return "This animal lay eggs";
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "This animal walks around";
	}
	
}

class Hawk extends FlyingAnimal implements Walks, Flys, Herbivore, Carnivore, EggLaying{
	private String name = "Hawk";
	private String sound = "CaCawww!!!";
	private int size = 9;
	
	public String getName() {
		return name;
	}
	
	public String getSound() {
		return sound;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public String LaysEgg() {
		// TODO Auto-generated method stub
		return "This animal lay eggs";
	}

	@Override
	public String carn() {
		// TODO Auto-generated method stub
		return "This animal is a carnivore eater";
	}

	@Override
	public String herb() {
		// TODO Auto-generated method stub
		return "This animal is a herbivore eater";
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "This animal walks around";
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "This animal Flys around";
	}
	
}

class Ocelot extends LandAnimal implements Walks, Jumps, Carnivore{
	private String name = "Ocelot";
	private String sound = "Grrrrrrrrrr";
	private int size = 7;
	
	public String getName() {
		return name;
	}
	
	public String getSound() {
		return sound;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public String carn() {
		// TODO Auto-generated method stub
		return "This animal is a carnivore eater";
	}

	@Override
	public String jump() {
		// TODO Auto-generated method stub
		return "This animal can Jump around";
	}

	@Override
	public String walk() {
		// TODO Auto-generated method stub
		return "This animal walks around";
	}
	
}

class KillerWhale extends WaterAnimal implements Swims, Jumps, Carnivore{
	
	private String name = "Killer Whale";
	private String sound = "wheeeewwww";
	private int size = 14;
	
	public String getName() {
		return name;
	}
	
	public String getSound() {
		return sound;
	}
	
	public int getSize() {
		return size;
	}
	
	@Override
	public String carn() {
		// TODO Auto-generated method stub
		return "This animal is a carnivore eater";
	}

	@Override
	public String jump() {
		// TODO Auto-generated method stub
		return "This animal can Jump around";
	}

	@Override
	public String swim() {
		// TODO Auto-generated method stub
		return "This animal can swim around";
	}
	
}

interface Walks{
	String walk();
}

interface Jumps{
	String jump();
}

interface Swims{
	String swim();
}

interface Flys{
	String fly();
}

interface Herbivore{
	String herb();
}

interface Carnivore{
	String carn();
}

interface EggLaying{
	String LaysEgg();
}