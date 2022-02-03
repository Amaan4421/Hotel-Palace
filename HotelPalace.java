/*
	NAME:AMAAN SAJINA
	DOC:01/02/2022
	OBJECTIVE: Hotel menu
*/

import java.util.Scanner;
public class HotelPalace
{
	public static void main(String args[])
	{
		HotelPalace obj=new HotelPalace();
		int choice,south,gujrati,italian,chinese,sindhi,nonveg,marathi,punjabi,mexican,desserts;
		int p,b;
		while(true)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("1---South Indian");
			System.out.println("2---Gujrati");
			System.out.println("3---Italian");
			System.out.println("4---Chinese");
			System.out.println("5---Sindhi");
			System.out.println("6---Non-veg");
			System.out.println("7---Marathi");
			System.out.println("8---Punjabi");
			System.out.println("9---Mexican");
			System.out.println("10---Desserts");
			System.out.println("11---Exit");
		
		
			System.out.println("Enter your choice:");
			choice=s.nextInt();
			
			switch(choice)
			{
				case 1: System.out.println("You have selected South Indian!!");
				
						System.out.println("1---Idli");
						System.out.println("2---Dosa");
						
						System.out.println("Enter your choice:");
						south=s.nextInt();

						switch(south)
						{
							case 1: System.out.println("You have selected Idli!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*60;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Dosa!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*90;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of south switch
				
				
				break;
				
				case 2: System.out.println("You have selected Gujrati!!");
				
						System.out.println("1---Dhokla");
						System.out.println("2---Undhiyu");
						
						System.out.println("Enter your choice:");
						gujrati=s.nextInt();

						switch(gujrati)
						{
							case 1: System.out.println("You have selected Dhokla!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*40;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Undhiyu!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*35;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of gujrati switch
				
				break;
				
				case 3: System.out.println("You have selected Italian!!");
				
						System.out.println("1---Pasta");
						System.out.println("2---Pizza");
						
						System.out.println("Enter your choice:");
						italian=s.nextInt();

						switch(italian)
						{
							case 1: System.out.println("You have selected Pasta!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*100;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Pizza!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*120;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of italian switch
				
				break;
				
				case 4: System.out.println("You have selected Chinese!!");
					
						System.out.println("1---Manchurian");
						System.out.println("2---Nooddles");
						
						System.out.println("Enter your choice:");
						chinese=s.nextInt();

						switch(chinese)
						{
							case 1: System.out.println("You have selected Manchurian!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*45;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Nooddles!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*35;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of chinese switch
				
				break;
				
				case 5: System.out.println("You have selected Sindhi!!");
				
						System.out.println("1---Dal Pakwan");
						System.out.println("2---Saibhaji");
						
						System.out.println("Enter your choice:");
						sindhi=s.nextInt();

						switch(sindhi)
						{
							case 1: System.out.println("You have selected Dal Pakwan!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*70;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Saibhaji!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*45;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of sindhi switch
				
				break;
				
				case 6: System.out.println("You have selected Non-veg!!");
				
						System.out.println("1---Chicken Tikka");
						System.out.println("2---Chicken leg peice");
						
						System.out.println("Enter your choice:");
						nonveg=s.nextInt();

						switch(nonveg)
						{
							case 1: System.out.println("You have selected Chicken Tikka!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*120;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Chicken leg peice!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*150;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of nonveg switch
				
				break;
				
				case 7: System.out.println("You have selected Marathi!!");
				
						System.out.println("1---Puaranpoli");
						System.out.println("2---Vadapav");
						
						System.out.println("Enter your choice:");
						marathi=s.nextInt();

						switch(marathi)
						{
							case 1: System.out.println("You have selected Puaranpoli!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*30;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Vadapav!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*25;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of marathi switch
				
				break;
				
				case 8: System.out.println("You have selected Punjabi!!");
				
						System.out.println("1---Chole kulje");
						System.out.println("2---Aloo paratha");
						
						System.out.println("Enter your choice:");
						punjabi=s.nextInt();

						switch(punjabi)
						{
							case 1: System.out.println("You have selected Chole kulje!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*45;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Aloo paratha!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*20;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of punjabi switch
				
				break;
			
				case 9: System.out.println("You have selected Mexican!!");
				
						System.out.println("1---Sandwich");
						System.out.println("2---Burger");
						
						System.out.println("Enter your choice:");
						mexican=s.nextInt();

						switch(mexican)
						{
							case 1: System.out.println("You have selected Sandwich!!");
				
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*40;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Burger!!");
							
									System.out.println("How many plates??");
									p=s.nextInt();
									
									b=p*60;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of mexican switch
				
				break;
			
			
				case 10: System.out.println("You have selected Desserts!!");
				
						System.out.println("1---White house");
						System.out.println("2---Chocolate");
						
						System.out.println("Enter your choice:");
						desserts=s.nextInt();

						switch(desserts)
						{
							case 1: System.out.println("You have selected White house!!");
				
									System.out.println("How many scoop??");
									p=s.nextInt();
									
									b=p*55;
									
									System.out.println("Your bill is "+b);
				
							break;
							
							case 2: System.out.println("You have selected Chocolate!!");
							
									System.out.println("How many scoop??");
									p=s.nextInt();
									
									b=p*65;
									
									System.out.println("Your bill is "+b);
						
							break;
							
							default:System.out.println("Invalid Choice!!!");


						}//end of desserts switch
				
				break;
			
				case 11: System.exit(0);
			
				default:System.out.println("Invalid choice!!!");
				
			}//end of switch
		
		}//end of while
		
	}//end of main
}//end of class
