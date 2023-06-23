package Constructor;
// / Create a class called Phone with a constructor and a 3 method ram rom and processor and in another main class call all. of them.
// steps = firt the variable is decleared , and the int x take the value from object and pass to instance variable and instance variable is print in method. 

public class Phone {
	int ram;
	int rom;
	String processor;
	
	Phone(int x , int y, String z )
	{
	ram = x;
	rom = y;
	processor = z;
	}
	
	void ram()
	{
		System.out.println(ram);
	}
	
	void rom() 
	{
		System.out.println(rom);
	}
   void processor()
   {
	   System.out.println(processor);
   }
}

//Create a Car class with 4 attributes Color, Price, Wheels, Airbags. 
// Create a Constructor of 3 paramters and demonstrate the use of this keyword
