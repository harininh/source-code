import java.util.*;
class  Hotel
{
	static Scanner s=new Scanner(System.in); 
	public static void main(String[] args) throws Exception
	{
		System.out.println("\t\t\t\t***** SELECT YOUR HOTEL*****\n");
		System.out.println("1.MealsWorld\n2.Eat of Arabs\n3.Fat Food\n");
		System.out.println("Enter your Hotel");
		int a=s.nextInt();
		switch (a)
		{
		case 1:{
			System.out.println("\t\t\t****Welcome to MealsWorld******\n");
			System.out.println("Select Your Wonderful Dish\n");
		    System.out.println("1.Briyani\n2.Chicken Rice\n3.Chicken-65\n4.Mutton Briyani\n");
			System.out.println("Enter your Dish");
			int b=s.nextInt();
			switch (b)
			{
			case 1:{
				System.out.println("Your Selecting Briyani\n");
				double price =100;
				System.out.println("The Price of briyani is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.Googlepay\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int c=s.nextInt();
				switch (c)
				{
				case 1:{
					System.out.println("your selected Google pay");
					System.out.println("Enter your amount:");
					int e=s.nextInt();
					if (total==e)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double f=s.nextDouble();
					 if (res==f)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int g=s.nextInt();
					if (total==g)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double h=s.nextDouble();
					 if (res==h)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 2:{
					System.out.println("Your Selecting Chicken Rice\n");
				double price =80;
				System.out.println("The Price of Chicken Rice is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.Googlepay\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int i=s.nextInt();
				switch (i)
				{
				case 1:{
					System.out.println("your selected Google pay");
					System.out.println("Enter your amount:");
					int j=s.nextInt();
					if (total==j)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double k=s.nextDouble();
					 if (res==k)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int l=s.nextInt();
					if (total==l)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double m=s.nextDouble();
					 if (res==m)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 3:{
					System.out.println("Your Selecting Chicken-65\n");
				double price =200;
				System.out.println("The Price of Chicken-65 is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.Googlepay\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int n=s.nextInt();
				switch (n)
				{
				case 1:{
					System.out.println("your selected Google pay");
					System.out.println("Enter your amount:");
					int o=s.nextInt();
					if (total==o)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double p=s.nextDouble();
					 if (res==p)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int q=s.nextInt();
					if (total==q)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double z=s.nextDouble();
					 if (res==z)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 4:{
					System.out.println("Your Selecting Mutton Briyani\n");
				double price =400;
				System.out.println("The Price of Mutton briyani is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.Googlepay\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int t=s.nextInt();
				switch (t)
				{
				case 1:{
					System.out.println("your selected Google pay");
					System.out.println("Enter your amount:");
					int u=s.nextInt();
					if (total==u)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double v=s.nextDouble();
					 if (res==v)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int w=s.nextInt();
					if (total==w)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double x=s.nextDouble();
					 if (res==x)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
			
			}
			break;}
			case 2:{
				System.out.println("\t\t\t****Heartful Welcome to Eat of Arab******\n");
			System.out.println("Select Your Wonderful Dish\n");
		    System.out.println("1.Briyani\n2.Fried Rice\n3.Chicken-65\n4. Egg Rice\n5.Mutton Briyani\n");
			System.out.println("Enter your Dish");
			int ab=s.nextInt();
			switch (ab)
			{
			case 1:{
				System.out.println("Your Selecting Briyani\n");
				double price =150;
				System.out.println("The Price of briyani is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int ac=s.nextInt();
				switch (ac)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int ae=s.nextInt();
					if (total==ae)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double af=s.nextDouble();
					 if (res==af)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t*******Again Visit MealsWorld********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int ag=s.nextInt();
					if (total==ag)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double ah=s.nextDouble();
					 if (res==ah)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 2:{
					System.out.println("Your Selecting Fried Rice\n");
				double price =180;
				System.out.println("The Price of Fried Rice is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int ai=s.nextInt();
				switch (ai)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int aj=s.nextInt();
					if (total==aj)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double ak=s.nextDouble();
					 if (res==ak)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int al=s.nextInt();
					if (total==al)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double am=s.nextDouble();
					 if (res==am)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 3:{
					System.out.println("Your Selecting Chicken-65\n");
				double price =200;
				System.out.println("The Price of Chicken-65 is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int an=s.nextInt();
				switch (an)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int ao=s.nextInt();
					if (total==ao)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double ap=s.nextDouble();
					 if (res==ap)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int aq=s.nextInt();
					if (total==aq)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double az=s.nextDouble();
					 if (res==az)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 4:{
					System.out.println("Your Selecting Egg Rice\n");
				double price =60;
				System.out.println("The Price of Egg Rice is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int at=s.nextInt();
				switch (at)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int au=s.nextInt();
					if (total==au)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double av=s.nextDouble();
					 if (res==av)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int aw=s.nextInt();
					if (total==aw)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double ax=s.nextDouble();
					 if (res==ax)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 5:{
					System.out.println("Your Selecting Mutton Briyani\n");
				double price =500;
				System.out.println("The Price of Mutton briyani is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.PhonePay\n");
				System.out.println("enter your paymode:\n");
				int bt=s.nextInt();
				switch (bt)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int bu=s.nextInt();
					if (total==bu)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double bv=s.nextDouble();
					 if (res==bv)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Phonepay");
					System.out.println("Enter your amount:");
					int bw=s.nextInt();
					if (total==bw)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch\n");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double bx=s.nextDouble();
					 if (res==bx)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("\t\t\t\t*******Offer will soon at Eat of Arabs********\n");
					 System.out.println("\t\t\t\t*******Again Visit Eat of Arabs********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
			
			
			}

				break;}
				case 3:{
					System.out.println("\t\t\t**** Welcome to Fat Food******\n\n");
					System.out.println("\t\t\t\t******Only Eat To Fat************");
			System.out.println("Select Your Wonderful Dish\n");
		    System.out.println("1.Briyani\n2.Mutton Briyani\n");
			System.out.println("Enter your Dish");
			int abc=s.nextInt();
			switch (abc)
			{
			case 1:{
				System.out.println("Your Selecting Briyani\n");
				double price =250;
				System.out.println("The Price of briyani is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.AmazonPay\n");
				System.out.println("enter your paymode:\n");
				int acc=s.nextInt();
				switch (acc)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int aec=s.nextInt();
					if (total==aec)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double afc=s.nextDouble();
					 if (res==afc)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t******* Once visted Again Visit Fat To Eat ********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Amazonpay");
					System.out.println("Enter your amount:");
					int agc=s.nextInt();
					if (total==agc)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double ahc=s.nextDouble();
					 if (res==ahc)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t******* Once visted Again Visit  ********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
				case 2:{
					System.out.println("Your Selecting Mutton Briyani\n");
				double price =480;
				System.out.println("The Price of Mutton Briyani is:"+price+"\n");
				System.out.println("Enter your quantity:");
				int qty=s.nextInt();
				double total=price *qty;
				System.out.println("The Total amount is:"+total+"\n");
				System.out.println("Select Your PayMode \n");
				System.out.println("1.PayTM\n2.AmazonPay\n");
				System.out.println("enter your paymode:\n");
				int aic=s.nextInt();
				switch (aic)
				{
				case 1:{
					System.out.println("your selected PayTM");
					System.out.println("Enter your amount:");
					int ajc=s.nextInt();
					if (total==ajc)
					{
                     System.out.println("The amount is matched\n");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double akc=s.nextDouble();
					 if (res==akc)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					 System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t******* Once visted Again Visit Fat To Eat  ********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}
					break;}
					case 2:{
						System.out.println("your selected Amazonpay");
					System.out.println("Enter your amount:");
					int alc=s.nextInt();
					if (total==alc)
					{
                     System.out.println("The amount is matched");
					}
					else
					{
						System.out.println("Your Amount is Mismatch");
					}
					System.out.println("Your Otp is Generating....\n");
					double r=Math.random()*9999+9999;
					int res=(int)r;
				     Thread.sleep(2000);
					 System.out.println("Your otp is :"+res);
					 System.out.println("enter Your Otp:");
					 double amc=s.nextDouble();
					 if (res==amc)
					 {
					 Thread.sleep(2000);
					 System.out.println("Processing......\n");
					 Thread.sleep(2000);
					 System.out.println("Your order is received\n");
					 Thread.sleep(2000);
					  System.out.println("Thank You for Your Order it will raeached at 20mints\n");
					 System.out.println("\t\t\t\t******* Once visted Again Visit Fat TO Eat ********");
					 }
					 else
					{
						 System.out.println("Your Otp is MisMatch\n");
						 Thread.sleep(1000);
						 System.out.println("Check Your Otp");
					}

						break;}
						}
				break;}
			}

					break;}
					}

		
		}
	}
	


