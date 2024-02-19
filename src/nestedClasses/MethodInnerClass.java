package nestedClasses;

public class MethodInnerClass {
	
	//Method
	public void display()
	{ 
		int number=10;
		
		//class inside method
		class Inside {
			public void show()
			{
				System.out.println("Display The given Number"+number);
			}
		}
		Inside inside=new Inside();
		inside.show();
		
	}
	
	public static void main(String[] args) {
		MethodInnerClass m=new MethodInnerClass();
		m.display();
	}

}
