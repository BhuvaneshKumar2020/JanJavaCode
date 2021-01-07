package org.Polymorphism;

public class Overloading {
	
		
	
int add(int a1,int a2)
{
	return a1+a2;
}
int add( int a1,int a2,int a3)
{
	return a1+a2+a3;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading sum = new Overloading();
		
System.out.println(sum.add(20, 30));
System.out.println(sum.add(25, 02, 32));
	}

}
