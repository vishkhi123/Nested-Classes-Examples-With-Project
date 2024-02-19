package nestedClasses;

public class StaticInner {
	
	public static int number=10;
	
	static class Inner{
		
		public void display()
		{
			System.out.println("Exapmle of Static Inner Class :"+number);
		}
		
	}

	public static void main(String[] args) {
		
		StaticInner.Inner obj=new StaticInner.Inner();
		obj.display();
	}

}
