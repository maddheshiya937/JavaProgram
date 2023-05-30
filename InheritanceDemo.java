package praticePackage;


abstract class Flower{
	 abstract void flowerName();
}

class Lotus extends Flower{
	void flowerName() {
		System.out.println("this is lotus:");
	}
}


class Sunflower extends Flower{
	void flowerName() {
		System.out.println("this is Sunflower:");
	}
}



public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower lotus = new Lotus();
		Flower sunflower = new Sunflower();
		lotus.flowerName();
		sunflower.flowerName();

	}

}
