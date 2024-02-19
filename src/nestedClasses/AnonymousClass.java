package nestedClasses;


interface Greeting{
	void greet();
}

public class AnonymousClass {
	
	public void displayGreeting()
	{
		Greeting anonmousGreeting=new Greeting() {
			
			@Override
			public void greet() {
				System.out.println("Hello There this is Anonymous Inner Class Example");
				
			}
		};
		anonmousGreeting.greet();
	}
	
	
	
	

	public static void main(String[] args) {
		
		AnonymousClass an=new AnonymousClass();
		an.displayGreeting();
	}

}
