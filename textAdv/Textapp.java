
import java.util.Scanner;
public class Textapp{
	
	static Scanner sc = new Scanner(System.in);
	static Scanner in = new Scanner(System.in);
	//establishes the setting
	static String Open = "You are in a forest, there is a path leading to a castle going east. Where do you go (n for north, e for east, w for west, s for south).";
	//default Room_Exception
	static String Rm_Ex = "You Cannot Go There. Your path is blocked";
	//variable values for game mechanics
	static int ToD = 0;
	static int uHealth = 12;
	//static int monDMG1 =5;
	static int monDMG2 =15;
	static String[] monName={"Zombie","Werewolf","Derranged Axeman","Drunk Guy","Terminator","Predator", "Alien" };
	static int NameChoose = (int)(Math.random()*(7-1+1)+1);
	//static int monLive1 = (int)Math.random()*(25-2+1)+2;
	static String[] weaponName = {"Bare Hands", "Rusty Knife","Finger on a Stick", "Hatchet", "Sword", "Hammer","Pickaxe", "Mind Powers"};
	static int weaponLv = 0;
	//static int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
	static String[] DayTime = {"The sun has risen.","It is noon.","The sun is setting.","The moon is out."};
	static int shield = 0;
	static double ver = 1.8;
	//main method
	public static void main(String[] args) throws InterruptedException{
		System.out.println("Version:"+ver);
		Thread.sleep(4000);
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
		//player gets the hatchet and gets higher level weapon
		if(weaponLv<5){weaponLv++;}
		if(weaponLv<5){weaponLv++;}
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
		//uses day night cycle
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
	//room 2,0 battle
	public static void Rm3(){
		//battle mode
		//creates random number for player damage
		int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
		int monDMG1 = (int)Math.random()*(7-3)+3;
		//creates monster name and health
		int monLive1 = (int)Math.random()*(25-2+1)+2;
		NameChoose =(int)(Math.random()*(7-1+1));
		//output monster name
		System.out.println("You meet a "+ monName[NameChoose] + ". He runs at you.");
		//your attack
		System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
		//if the attack was strong enough, the monster dies
		if(weaponDMG[weaponLv] >= monLive1){
			System.out.println("The monster was defeated");
		}else{
			//longer way of ending the battle.
			System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG1);
			uHealth = uHealth - (monDMG1-shield);
			//death check
			if(uHealth<0){
				System.out.println("You died.");
				Rm0();
			}else{
				System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
				System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle.");
			}
		}
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
		if(weaponLv < 1){
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
			Rm7();
		}
	}
	//room 3,3 battle
	public static void Rm9(){
		//battle mode
		//monster name and damage
		int monDMG1 = (int)Math.random()*(7-3)+3;
		int NameChoose = (int)(Math.random()*(7-1+1)+1);
		//player damage
		int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
		//monster health
		int monLive1 = (int)Math.random()*(25-2+1)+2;
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
						//longer way of ending the battle.
						System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG1);
						uHealth = uHealth - (monDMG1-shield);
						//death check
						if(uHealth<0){
							System.out.println("You died.");
							Rm0();
						}else{
							System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
							System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle. Where do you want to go?");
						}
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
		if(shield<1){
		System.out.println("You find a shield! where do you want to go.");
		shield ++;
		}
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm10();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm10();
		}else if (RmNx.equals("w")){
			Rm8();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm10();
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
		ToD++;
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
	public static void Rm18(){
		System.out.println("You enter the castle. It is grandiose and made of rustic stone. An enormous chandelier hangs from the ceiling. Where do you want to go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm19();
			
		}else if (RmNx.equals("e")){
			Rm23();
		}else if (RmNx.equals("w")){
			Rm17();
		}else if (RmNx.equals("s")){
			Rm21();
		}
	}
	//room 6,1
	public static void Rm19(){
		System.out.println("It is not very bright in this room. It is in tatters. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm20();
			
		}else if (RmNx.equals("e")){
			Rm24();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm19();
		}else if (RmNx.equals("s")){
			Rm18();
		}
	}
	//room 6,2
	public static void Rm20(){
		
		System.out.println(DayTime[ToD] + " Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm20();
		}else if (RmNx.equals("e")){
			Rm25();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm20();
		}else if (RmNx.equals("s")){
			Rm19();
		}
	}
	//room 6,2
	public static void Rm21(){
		
		System.out.println("The windows are bright and let a lot of light shine through. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm18();
		}else if (RmNx.equals("e")){
			Rm22();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm21();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm21();
		}
	}
	//room 6,-1 battle
	public static void Rm22(){
		//battle mode
		//monster name
		int monDMG1 = (int)Math.random()*(7-3)+3;
		int NameChoose = (int)(Math.random()*(7-1+1)+1);
		//player damage
		int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
		//monster health
		int monLive1 = (int)Math.random()*(25-2+1)+2;
		
		System.out.println("You notice a "+monName[NameChoose]+", do you want to swing at him? (y for yes n for no)");
		String yee = sc.nextLine();
		if(yee.equals("y")){
			System.out.println("You swing at "+monName[NameChoose]+" with your "+weaponName[weaponLv]+ " dealing " + weaponDMG[weaponLv] +" damage.");
			if(weaponDMG[weaponLv] > monLive1){
				System.out.println("You beat the monster and it died, where do you want to go?");
				
			}else{
				//longer way of ending the battle.
				System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG1);
				uHealth = uHealth - (monDMG1-shield);
				//death check
				if(uHealth<0){
					System.out.println("You died.");
					Rm0();
				}else{
					System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
					System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle. Where do you want to go?");
				}
			}
		}
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm23();
		}else if (RmNx.equals("e")){
			Rm29();
		}else if (RmNx.equals("w")){
			Rm21();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm22();
		}
	}
	//room 7,0 battle
	public static void Rm23(){
		System.out.println("You walk into the room to find a giant sinkhole, you need to step around it. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm24();
		}else if (RmNx.equals("e")){
			Rm28();
		}else if (RmNx.equals("w")){
			Rm18();
		}else if (RmNx.equals("s")){
			Rm22();
		}
	}
	//room 7,1
	public static void Rm24(){
		System.out.println("The floor is cracked and falling apart. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm25();
		}else if (RmNx.equals("e")){
			Rm27();
		}else if (RmNx.equals("w")){;
			Rm19();
		}else if (RmNx.equals("s")){
			Rm23();
		}
	}
	//room 7,2
	public static void Rm25(){
		ToD++;
		System.out.println("The outside wall has been blown out. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm34();
		}else if (RmNx.equals("e")){
			Rm26();
		}else if (RmNx.equals("w")){
			Rm20();
		}else if (RmNx.equals("s")){
			Rm24();
		}
	}
	//room 8,2
	public static void Rm26(){
		ToD++;
		System.out.println("You can see some purple light shining through the door to the east. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm26();
		}else if (RmNx.equals("e")){
			Rm33();
		}else if (RmNx.equals("w")){
			Rm25();
		}else if (RmNx.equals("s")){
			Rm27();
		}
		
	}
	//room 8,1 battle
	public static void Rm27(){
		ToD++;
		//battle mode
		//monster name
		int monDMG1 = (int)Math.random()*(7-3)+3;
		int NameChoose = (int)(Math.random()*(7));
		//player damage
		int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1, /*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
		//monster health
		int monLive1 = (int)Math.random()*(25-2+1)+2;
				
		System.out.println("You notice a "+monName[NameChoose]+", do you want to swing at him? (y for yes n for no)");
		String yee = sc.nextLine();
		if(yee.equals("y")){
			System.out.println("You swing at "+monName[NameChoose]+" with your "+weaponName[weaponLv]+ " dealing " + weaponDMG[weaponLv] +" damage.");
			if(weaponDMG[weaponLv] > monLive1){
				System.out.println("You beat the monster and it died, where do you want to go?");
						
			}else{
				//longer way of ending the battle.
				System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG1);
				uHealth = uHealth - (monDMG1-shield);
				//death check
				if(uHealth<0){
					System.out.println("You died.");
					Rm0();
				}else{
					System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
					System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle. Where do you want to go?");
				}
			}
		}
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm26();
		}else if (RmNx.equals("e")){
			Rm32();
		}else if (RmNx.equals("w")){
			Rm24();
		}else if (RmNx.equals("s")){
			Rm28();
		}
	}
	//room 8,0
	public static void Rm28(){
		System.out.println("Spider webs stretch across the room in thick strings. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm27();
		}else if (RmNx.equals("e")){
			Rm31();
		}else if (RmNx.equals("w")){
			Rm25();
		}else if (RmNx.equals("s")){
			Rm29();
		}
	}
	//room 8,-1
	public static void Rm29(){
		System.out.println("A giant silver horse statue is in the middle of the room, it is tarnished. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm28();
		}else if (RmNx.equals("e")){
			Rm30();
		}else if (RmNx.equals("w")){
			Rm22();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm29();
		}
	}
	//room 9,-1
	public static void Rm30(){
		System.out.println("There is thick moss covering the floor. "+DayTime[ToD]+" Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm31();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm30();
		}else if (RmNx.equals("w")){
			Rm29();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm30();
		}
	}
	//room 9,0
	public static void Rm31(){
		//battle mode
		//monster name
		int monDMG1 = (int)Math.random()*(7-3)+3;
		int NameChoose = (int)(Math.random()*(7-1+1)+1);
		//player damage
		int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
		//monster health
		int monLive1 = (int)Math.random()*(25-2+1)+2;
		
		System.out.println("You notice a "+monName[NameChoose]+", do you want to swing at him? (y for yes n for no)");
		String yee = sc.nextLine();

		System.out.println(weaponLv);
		if(yee.equals("y")){
			System.out.println("You swing at "+monName[NameChoose]+" with your "+weaponName[weaponLv]+ " dealing " + weaponDMG[weaponLv] +" damage.");
			if(weaponDMG[weaponLv] > monLive1){
				System.out.println("You beat the monster and it died, where do you want to go?");
				
			}else{
				//longer way of ending the battle.
				System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG1);
				uHealth = uHealth - (monDMG1-shield);
				//death check
				if(uHealth<0){
					System.out.println("You died.");
					Rm0();
				}else{
					System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
					System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle. Where do you want to go?");
				}
			}
		}
		System.out.println("The walls are sprayed in red, you aren't sure what shade. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm32();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm30();
		}else if (RmNx.equals("w")){
			Rm28();
		}else if (RmNx.equals("s")){
			Rm30();
		}
	}
	//room 9,2
	public static void Rm32(){
		
		System.out.println("You hear a low pitched whirring from the room north to you. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm33();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm32();
		}else if (RmNx.equals("w")){
			Rm27();
		}else if (RmNx.equals("s")){
			Rm31();
		}
	}
	//room 9,3
	public static void Rm33(){
		System.out.println("You find a wormhole to another dimension. You are now level 2: health: + 5");
		//plus 5 health for leveling up
		uHealth = uHealth +5;
		//weapon level up
		weaponLv++;
		Rm35();
	}
	//room 7,4
	public static void Rm34(){
		System.out.println("There is a beautiful forest. in there you find a golden, jewel encrusted sword and an elixir.");
		System.out.println("Once you drink the elixer, your health increases by 10.");
		if(weaponLv<5){weaponLv=weaponLv+1;}
		if(weaponLv<5){weaponLv=weaponLv+1;}
		System.out.println("Enter a word");
		String cheats = sc.nextLine();
		if(cheats.equals("Tutti_Frutti")){
			System.out.println("Hello Mathew, what weapon level do you want?");
			int lv = in.nextInt();
			if(lv<=5){
				weaponLv=lv;
			}
			System.out.println("What health do you want?");
			int hlt = in.nextInt();
			uHealth = hlt;
		}
		System.out.println("You go back to the castle.");
		Rm25();
	}
	//room 0,0,2
	public static void Rm35(){
		ToD++;
		System.out.println("You arrive through the wormhole, lava is everywhere. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm35();
		}else if (RmNx.equals("e")){
			Rm37();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm35();
		}else if (RmNx.equals("s")){
			Rm36();
		}
	}
	//room 0,-1,2
	public static void Rm36(){
		
		System.out.println("You notice the islands of rock are actually floating. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm35();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm36();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm36();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm36();
		}
	}
	//room 1,0,2
	public static void Rm37(){
		System.out.println("You feel the ground shake with each step you take across the lava field. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm37();
		}else if (RmNx.equals("e")){
			Rm38();
		}else if (RmNx.equals("w")){
			Rm35();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm37();
		}
	}
	//room 2,0,2
	public static void Rm38(){
		
		System.out.println("You make it to solid ground. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm38();
		}else if (RmNx.equals("e")){
			Rm39();
		}else if (RmNx.equals("w")){
			Rm37();
		}else if (RmNx.equals("s")){
			Rm42();
		}
	}
	//room 3,0,2
	public static void Rm39(){
		
		System.out.println(DayTime[ToD]+" Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm39();
		}else if (RmNx.equals("e")){
			Rm38();
		}else if (RmNx.equals("w")){
			Rm40();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm39();
		}
	}
	//room 4,0,2
	public static void Rm40(){
		
		System.out.println("A bubble of lava pops onto the rock you are floating on. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm40();
		}else if (RmNx.equals("e")){
			Rm39();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm40();
		}else if (RmNx.equals("s")){
			Rm43();
		}
	}
	//room 6,0,2
	public static void Rm41(){
		
		System.out.println("You see a sea of lava. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm41();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm41();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm41();
		}else if (RmNx.equals("s")){
			Rm45();
		}
	}
	//room 2,-1,2
	public static void Rm42(){
		
		System.out.println("There is a hut to the south. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm38();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm42();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm42();
		}else if (RmNx.equals("s")){
			Rm46();
		}
	}
	//room 3,-1,2
	public static void Rm43(){

		System.out.println("You are following a path that seems to be rather stable. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm40();
		}else if (RmNx.equals("e")){
			Rm44();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm43();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm43();
		}
	}
	//room 4,-1,2
	public static void Rm44(){
		
		System.out.println("You can go in three different ways. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm26();
		}else if (RmNx.equals("e")){
			Rm33();
		}else if (RmNx.equals("w")){
			Rm25();
		}else if (RmNx.equals("s")){
			Rm27();
		}
	}
	//room 5,-1,2
	public static void Rm45(){
		//battle mode
		//monster name
		int monDMG2 = (int)Math.random()*(13-3)+3;
		int NameChoose = (int)(Math.random()*(7-1+1)+1);
		//player damage
		int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
		//monster health
		int monLive1 = (int)Math.random()*(35-2+1)+2;
		
		System.out.println("You notice a "+monName[NameChoose]+", do you want to swing at him? (y for yes n for no)");
		String yee = sc.nextLine();
		if(yee.equals("y")){
			System.out.println("You swing at "+monName[NameChoose]+" with your "+weaponName[weaponLv]+ " dealing " + weaponDMG[weaponLv] +" damage.");
			if(weaponDMG[weaponLv] > monLive1){
				System.out.println("You beat the monster and it died, where do you want to go?");
				
			}else{
				//longer way of ending the battle.
				System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG2);
				uHealth = uHealth - (monDMG2-shield);
				//death check
				if(uHealth<0){
					System.out.println("You died.");
					Rm0();
				}else{
					System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
					System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle. Where do you want to go?");
				}
			}
		}
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm41();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm45();
		}else if (RmNx.equals("w")){
			Rm44();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm45();
		}
	}
	//room 6,-2,2
	public static void Rm46(){
		
		System.out.println("You notice that you are a hundred feet above the lava. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm42();
		}else if (RmNx.equals("e")){
			Rm47();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm46();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm46();
		}
	}
	//room 2,-2,2
	public static void Rm47(){
		
		System.out.println("You reached a dead end. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm47();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm47();
		}else if (RmNx.equals("w")){
			Rm46();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm47();
		}
	}
	//room 3,-2,2
	public static void Rm48(){
		
		System.out.println("You find a key. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm44();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm48();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm48();
		}else if (RmNx.equals("s")){
			Rm50();
		}
	}
	//room 5,-2,2
	public static void Rm49(){
		//battle mode
				//monster name
				int monDMG2 = (int)Math.random()*(13-3)+3;
				int NameChoose = (int)(Math.random()*(7-1+1)+1);
				//player damage
				int[] weaponDMG = {/*0*/(int) (Math.random()*4) + 1,/*1*/(int)(Math.random()*(10-5+1))+1,/*2*/(int)(Math.random()*(15-5+1))+5,/*3*/ (int)(Math.random()*(27-5+1))+5, /*4*/(int)(Math.random()*(20-5+1))+5,/*5*/ (int)(Math.random()*(20-2+5))+5, /*6*/(int)(Math.random()*(25-5+1))+5,/*7*/ (int)(Math.random()*(27-1+6))+5};
				//monster health
				int monLive1 = (int)Math.random()*(25-2+1)+2;
				
				System.out.println("You notice a "+monName[NameChoose]+", do you want to swing at him? (y for yes n for no)");
				String yee = sc.nextLine();
				if(yee.equals("y")){
					System.out.println("You swing at "+monName[NameChoose]+" with your "+weaponName[weaponLv]+ " dealing " + weaponDMG[weaponLv] +" damage.");
					if(weaponDMG[weaponLv] > monLive1){
						System.out.println("You beat the monster and it died, where do you want to go?");
						
					}else{
						//longer way of ending the battle.
						System.out.println("The " + monName[NameChoose]+" hits you for " + monDMG2);
						uHealth = uHealth - (monDMG2-shield);
						//death check
						if(uHealth<0){
							System.out.println("You died.");
							Rm0();
						}else{
							System.out.println("You swing at him with your " + weaponName[weaponLv] + ", doing "+ weaponDMG[weaponLv] +" damage.");
							System.out.println(monName[NameChoose] + " collapses onto the ground, you win the first battle. Where do you want to go?");
						}
					}
				}
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm49();
		}else if (RmNx.equals("e")){
			Rm50();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm49();
		}else if (RmNx.equals("s")){
			Rm51();
		}
	}
	//room 4,-3,2
	public static void Rm50(){

		System.out.println("You almost step into lava. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm48();
		}else if (RmNx.equals("e")){
			Rm50();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm50();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm50();
		}
	}
	//room 5,-3,2
	public static void Rm51(){
		
		System.out.println("You can see the shack in front of you. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm49();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm50();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm50();
		}else if (RmNx.equals("s")){
			Rm52();
		}
	}
	//room 5,-4,2
	public static void Rm52(){
		
		System.out.println("You are in front of the shack. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm51();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm52();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm52();
		}else if (RmNx.equals("s")){
			Rm53();
		}
	}
	//room 4,-5,2
	public static void Rm53(){
		
		System.out.println("You are in the corner. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm53();
		}else if (RmNx.equals("e")){
			Rm54();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm53();
		}else if (RmNx.equals("s")){
			Rm56();
		}
	}
	//room 4,-6,2
	public static void Rm56(){
		
		System.out.println("You are next to the portal. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm53();
		}else if (RmNx.equals("e")){
			Rm55();
		}else if (RmNx.equals("w")){
			System.out.println(Rm_Ex);
			Rm54();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm54();
		}
	}
	//room 5,-6,2
	public static void Rm57(){
		
		System.out.println("You enter the portal. You return to your world and the game is finished.");
		
	}
	//room 5,-5,2
	public static void Rm54(){
		
		System.out.println("There is a portal in front of you. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm52();
		}else if (RmNx.equals("e")){
			Rm55();
		}else if (RmNx.equals("w")){
			Rm53();
		}else if (RmNx.equals("s")){
			Rm57();
		}
	}
	//room 6,-5,2
	public static void Rm55(){
		
		System.out.println("You are still in the shack. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			System.out.println(Rm_Ex);
			Rm55();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm55();
		}else if (RmNx.equals("w")){
			Rm54();
		}else if (RmNx.equals("s")){
			Rm58();
		}
	}
	//room 6,-6,2
	public static void Rm58(){
		
		System.out.println("You are beside the portal. Where do you go?");
		String RmNx = sc.nextLine();
		if(RmNx.equals("n")){
			Rm55();
		}else if (RmNx.equals("e")){
			System.out.println(Rm_Ex);
			Rm58();
		}else if (RmNx.equals("w")){
			Rm57();
		}else if (RmNx.equals("s")){
			System.out.println(Rm_Ex);
			Rm58();
		}
	}

}	