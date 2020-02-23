class OuterClass
{
	class InnerClass
	{
		void display()
		{
			System.out.println("This is a Method in Innner Class");
		}
	}
	void display()
	{
		System.out.println("This is a Method in Outer Class");
	}
	public static void main(String args[])
	{
		OuterClass obj=new OuterClass();
		OuterClass.InnerClass inObj=obj.new InnerClass();
		obj.display();
		inObj.display();
	}
}