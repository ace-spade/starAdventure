//version 0.5
import java.util.Scanner;
public class Textapp{

	static Scanner sc = new Scanner(System.in);
	//establishes the setting
	static String Open = "You are in a forest, there is a path leading to a castle going east. Where do you go (n for north, e for east, w for west, s for south).";
	//default Room_Exception
	static String Rm_Ex = "You Cannot Go There. Your path is blocked";
	//variable values for game mechanics
	static int ToD = 0;
	static int uHealth = 12;
	static int monDMG1 =3;
	static String[] monName={"Zombie","Werewolf","Derranged Axeman","Drunk Guy","Terminator","Predator", "Alien"};
	static int NameChoose = (int)(Math.random()*(7-1+1)+1);
	static int monLive1 = (int)Math.random()*(25-2+1)+2;
	static String[] weaponName = {"Bare Hands", "Rusty Knife","Finger on a Stick", "Hatchet"};
	static int weaponLv = 0;
	static int[] weaponDMG = {(int) Math.random()*4 + 1,(int)Math.random()*(10-5+1)+5,(int)Math.random()*(15-5+1)+5, (int)Math.random()*(20-5+1)+5};
	static String[] DayTime = {"The sun has risen.","It is noon.","The sun is setting.","The moon is out."};
	static int shield = 0;
	//main method
	public static void main(String[] args){
	//run first room
		Rm0();
	}
	//origin point
	public static void Rm0(){
		
		//starts the game and gives first decision
		System.out.println(Open);
		String RmNx= sc.nextLine();
		if(RmNx.equals("n")){
			Rm1();
		}else if (RmNx.equals("e")){
			Rm2();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm0();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm0();
			
		}
	}
	//room 0,1
	public static void Rm1(){
		//player gets the hatchet
		weaponLv = 3;
		System.out.println("The path leads to a river, you find a small hatchet and put it in your pocket. Where do you go?");
		//move decision
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm1();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm1();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm1();
		}else if (RmNx.equals("s")){
			Rm0();
		}
	}
	//room 1,0
	public static void Rm2(){
		//uses daynight cycle
		System.out.println("You continue along the path. " + DayTime[ToD]+ " Where do you go?");
		//move decision
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm2();
		}else if (RmNx.equals("e")){
			Rm3();
		}else if (RmNx.equals("w")){
			Rm0();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm2();
		}
		
	}
	//room 2,0
	public static void Rm3(){
		//battle mode
		System.out.println("You meet a "+ monName[NameChoose] + ". He runs at you.");
		System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
		if(weaponDMG[weaponLv] >= monLive1){
			System.out.println("The monster was defeated");
		}else{
			System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG1);
			uHealth = uHealth - monDMG1;
			System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
			System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle.");
			
		}
		NameChoose =(int)(Math.random()*(7-1+1)+1);
		//move decision
		System.out.println("Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm3();
		}else if (RmNx.equals("e")){
			Rm4();
		}else if (RmNx.equals("w")){
			Rm2();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm3();
		}
	}
	//room 3,0
	public static void Rm4(){
		//if hatchet isn't already found, get a new weapon
		if(weaponLv < 2){
			System.out.println("You find a rusty knife and put it in your pocket, where do you want to go?");
		}else{
			System.out.println("You are in almost in an open area, where do you go?");
		}
		//move dec
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm4();
		}else if (RmNx.equals("e")){
			Rm5();
		}else if (RmNx.equals("w")){
			Rm3();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm4();
		}
	}
	//room 4,0
	public static void Rm5(){
		
		//move dec
		System.out.println("You are at a crossroads, one road goes north-south, the other goes toward the castle, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm6();
		}else if (RmNx.equals("e")){
			Rm17();
		}else if (RmNx.equals("w")){
			Rm4();
		}else if (RmNx.equals("s")){
			Rm11();
		}
	}
	//room 4,1
	public static void Rm6(){
		//move dec
		System.out.println("The land is getting marshier. where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm7();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm6();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm6();
		}else if (RmNx.equals("s")){
			Rm5();
		}
	}
	//room 4,2
	public static void Rm7(){
		//move dec
				ToD++;
				System.out.println("You see a swamp and it is "+ DayTime[ToD] + ", where do you go?");
				String RmNx = sc.nextLine();
				if(RmNx.equals("n")){
					Rm8();
				}else if (RmNx.equals("e")){
					System.out.println(Rm_Ex);
					Rm7();
				}else if (RmNx.equals("w")){
					System.out.println(Rm_Ex);
					Rm7();
				}else if (RmNx.equals("s")){
					Rm6();
				}
	}
	//room 4,3
	public static void Rm8(){
		//move dec
		System.out.println("You are sinking in mud, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm8();
		}else if (RmNx.equals("e")){
			Rm10();
		}else if (RmNx.equals("w")){
			Rm9();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm8();
		}
	}
	//room 3,3
	public static void Rm9(){
		//move dec
		NameChoose = (int)(Math.random()*(7-1+1)+1);
				System.out.println("You notice a "+monName[NameChoose]+", do you want to swing at him? (y for yes n for no)");
				String yee = sc.nextLine();
				if(yee.equals("y")){
					System.out.println("You swing at "+monName[NameChoose]+" with your "+weaponName[weaponLv]+ " dealing " + weaponDMG[weaponLv] +" damage.");
					if(weaponDMG[weaponLv] > monLive1){
						System.out.println("You beat the monster and it died, where do you want to go?");
						String RmNx = sc.nextLine();
						if(RmNx.equals("n")){
							System.out.println(Rm_Ex);
							Rm8();
						}else if (RmNx.equals("e")){
							Rm10();
						}else if (RmNx.equals("w")){
							System.out.println(Rm_Ex);
							Rm9();
						}else if (RmNx.equals("s")){
							System.out.println(Rm_Ex);
							Rm8();
						}
					}else{
						System.out.println("The monster runs away, where do you want to go");
						String RmNx = sc.nextLine();
						if(RmNx.equals("n")){
							System.out.println(Rm_Ex);
							Rm8();
						}else if (RmNx.equals("e")){
							Rm10();
						}else if (RmNx.equals("w")){
							Rm9();
						}else if (RmNx.equals("s")){
							System.out.println(Rm_Ex);
							Rm8();
						}
					}
				}else{
					Rm7();
				}
				
				
	}
	//room 5,3
	public static void Rm10(){
		System.out.println("You find a shield! where do you want to go.");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm10();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm10();
		}else if (RmNx.equals("w")){
			Rm9();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm10();
			shield ++;
		}
	}
	//room 4,-1
	public static void Rm11(){
		//move dec
				System.out.println("You feel sand beneath your feet, where do you go?");
				String RmNx = sc.nextLine();
				if(RmNx.equals("n")){
					Rm5();
				}else if (RmNx.equals("e")){
					System.out.println(Rm_Ex);
					Rm11();
				}else if (RmNx.equals("w")){
					System.out.println(Rm_Ex);
					Rm11();
				}else if (RmNx.equals("s")){
					Rm12();
				}
	}
	//room 4,-2
	public static void Rm12(){
		//move dec
		System.out.println("You see a massive sand dune in front of you, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm11();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm12();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm12();
		}else if (RmNx.equals("s")){
			Rm13();
		}
	}
	//room 4,-3
	public static void Rm13(){
		//move dec
		System.out.println("You climb to the top of the dune, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm12();
		}else if (RmNx.equals("e")){
			Rm16();
		}else if (RmNx.equals("w")){
			Rm14();
		}else if (RmNx.equals("s")){
			Rm15();
		}
	}
	//room 3,-3
	public static void Rm14(){
		//move dec
		System.out.println("When you reach the bottom of the dune you find some gold, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm14();
		}else if (RmNx.equals("e")){
			Rm13();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm14();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm14();
		}
	}
	//room 4,-4
	public static void Rm15(){
		//move dec
				System.out.println("You find a cave of bats underneath the dune. You are bitten by a thousand bats as you try to enter the cave, where do you go?");
				String RmNx = sc.nextLine();
				if(RmNx.equals("n")){
					Rm13();
				}else if (RmNx.equals("e")){
					System.out.println(Rm_Ex);
					Rm15();
				}else if (RmNx.equals("w")){
					System.out.println(Rm_Ex);
					Rm15();
				}else if (RmNx.equals("s")){
					System.out.println(Rm_Ex);
					Rm15();
				}
	}
	//room 5,-3
	public static void Rm16(){
		//move dec
		System.out.println("You find a small tree. It is battling the wind and sand. You kick it over and it turns to dust, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm13();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm15();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm15();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm15();
		}
	}
	//room 5,0
	public static void Rm17(){
		//move dec
		System.out.println("You are at the entrance of the castle, where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm17();
		}else if (RmNx.equals("e")){
			Rm18();
		}else if (RmNx.equals("w")){
			Rm5();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm17();
		}
	}
	//room 6,0
	public static void Rm18(){}
	//room 6,1
	public static void Rm19(){}
	//room 6,2
	public static void Rm20(){}
	//room 6,2
	public static void Rm21(){}
	//room 6,-1
	public static void Rm22(){}
	//room 7,0
	public static void Rm23(){}
	//room 7,1
	public static void Rm24(){}
	//room 7,2
	public static void Rm25(){}
	//room 8,2
	public static void Rm26(){}
	//room 8,1
	public static void Rm27(){}
	//room 8,0
	public static void Rm28(){}
	//room 8,-1
	public static void Rm29(){}
	//room 9,-1
	public static void Rm30(){}
	//room 9,0
	public static void Rm31(){}
	//room 9,2
	public static void Rm32(){}
	//room 9,3
	public static void Rm33(){}
	
}			}	