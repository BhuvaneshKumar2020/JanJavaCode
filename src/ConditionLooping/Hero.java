package ConditionLooping;

public class Hero {
String myHero="Vijay";
public void myHeroName() {
	if (myHero.equals("Ajith")) {
		System.out.println("You think about Ajith");
		
	}else
		if(myHero.equals("SuperStar")) {
			System.out.println("You think abou Super Star");
		}else {
			System.out.println("Sorry I dont no your hero name");
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hero B = new Hero();
B.myHeroName();
	}

}
