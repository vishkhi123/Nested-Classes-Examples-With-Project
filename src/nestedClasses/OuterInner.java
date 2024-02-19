package nestedClasses;

public class OuterInner {
	
	public OuterInner() {
		System.out.println("Inside Outer Class Constructor");
	}
	public OuterInner(String something)
	{
		System.out.println("Inside Parameterized Constructor!!!"+ something);
	}
	private int number=20;
	private String name="Vishal Khiratkar";
	
	class Inner{
		public Inner() {
			System.out.println("Inside Inner Class Constructor");
		}
		public void display()
		{
			System.out.println("Accessing outer class Menber"+number + name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterInner out=new OuterInner();
		OuterInner out1=new OuterInner("Thats Right!!!");
		
		//Outer +Inner Class
	//	Inner inner=new Inner();  //not allowed
	//	Outer.Inner obj=out.new Inner();//allowed
		OuterInner.Inner obj=new OuterInner().new Inner();
		obj.display();
	}

}
