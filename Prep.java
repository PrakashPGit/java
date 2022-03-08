class Vehical

{
	static
	{
		
		System.out.println("	");
		System.out.println("		** Welcome TO Car Information Center **	");
	}

	String vehicalNo;		 	 	//non-static Variable
	String Engin;					//non-static Variable
	String color;					//non-static Variable
	private double price;			//non-static Variable

	public double getPrice()		// Getter Method
	{
	return price;
	}

	public void setPrice(double price)		//Setter Method
	{
	this.price=price;
	}
/* 
Vehical()									// NO Formal Argument 
{
	System.out.println(" ");
	System.out.println("		** Welcome TO Car Information Center **	");
}

Vehical(String vehicalNo)
{
	this();
	this.vehicalNo=vehicalNo;
}

Vehical(String vehicalNo,String Engin)
{
	this(vehicalNo);
	this.Engin=Engin;
}
Vehical(String vehicalNo,String Engin,String color)
{
	this(vehicalNo,Engin);
	this.color=color;
	
	System.out.println("constructor calling statment");
	
} */

public void info()
{
	System.out.println("-----------------------------------------");
	System.out.println("Vehical Information");

}


public void Start()
{
	System.out.println("Start  :  Brommmmmmmmmm ");

}

public void Drive()
{
	System.out.println("Drive  :  Driveeeeeeeee");
}

public void Stop()
{
	System.out.println("Stop  :  Stoppppppp");
}
}





class Two extends Vehical
{
	{
		System.out.println("This is a Two Wheeler Category");
	}
	
}

class Bike extends Two
{
	{
		System.out.println("This is a Bike");
	}
}

class Cycle extends Two
{
	{
		System.out.println("This is a Cycle");
	}
}
 
class Bajaj extends Bike
{
	{
		System.out.println("This is a Bajaj Brand");
	}
}
 
class Pulser extends Bajaj
 {
	 {
		System.out.println("This is a Pulasr Model");
	}
 }

class Chetak extends Bajaj
{
	{
		System.out.println("This is a Chetak Model");
	}
}

class RE extends Bike
{
	{
		System.out.println("This is a Royal Enfield Brand");
	}
}

class Himalay extends RE
{
	{
		System.out.println("This is a Himalayn Model");
	}
}

class Bullet extends RE
{
	{
		System.out.println("This is a Bullet classic Model");
	}
}

class TVS extends Bike
{
	{
		System.out.println("This is a TVS Brand");
	}
}

class Jupiter extends TVS
{
	{
		System.out.println("This is a Jupiter Model");
	}
}

class Haveay extends TVS
{
	{
		System.out.println("This is a Haveay Model");
	}
}

class Three extends Vehical
{
	{
		System.out.println("This is a Three Wheeler Category");
	}
}

class AutoRiksha extends Three
{
	{
		System.out.println("This is a AutoRiksha Category");
	}
	
}

class Four extends Vehical
{
	{
		System.out.println("This is a Four Wheeler Category");
	}
}	
	
	

class Petrol extends Four
{
	{
		System.out.println("Fuel Type - Petrol");
	}
	
	
}

class Disel extends Four
{
	{
		System.out.println("Fuel Type - Disel");
	}
}

class Swift extends Petrol 
{
	{
		System.out.println("This is a Swift Model");
	}
		
}

class Nano extends Petrol
{
	{
		System.out.println("This is a Nano Model");
	}
}

class Fortuner extends Disel
{
	{
		System.out.println("This is a Fortuner Model");
	}
}

class Inova extends Disel
{
	{
		System.out.println("This is a Inova Model");
	}
}

class EV extends Four
{
	{
		System.out.println("This is a Electrical Vehical Category");
	}
}

class Indian extends EV
{
	{
		System.out.println("Indian Electrical Vehicals");
	}
}

class Forigen extends EV
{
	{
		System.out.println("Forigen Electrical Vehicals");
	}
}

class TataNexon extends Indian
{
	{
		System.out.println("This is a Tata Nexon Model");
	}
}

class Tesla extends Forigen
{
	{
		System.out.println("This is a Tesla Model");
	}
}

class Six extends Vehical
{
	{
		System.out.println("This is a Six Wheeler Category");
	}

}



//Main Program 

class Prep
{
	public static void main (String[] args)
	{

		//Upcasting sub class convert into super class
		Vehical sw = new Swift();
		
		sw.vehicalNo="MH-01-AA-0001";
		sw.Engin="1250 CC";
		sw.color="Milke White";
		sw.info();
		System.out.println("Vehical Registration No : " + sw.vehicalNo);
		System.out.println("Engin Cubic capacity : " + sw.Engin);
		System.out.println("Color : " +sw.color);
		sw.setPrice(850000);
		System.out.println("Price: " + sw.getPrice());
		
		sw.Start();
		sw.Drive();
		sw.Stop();
		
		System.out.println(sw instanceof Vehical);
		
		
		System.out.println("-----------------------------------------");
		
		
		//Upcasting sub class convert into super class
		Vehical Nano1 = new Nano();
		
		
		Nano1.vehicalNo="MH-01-AA-0002";
		Nano1.Engin="600 CC";
		Nano1.color="Yello";
		Nano1.info();
		
		System.out.println("Vehical Registration No : " + Nano1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Nano1.Engin);
		System.out.println("Color : " +Nano1.color);
		Nano1.setPrice(175080);
		System.out.println("Price: " + Nano1.getPrice());
		
		Nano1.Start();
		Nano1.Drive();
		Nano1.Stop();
		
		System.out.println(Nano1 instanceof Vehical);
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		//Upcasting sub class convert into super class
		Vehical  Fortuner1 = new Fortuner();
		
		
		Fortuner1.vehicalNo="MH-01-AA-0003";
		Fortuner1.Engin="1900 CC";
		Fortuner1.color="Black";
		Fortuner1.info();
		
		System.out.println("Vehical Registration No : " + Fortuner1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Fortuner1.Engin);
		System.out.println("Color : " +Fortuner1.color);
		Fortuner1.setPrice(4580000);
		System.out.println("Price: " + Fortuner1.getPrice());
		
		Fortuner1.Start();
		Fortuner1.Drive();
		Fortuner1.Stop();
		
		System.out.println(Fortuner1 instanceof Vehical);
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Inova1 = new Inova();         //Upcasting sub class convert into super class
		
		Inova1.vehicalNo="MH-01-AA-0004";
		Inova1.Engin="1600 CC";
		Inova1.color="Marun";
		Inova1.info();
		
		System.out.println("Vehical Registration No : " + Inova1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Inova1.Engin);
		System.out.println("Color : " +Inova1.color);
		Inova1.setPrice(4580000);
		System.out.println("Price: " + Inova1.getPrice());
		
		Inova1.Start();
		Inova1.Drive();
		Inova1.Stop();
		
		System.out.println(Inova1 instanceof Vehical);
		
		
		System.out.println("----------------------------------------------------------------------------");
		
		Vehical Pulser1 = new Pulser();         //Upcasting sub class convert into super class
		
		Pulser1.vehicalNo="MH-01-AA-0005";
		Pulser1.Engin="150 CC";
		Pulser1.color="Black";
		Pulser1.info();
		
		System.out.println("Vehical Registration No : " + Pulser1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Pulser1.Engin);
		System.out.println("Color : " +Pulser1.color);
		Pulser1.setPrice(150600);
		System.out.println("Price: " + Pulser1.getPrice());
		
		Pulser1.Start();
		Pulser1.Drive();
		Pulser1.Stop();
		
		System.out.println(Pulser1 instanceof Vehical);
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Chetak1 = new Chetak();         //Upcasting sub class convert into super class
		
		Chetak1.vehicalNo="MH-01-AA-0006";
		Chetak1.Engin="180 CC";
		Chetak1.color="Orange";
		Chetak1.info();
		
		System.out.println("Vehical Registration No : " + Chetak1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Chetak1.Engin);
		System.out.println("Color : " +Chetak1.color);
		Chetak1.setPrice(170400);
		System.out.println("Price: " + Chetak1.getPrice());
		
		Chetak1.Start();
		Chetak1.Drive();
		Chetak1.Stop();
		
		System.out.println(Chetak1 instanceof Vehical);
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Himalay1 =  new Himalay();         //Upcasting sub class convert into super class
		
		Himalay1.vehicalNo="MH-01-AA-0007";
		Himalay1.Engin="350 CC";
		Himalay1.color="White and Gold";
		Himalay1.info();
		
		System.out.println("Vehical Registration No : " + Himalay1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Himalay1.Engin);
		System.out.println("Color : " +Himalay1.color);
		Himalay1.setPrice(170400);
		System.out.println("Price: " + Himalay1.getPrice());
		
		Himalay1.Start();
		Himalay1.Drive();
		Himalay1.Stop();
		
		System.out.println(Himalay1 instanceof Vehical);
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Bullet1 = new Bullet();;         //Upcasting sub class convert into super class
		
		Bullet1.vehicalNo="MH-01-AA-0008";
		Bullet1.Engin="350 CC";
		Bullet1.color="White and Gold";
		Bullet1.info();
		
		System.out.println("Vehical Registration No : " + Bullet1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Bullet1.Engin);
		System.out.println("Color : " +Bullet1.color);
		Bullet1.setPrice(280000);
		System.out.println("Price: " + Bullet1.getPrice());
		
		Bullet1.Start();
		Bullet1.Drive();
		Bullet1.Stop();
		
		System.out.println(Bullet1 instanceof Vehical);
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Jupiter1 = new Jupiter();         //Upcasting sub class convert into super class
		
		Jupiter1.vehicalNo="MH-01-AA-0009";
		Jupiter1.Engin="125 CC";
		Jupiter1.color="Matt Black";
		Jupiter1.info();
		
		System.out.println("Vehical Registration No : " + Jupiter1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Jupiter1.Engin);
		System.out.println("Color : " +Jupiter1.color);
		Jupiter1.setPrice(100500);
		System.out.println("Price: " + Jupiter1.getPrice());
		
		Jupiter1.Start();
		Jupiter1.Drive();
		Jupiter1.Stop();
		
		System.out.println(Jupiter1 instanceof Vehical);
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Haveay1 = new Haveay();         //Upcasting sub class convert into super class
		
		Haveay1.vehicalNo="MH-01-AA-0010";
		Haveay1.Engin="150 CC";
		Haveay1.color="Military Green";
		Haveay1.info();
		
		System.out.println("Vehical Registration No : " + Haveay1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Haveay1.Engin);
		System.out.println("Color : " +Haveay1.color);
		Haveay1.setPrice(160000);
		System.out.println("Price: " + Haveay1.getPrice());
		
		Haveay1.Start();
		Haveay1.Drive();
		Haveay1.Stop();
		
		System.out.println(Haveay1 instanceof Vehical);
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical TataNexon1 = new TataNexon();         //Upcasting sub class convert into super class
		
		TataNexon1.vehicalNo="MH-01-AA-0011";
		TataNexon1.Engin="Max Torque : 245 nm";
		TataNexon1.color="Matt Black";
		TataNexon1.info();
		
		System.out.println("Vehical Registration No : " + TataNexon1.vehicalNo);
		System.out.println("Engin Max Torque : " + TataNexon1.Engin);
		System.out.println("Color : " +TataNexon1.color);
		TataNexon1.setPrice(2100000);
		System.out.println("Price: " + TataNexon1.getPrice());
		
		TataNexon1.Start();
		TataNexon1.Drive();
		TataNexon1.Stop();
		
		System.out.println(TataNexon1 instanceof Vehical);
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Tesla1 =  new Tesla();         //Upcasting sub class convert into super class
		
		Tesla1.vehicalNo="MH-01-AA-0012";
		Tesla1.Engin="Max Torque : 329 nm";
		Tesla1.color="Gray";
		Tesla1.info();
		
		System.out.println("Vehical Registration No : " + Tesla1.vehicalNo);
		System.out.println("Engin Max Torque : " + Tesla1.Engin);
		System.out.println("Color : " +Tesla1.color);
		Tesla1.setPrice(5600000);
		System.out.println("Price: " + Tesla1.getPrice());
		
		Tesla1.Start();
		Tesla1.Drive();
		Tesla1.Stop();
		
		System.out.println(Tesla1 instanceof Vehical);
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical AutoRiksha1 = new AutoRiksha();         //Upcasting sub class convert into super class
		
		AutoRiksha1.vehicalNo="MH-01-AA-0013";
		AutoRiksha1.Engin="Engin Cubic capacity : 145 CC";
		AutoRiksha1.color="Black and Yellow";
		AutoRiksha1.info();
		
		System.out.println("Vehical Registration No : " + AutoRiksha1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + AutoRiksha1.Engin);
		System.out.println("Color : " +AutoRiksha1.color);
		AutoRiksha1.setPrice(190000);
		System.out.println("Price: " + AutoRiksha1.getPrice());
		
		AutoRiksha1.Start();
		AutoRiksha1.Drive();
		AutoRiksha1.Stop();
		
		System.out.println(AutoRiksha1 instanceof Vehical);
		
		
		
		System.out.println("----------------------------------------------------------------------------");
		
	
		
		Vehical Six1 = new Six();         //Upcasting sub class convert into super class
		
		Six1.vehicalNo="MH-01-AA-0014";
		Six1.Engin="Engin Cubic capacity : 8000 CC";
		Six1.color="Red";
		Six1.info();
		
		System.out.println("Vehical Registration No : " + Six1.vehicalNo);
		System.out.println("Engin Cubic capacity : " + Six1.Engin);
		System.out.println("Color : " +Six1.color);
		Six1.setPrice(1400000);
		System.out.println("Price: " + Six1.getPrice());
		
		Six1.Start();
		Six1.Drive();
		Six1.Stop();
		
		System.out.println(Six1 instanceof Vehical);
		
		
		
		
		
		
		
	}
}