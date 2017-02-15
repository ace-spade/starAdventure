package prog;


import java.util.Scanner;
public class Textapp {
	static Scanner sc = new Scanner(System.in);
	static String CharName;
	static String expo1 = ("You are floating through the stars in an escape pod, you look at your holo-display to see an old barge. "
			+ "As you go toward it you notice it has no garbage on it. "
			+ "While floating by, the ship drags you toward its bay doors. ");
	static String expo2 = ("Once you are in the ship, your pod is surrounded by people. You have seen their outfits before but can't place where they are from. "
			+ "You open your door to silence. These people are staring at you in shock. After you exit the pod, they wisk you away to the crew deck. " );
	static String expo3 = ("'Where are you from?', the captain says. You however, have no clue who you are or where you came from. "
			+ "As you look down, you notice you too have a familiar uniform, but it is different and has been wrecked. ");
	static String expo4 = ("'I don't know' you say. "
			+ "'Oh, they must have wiped your memory', he says,'Hi, I am Steven and I captain this ship, what do you want to be called?'");
	static String greet = ("'Hello, ");
	static String greet2 = (" welcome aboard the 'Tater' Steven says. "
			+ "Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar though it has been outfitted nicely with gadgets. "
			+ "You notice your systems from the pod are being added to the ships navigation systems and screen already. ");
			
	static String next = ("'Do you want to pilot?' Steven asks, what is your response?(use lower caps)");
	
	static String pilotYes = ("Steven walks you towards the cockpit, 'Try flying the ship', he says as he sits you at the primary controls. "
			+ "As soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
	
	static String mmop = ("You start to mop the floor, press m to mop");
	static String death = ("YOU DIED, THE END, THANK YOU FOR PLAYING");
	static String engSte = ("Steven runs down to the engine room where he sees you at the controls. 'What were you doing?' he yells at you, clearly angry. "
			+ "What do you say, 1: I was performing advanced maneuveres. or 2: I don't know. Please type either 1 or 2. ");
	static String food = ("Due to your busy and active day, you are really hungry, but you don't recognize anything that is being sold here. "
			+ "You finally spot something that looks appetizing, you give the server the 5 credits for it, he looks uneasy, as if something is up, but he goes back to normal before you can ask questions");
	
	static String food2 = ("Eating the food that looks like cake, you realise some very important details, 1: this is 100% not cake. 2: this food tastes weird. "
			+ "It's as if it had been tainted with something rancid. you walk through an alleyway toward the ship, as you do so, you start to feel very dizzy");
	static String food3 = ("You turn around to see the cook and the server, the cook looks menacing and evil, the server is more remorseful and looks sad" 
			+ "Start to run but your legs can't keep up, you feel like you are running in molasses. You are halfway through the alley when the two catch up to you, ");
	static String kDeath = ("You can tell they are there becuase you see a ''Sharpened Candy Cane'' go through your chest. ");
	static String stuff1 = ("Walking through the market, you spot a guy selling bombs. At just 2 credits a piece, they are a steal. ");
	
	static String stuff2 = ("You spend 10 credits to get 5 bombs, you continue to walk through the market. "
			+ "You get to the middle of the market. Just as you do, five cloaked figures, each with a similar logo to the one you had, show up. ");
	static String stuff3 = ("Do you 1: throw your bombs at them. or 2: run away. ");
	static String bombs1 = ("It all happened so fast, one moment you had the bombs in your hands. ");
	static String bombs2 = ("And the next they were at the feet of some soldiers. "
			+ "Though you decided to run away before the explosion, you could still loudly hear the bombs go off. ");
	static String bombs3 = ("With the bombs going off, chaos began in the market. "
	+ "People were running, fighting and yelling. " 
			+ "You got lost in the crowd and almost ran into an officer but you luckily made your way back to the ship. ");
	static String run1 = ("The figures notice you immediately and start running towards you. ");
	
	static String run2 = ("They are nuch faster than you and are quickly on your tail. "
			+ "To get them off your case, you throw a bomb at them. ");
	static String run3 = ("This seems to work but only because they are getting killed. "
			+ "You finally make your way back to the ship without the figures. ");
	static String win = ("you win");
	static String aftMark = ("After the market fiasco, you fly away on your ship, during the downtime as you are flying to the planet Tolaron, you have the opportunity to ask questions about your situation. ");
	static String aftMark2 = ("'So, what happened before I arrived,' you ask, Steven pipes up, 'There is a war between the Federation and the Republic. The Federation is an oppressive organization that relies on withholding information.' ");
	static String aftMark3 = ("'The uniform you wore belonged to the federation, we assume something must have happened and you either were wiped of your memories and disposed of or there was an accident.' ");
	static String aftMark4 = ("'What matters is that they are very evil and have committed horrible acts of violence. We are working with the Republic. We distribute information where we go to get around the massive censorship taking place.' ");
	static String aftMark5 = ("'Speaking of which, we are going to Republic HQ as we speak.' Steven says, 'They will Catch you up more with what happened when we arrive.' The engines kick into high gear as the ship launches into hyperspeed. ");
	static String Rep1 = ("As you arrive at Tolaron, you notice the features of the planet. It is comprised mainly of grassy hills and rivers. It is an easy place to hide a organization that is under siege. ");
	static String Rep2 = ("'Hello ");
	static String Repdos = (" It is a pleasure to meet you, I am commander Rayton.' you see a tall bulky woman who looks like shee invented the concept of boot camp. She is the commander of the Republics 'FootSoldier' division. Who fight specifically on a planet in vehicles or on foot. ");
	static String Rep3 = ("Commander Rayton leads you into the HeadQuarters, where she parts ways with you and your crew. As you keep walking, you stumble upon the boardroom. Where all major decisions take place, two old gruff men seem to be squabling but you can't tell what it's about. ");
	static String Rep4 = ("You continue down the round hallway to a row of offices, one says'Dayton Vasques: Information Manager.'. 'We are here,' says Steven, who seems a little on edge about this confrontation. ");
	static String Rep5 = ("Immediately as you walk in the door, you here someone yell 'Stevie!', You can only assume it is Dayton. 'How is my buddy doing?' asks Vasques who seems overjoyed that this group is here. ");
	static String Rep6 = ("'You know, Steve and I go way back.' Dayton says. His Brovado beats that of Steven, a feat you didn't know was possible. 'So, you got the intel?' Dayton asks. Steven pulls a small rectangle from his pocket. ");
	static String Rep7 = ("'Very Good...' says Dayton. inspecting the files. He copies it and transfers another file to the rectangle. 'I need you to distribute this tot the usual area' Dayton says. 'Y'all have a fun time out there. '");
	static String Rep8 = ("Steven looks demolished as you leave the room. 'One more place to go before we leave...' Steven says, trying to sound excited. though it is obvious he's not. ");
	static String Rep9 = ("You arrive at the room of the Duff. He supposedly leads the Republic though he rarely leaves his room. He is more of a pupet leader than an actual one. 'Hello, I'm so glad you could mae it' says duff. ");
	static String Rep10 = ("'I have a special mission for you,' Duff says. He's had reports that the Federation is trying to infiltrate the Republic and destroy the organization swiftly and without much consequence, so he wants you to investigate the Federation to see what they are doing. ");
	static String Rep11 = ("Steven gladly takes the opportunity and the paycheck for the job. As you head out, you wonder what happened before this and if you will ever find it out. but before you get lost in thought, you are in the cockpit ready to go. ");
	static String Rep12 = ("'we need to go to 685, 8642, 8958' Steven proclaims. ");
	static String gCord2 = ("when you land on the desert planet, you notice your approach was just off and you overshot the landing. On the second attempt, you stick it and can finally enter the town of Megoon. ");
	static String gCord3 = ("Megoon is a fairly civilised place, it has some technology and is far from a village in population. You keep walking through back alleys trying to find your destination. You finally see it so you give the guy the rectangle. ");
	static String gCord4 = ("The guy looks fairly shady but you assume that is what happens when you are trying to thwart the govenment. You are about to walk away when you hear a large explosion about a block away. ");
	static String gCord5 = ("do you 1: go to the action or 2: run back to the ship. ");
	static String wuss1 = ("You quickly run back back to the ship so you don't join the fight. You hope the crew avoided the fight but you aren't sure. after a while the noise dies down and you believe the fight is over. ");
	
	static String wuss2 = ("You wait there for five hours but no one shows up. You decide to leave the ship to look for them. You find their bodies dead on the street. It seems they were in the battle and died. ");
	static String wuss3 = ("You blast back to the HQ. When you explain what happened to Duff. He becomes enraged, turns out his son was on the ship and he is blaming his death on you. He strangles you in that room. ");
	static String brav1 = ("You can't quite pin point the location so you run up onto the roof to get a better view. There yuo come upon the battle. ");
	
	static String brav2 = ("You see there is a large fight with vehicles being destroyed, and blaster fire is everywhere. You were never given a weapon so look around the roof. You find some bricks, because the fight is in a street. The Federation Officers are mostly stationary. ");
	static String brav3 = ("You line up your shot and hit the first Officer in the head. Due to the dense brick and the high speed. The Officer was decapitated. The other Officers are suddenly incredibly distracted by what just occured. They stop what they're doing and stare at the body and head, unsure what to do. ");
	static String brav4 = ("They are an easy target for you to knock out, one by one. With the threat successfully over, you and your crew continue with your business.");
	static String nexDes = ("Having completed your task. You war to your next destination. 756, 684, 9546 or the asteroid plane of JarGon-A535");
	static String Crct = ("You successfully entered the coordinates and landed safely at star harbour. "
			+ "Getting out of the barge, you see the city of star harbour. It is a bustling trade city with few tall buildings and mostly small shacks where people buy and sell anything");
	static String Crct2 = ("It looks like a market on a much larger scale. " 
			+ "Do you go to the food or the items");
	static String slugs = ("You entered the wrong coordinates and crashed into a planet wher you were eaten by slugs. ");
	static String Janitor1 = ("'Well then', Steven says while walking you toward what looks to be a janitors closet"
			+ "Steven hands you a mop and a bucket, 'here you go, this is what you are going to do now' he says. " );
	
	static String Janitor2 = ("'I want you to start by mopping the washrooms' Steven says as he brings you to the ship's washroom. " 
			+ "The washrooms are absolutely filthy, 'this is where you will be cleaning today, I expect it to be in amazing condition by the time I come back'");
	
	static String Janitor3 = ("Steven comes back,'oh good, i am so glad you finished, now i need you to go to the engine room'"
			+ "You go down to the engine room, the floor is covered in grease, press m to mop");
	static String Janitor4 = ("As you finish, you see a control panel with what look like ship controls, do you want to use them?");
	static String Yee2 = ("Steven asks you to pilot to coordinates '332, 564, 896'. type them in to warp to star harbour. ");
	static String wrongMop = ("You died of stupidity for not pressing m");
	static String engPil = ("You take control of the ship from the engine room, you seemingly feel like you have done this before. "
			+ "You perform multiple acrobatic loops in the air and finally roll the ship a few times. ");
	static String OldJan = ("You keep being a janitor for the next 50 years. Then you die. ");
	static String appSte = ("Clearly shocked, Steven says'come with me to the cockpit.'");
	static String angSte = ("Steven, clearly angry, throws you out of the ship and into open space where you die. ");
	static String volcano = ("When you set your coordinates you feel like you did something wrong. What you did wrong was warp into an active volcano on a lava covered planet. ");
	static String gCord = ("You are heading toward Megoon. A small city on the sandy land of 65-137. While there. You will distribute the new information to several individuals. ");
	static String wormholee = ("You unfortunately entered the wrong coordinates and wound up entering worm hole to a planet of fiery slugs which burnt and ate you at the same time.");
	static String Jarg = ("You successfully input the correct coordinates and are soon heading toward the system of JarGon-A535. On the way there, you have some down time. Through this you meet Klarth, a Jumpyman from the planet Gremulone, he seems normal enough and has an extensive music collection. You bond over a Gremuloin pop song called Pocket Angel, It's a synth heavy tune with bright vocals. Having lunch together, you both talk about what each of your want to dow when you finish work on the 'Tater. ");
	static String Joey = ("As the two of you are deep in conversation, a short lanky man with thick glasses and freckles joins you at the table. 'Hi, I am Joey.' the freak says, you don't think you've seen this person before. ");
	static String Joey2 = ("Joey starts talking about similar things as you and Klarth. As it turns out, Joey is actually a pretty cool guy. He is well known among gunners as an accurate shot. ");
	static String Joey3 = ("After Talking up a storm, you all agree to join up once each of you has finished working on the 'Tater. Soon enough, it is time to land. ");
	static String JargLand = ("As you land, you start hearing sirens, it seems there is a battle going on between the Federation and a group of local guerillas called Yarma. When your ship docks, blaster fire is heard as a few Yarmas board the ship. ");
	static String JargTake = ("'Get outta Here!' yells a very tense man, you haven't a clue who he is or what is going on. You gun it and the ship takes off at max speed. This is very uncommon and is almost unheard of but you didn't want to anger the already agitated man behind you. ");
	static String Aster = ("You blast out of the space port and into the asteroid plane, you need to steer the ship to avoid asteroids. Press a to go left, w to go up, d to go right and s to go down. There is an asteroid above you and another to your left. ");
	static String Ast2 = ("You avoided the first couple. but now there is one to your left, right and below you. ");
	static String Ast3 = ("Still making your way through, notice a bunch of Fed Fighters are getting destroyed by the asteroid field. You smirk but not for too long as you see another three asteroids to your right, top and bottom.");
	static String Ast4 = ("You finally make it out of the field and start going back to Republic HQ. ");
	static String aDeath = ("You careened into an asteroid and killed everyone aboard. Great Job.");
	static String HQ1 = ("You land back on Tolarion, at the entrance stands Duff. Who looks stern yet relieved you made it in one piece. 'Do you have the Intel?' Duff asks the angry Yarma man. He pulls out a disk, on it is a folder with family pictures, a pirated tv show, a club remix by pisa 66 of their hit song we are green. There is also a folder called backdoors, in it, there are many different usernames and passwords. ");
	static String HQ2 = ("Duff looks at The disk and quickly puts it in his desk. 'Thank you vey much, I will see more of you later.'");
	public static void main(String[] args){
		
		System.out.println("STAR ADVENTURE");
		System.out.println("version 0.7");
		beginMeth();
	}
	public static void beginMeth(){

		System.out.println(expo1);
		System.out.println(expo2);
		System.out.println(expo3);
		System.out.println(expo4);
		CharName = sc.nextLine();
		System.out.println(greet + CharName + greet2);
		System.out.println(next);
		String pResp = sc.nextLine();
		if(pResp.equals("yes")){
			pilotMeth();
		}else{
			janMeth();
		}
		
	}
	public static void pilotMeth(){
		System.out.println(pilotYes);
		System.out.println(Yee2);
		String coord1 = sc.nextLine();
		if(coord1.equals("332, 564, 896")){
			coordCr();
		}else{
			System.out.println(slugs);
			System.out.println(death);
		}
	}
	public static void janMeth(){
		System.out.println(Janitor1);
		System.out.println(Janitor2);
		System.out.println(mmop);
		String mString = sc.nextLine();
		if(mString.equals("m")){
			engMop();
		}else{
			System.out.println(wrongMop);
			System.out.println(death);
		}
	}
	public static void coordCr(){
		System.out.println(Crct);
		System.out.println(Crct2);
		String anMark = sc.nextLine();
		if(anMark.equals("food")){
			market();
		}else{
			marketdos();
		}
	}
	public static void market(){
		System.out.println(food);
		System.out.println(food2);
		System.out.println(food3);
		System.out.println(kDeath);
		System.out.println(death);
	}
	public static void marketdos(){
		System.out.println(stuff1);
		System.out.println(stuff2);
		System.out.println(stuff3);
		String sString = sc.nextLine();
		if(sString.equals("1")){
			System.out.println(bombs1);
			System.out.println(bombs2);
			System.out.println(bombs3);
			System.out.println(aftMark);
			System.out.println(aftMark2);
			System.out.println(aftMark3);
			System.out.println(aftMark4);
			System.out.println(aftMark5);
			System.out.println(Rep1);
			System.out.println(Rep2 + CharName + Repdos);
			System.out.println(Rep3);
			System.out.println(Rep4);
			System.out.println(Rep5);
			System.out.println(Rep6);
			System.out.println(Rep7);
			System.out.println(Rep8);
			System.out.println(Rep9);
			System.out.println(Rep10);
			System.out.println(Rep11);
			System.out.println(Rep12);
			String coord2 = sc.nextLine();
			if(coord2.equals("685, 8642, 8958")){
				System.out.println(gCord);
				System.out.println(gCord2);
				System.out.println(gCord3);
				System.out.println(gCord4);
				System.out.println(gCord5);
				String mString = sc.nextLine();
				if(mString.equals("1")){
					brave();
				}else{
					wimp();
				}
			}else{
				System.out.println(volcano);
				System.out.println(death);
			}
		}else{
			System.out.println(run1);
			System.out.println(run2);
			System.out.println(run3);
			System.out.println(aftMark);
			System.out.println(aftMark2);
			System.out.println(aftMark3);
			System.out.println(aftMark4);
			System.out.println(aftMark5);
			System.out.println(Rep1);
			System.out.println(Rep2);
			System.out.println(Rep3);
			System.out.println(Rep4);
			System.out.println(Rep5);
			System.out.println(Rep6);
			System.out.println(Rep7);
			System.out.println(Rep8);
			System.out.println(Rep9);
			System.out.println(Rep10);
			System.out.println(Rep11);
			System.out.println(Rep12);
			String coord2 = sc.nextLine();
			if(coord2.equals("685, 8642, 8958")){
				System.out.println(gCord);
				System.out.println(gCord2);
				System.out.println(gCord3);
				System.out.println(gCord4);
				System.out.println(gCord5);
				String mString = sc.nextLine();
				if(mString.equals("1")){
					brave();
				}else{
					wimp();
				}
			}else{
				System.out.println(volcano);
				System.out.println(death);
			}
		}
		
	}
	public static void engMop(){
		System.out.println(Janitor3);
		String mString = sc.nextLine();
		if(!mString.equals("m")){
			System.out.println(wrongMop);
			System.out.println(death);
		}else{
			System.out.println(Janitor4);
			String eString = sc.nextLine();
			if(eString.equals("yes")){
				enPil();
			}else{
				old();
			}
		}
	}
	public static void enPil(){
		System.out.println(engPil);
		System.out.println(engSte);
		String JanDec = sc.nextLine();
		if(JanDec.equals("1")){
			System.out.println(appSte);
			pilotMeth();
		}else{
			System.out.println(angSte);
			System.out.println(death);
		}
	}
	public static void old(){
		
		System.out.println(OldJan);
		System.out.println(death);
	}
	public static void brave(){
		System.out.println(brav1);
		System.out.println(brav2);
		System.out.println(brav3);
		System.out.println(brav4);
		System.out.println(nexDes);
		String coord3 = sc.nextLine();
		if(coord3.equals("756, 684, 9546")){
			jarg();
		}else{
			System.out.println(wormholee);
			System.out.println(death);
		}
	}
	public static void jarg(){
		System.out.println(Jarg);
		System.out.println(Joey);
		System.out.println(Joey2);
		System.out.println(Joey3);
		System.out.println(JargLand);
		System.out.println(JargTake);
		System.out.println(Aster);
		String aString = sc.nextLine();
		if (aString.equals("s") || aString.equals("d")) {
			System.out.println(Ast2);
			String nString = sc.nextLine();
			if(nString.equals("w")){

				System.out.println(Ast3);
				String dString = sc.nextLine();
				if (dString.equals("a")) {
					System.out.println(Ast4);
					System.out.println(HQ1);
					System.out.println(HQ2);
				}else{

					System.out.println(aDeath);
					System.out.println(death);
				}
			}else{
				System.out.println(aDeath);
				System.out.println(death);
			}
		}else{System.out.println(aDeath);
		System.out.println(death);
		}
	}
	public static void wimp(){
		System.out.println(wuss1);
		System.out.println(wuss2);
		System.out.println(wuss3);
		System.out.println(death);
	}
}		
		
			