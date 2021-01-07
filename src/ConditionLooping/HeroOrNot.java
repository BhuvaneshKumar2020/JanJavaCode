package ConditionLooping;

public class HeroOrNot {
String hero = "SuperStar";

public void yesOrNo() {
switch (hero) {
case "Ajith":
System.out.println("Ajith is the real hero");
case "SuperStar":
System.out.println("SuperStar is the real hero");
case "Vijay":
System.out.println("Vijay is the real hero");
	
default:
	System.out.println("I dont no the person:"+hero);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HeroOrNot C= new HeroOrNot();
	C.yesOrNo();
	
	}

}
