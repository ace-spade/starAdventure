
public class StarAdventure(){
		Scanner sc = new Scanner(System.in);
		String expo1 = ("You are floating through the stars in an escape pod, you look at your holo-display to see an old barge. "
				+ "As you go toward it you notice it has no garbage on it. "
				+ "While floating by, the ship drags you toward its bay doors. ");
		String expo2 = ("Once you are in the ship, your pod is surrounded by people. You have seen their outfits before but can't place where they are from. "
				+ "You open your door to silence. These people are staring at you in shock. After you exit the pod, they wisk you away to the crew deck. " );
		String expo3= ("'Where are you from?', the captain says. You however, have no clue who you are or where you came from. "
				+ "As you look down, you notice you too have a familiar uniform, but it is different and has been wrecked. ");
		String expo4;
		String greet;
		String next;
		String pilotYes;
		String Yee2;
		String Janitor;
		String Janitor2;
		String Crct;
		String Crct2;
		String slugs;
		String death;
		String mmop;
		String wrongMop;
		String Janitor3;
		String Janitor4;
		String engPil;
		String engSte;
		String OldJan;
		String angSte;
		String vNum;
		String appSte;
		String food;
		String food2;
		String food3;
		String kDeath;
		String stuff1;
		String stuff2;
		String stuff3;
		String bombs1;
		String bombs2;
		String bombs3;
		String run1;
		String run2;
		String run3;
		String win;
		String title;
		String aftMark;
		String aftMark2;
		String aftMark3;
		String aftMark4;
		String aftMark5;
		String Rep1;
		String Rep2;
		String Rep3;
		String Rep4;
		String Rep5;
		String Rep6;
		String Rep7;
		String Rep8;
		String Rep9;
		String Rep10;
		String Rep11;
		String Rep12;
		String volcano;
		String gCord;
		String gCord2;
		String gCord3;
		String gCord4;
		String gCord5;
		String brav1;
		String brav2;
		String brav3;
		String brav4;
		String wuss1;
		String wuss2;
		String wuss3;
		String nexDes;
		String wormholee;
		String name;
		String pilot;
		String coord;
		String market;
		String engMop;
		String mopping;
		String contr;
		String JanDec;
		String marDes;
		String coord2;
		String Megoon;
		String coord3;
		
		
		expo4 = ("'I don't know' you say. "
				+ "'Oh, they must have wiped your memory', he says,'Hi, I am Steven and I captain this ship, what do you want to be called?'");
		System.out.println(expo4);
		String CharName = sc.nextLine();
		greet = ("'Hello, " + CharName + " welcome aboard the 'Tater' Steven says. "
				+ "Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar though it has been outfitted nicely with gadgets. "
				+ "You notice your systems from the pod are being added to the ships navigation systems and screen already. ");
		System.out.println(greet);
		next = ("'Do you want to pilot?' Steven asks, what is your response?(use lower caps)");
		System.out.println(next);
		pilot = sc.nextLine();
		
		pilotYes = ("Steven walks you towards the cockpit, 'Try flying the ship', he says as he sits you at the primary controls. "
				+ "As soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
		
		mmop = ("You start to mop the floor, press m to mop");
		death = ("YOU DIED, THE END, THANK YOU FOR PLAYING");
		engSte = ("Steven runs down to the engine room where he sees you at the controls. 'What were you doing?' he yells at you, clearly angry. "
				+ "What do you say, 1: I was performing advanced maneuveres. or 2: I don't know. Please type either 1 or 2. ");
		food2 = ("Eating the food that looks like cake, you realise some very important details, 1: this is 100% not cake. 2: this food tastes weird. "
				+ "It's as if it had been tainted with something rancid. you walk through an alleyway toward the ship, as you do so, you start to feel very dizzy");
		food3 = ("You turn around to see the cook and the server, the cook looks menacing and evil, the server is more remorseful and looks sad" 
				+ "Start to run but your legs can't keep up, you feel like you are running in molasses. You are halfway through the alley when the two catch up to you, ");
		kDeath = ("You can tell they are there becuase you see a ''Sharpened Candy Cane'' go through your chest. ");
		stuff2 = ("You spend 10 credits to get 5 bombs, you continue to walk through the market. "
				+ "You get to the middle of the market. Just as you do, five cloaked figures, each with a similar logo to the one you had, show up. ");
		stuff3 = ("Do you 1: throw your bombs at them. or 2: run away. ");
		bombs2 = ("And the next they were at the feet of some soldiers. "
				+ "Though you decided to run away before the explosion, you could still loudly hear the bombs go off. ");
		bombs3 = ("With the bombs going off, chaos began in the market. "
		+ "People were running, fighting and yelling. " 
				+ "You got lost in the crowd and almost ran into an officer but you luckily made your way back to the ship. ");
		run2 = ("They are nuch faster than you and are quickly on your tail. "
				+ "To get them off your case, you throw a bomb at them. ");
		run3 = ("This seems to work but only because they are getting killed. "
				+ "You finally make your way back to the ship without the figures. ");
		win = ("you win");
		aftMark = ("After the market fiasco, you fly away on your ship, during the downtime as you are flying to the planet Tolaron, you have the opportunity to ask questions about your situation. ");
		aftMark2 = ("'So, what happened before I arrived,' you ask, Steven pipes up, 'There is a war between the Federation and the Republic. The Federation is an oppressive organization that relies on withholding information.' ");
		aftMark3 = ("'The uniform you wore belonged to the federation, we assume something must have happened and you either were wiped of your memories and disposed of or there was an accident.' ");
		aftMark4 = ("'What matters is that they are very evil and have committed horrible acts of violence. We are working with the Republic. We distribute information where we go to get around the massive censorship taking place.' ");
		aftMark5 = ("'Speaking of which, we are going to Republic HQ as we speak.' Steven says, 'They will Catch you up more with what happened when we arrive.' The engines kick into high gear as the ship launches into hyperspeed. ");
		Rep1 = ("As you arrive at Tolaron, you notice the features of the planet. It is comprised mainly of grassy hills and rivers. It is an easy place to hide a organization that is under siege. ");
		Rep2 = ("Hello " + CharName + "'It is a pleasure to meet you, I am commander Rayton.' you see a tall bulky woman who looks like shee invented the concept of boot camp. She is the commander of the Republics 'FootSoldier' division. Who fight specifically on a planet in vehicles or on foot. ");
		Rep3 = ("Commander Rayton leads you into the HeadQuarters, where she parts ways with you and your crew. As you keep walking, you stumble upon the boardroom. Where all major decisions take place, two old gruff men seem to be squabling but you can't tell what it's about. ");
		Rep4 = ("You continue down the round hallway to a row of offices, one says'Dayton Vasques: Information Manager.'. 'We are here,' says Steven, who seems a little on edge about this confrontation. ");
		Rep5 = ("Immediately as you walk in the door, you here someone yell 'Stevie!', You can only assume it is Dayton. 'How is my buddy doing?' asks Vasques who seems overjoyed that this group is here. ");
		Rep6 = ("'You know, Steve and I go way back.' Dayton says. His Brovado beats that of Steven, a feat you didn't know was possible. 'So, you got the intel?' Dayton asks. Steven pulls a small rectangle from his pocket. ");
		Rep7 = ("'Very Good...' says Dayton. inspecting the files. He copies it and transfers another file to the rectangle. 'I need you to distribute this tot the usual area' Dayton says. 'Y'all have a fun time out there. '");
		Rep8 = ("Steven looks demolished as you leave the room. 'One more place to go before we leave...' Steven says, trying to sound excited. though it is obvious he's not. ");
		Rep9 = ("You arrive at the room of the Duff. He supposedly leads the Republic though he rarely leaves his room. He is more of a pupet leader than an actual one. 'Hello, I'm so glad oyu could mae it' says duff. ");
		Rep10 = ("'I have a special mission for you,' Duff says. He's had reports that the Federation is trying to infiltrate the Republic and destroy the organization swiftly and without much consequence, so he wants you to investigate the Federation to see what they are doing. ");
		Rep11 = ("Steven gladly takes the opportunity and the paycheck for the job. As you head out, you wonder what happened before this and if you will ever find it out. but before you get lost in thought, you are in the cockpit ready to go. ");
		Rep12 = ("'we need to go to 685, 8642, 8958' Steven proclaims. ");
		gCord2 = ("when you land on the desert planet, you notice your approach was just off and you overshot the landing. On the second attempt, you stick it and can finally enter the town of Megoon. ");
		gCord3 = ("Megoon is a fairly civilised place, it has some technology and is far from a village in population. You keep walking through back alleys trying to find your destination. You finally see it so you give the guy the rectangle. ");
		gCord4 = ("The guy looks fairly shady but you assume that is what happens when you are trying to thwart the govenment. You are about to walk away when you hear a large explosion about a block away. ");
		gCord5 = ("do you 1: go to the action or 2: run back to the ship. ");
		wuss2 = ("You wait there for five hours but no one shows up. You decide to leave the ship to look for them. You find their bodies dead on the street. It seems they were in the battle and died. ");
		wuss3 = ("You blast back to the HQ. When you explain what happened to Duff. He becomes enraged, turns out his son was on the ship and he is blaming his death on you. He strangles you in that room. ");
		brav2 = ("You see there is a large fight with vehicles being destroyed, and blaster fire is everywhere. You were never given a weapon so look around the roof. You find some bricks, because the fight is in a street. The Federation Officers are mostly stationary. ");
		brav3 = ("You line up your shot and hit the first Officer in the head. Due to the dense brick and the high speed. The Officer was decapitated. The other Officers are suddenly incredibly distracted by what just occured. They stop what they're doing and stare at the body and head, unsure what to do. ");
		brav4 = ("They are an easy target for you to knock out, one by one. With the threat successfully over, you and your crew continue with your business.");
		nexDes = ("Having completed your task. You war to your next destination. 756, 684, 9546 or the asteroid plane of JarGon-A535");
		Yee2 = ("Steven asks you to pilot to coordinates '332, 564, 896'. type them in to warp to star harbour. ");
		Janitor = ("'Well then', Steven says while walking you toward what looks to be a janitors closet"
				+ "Steven hands you a mop and a bucket, 'here you go, this is what you are going to do now' he says. " );
		Janitor2 = ("'I want you to start by mopping the washrooms' Steven says as he brings you to the ship's washroom. " 
				+ "The washrooms are absolutely filthy, 'this is where you will be cleaning today, I expect it to be in amazing condition by the time I come back'");
		Janitor3 = ("Steven comes back,'oh good, i am so glad you finished, now i need you to go to the engine room'"
				+ "You go down to the engine room, the floor is covered in grease, press m to mop");
		Janitor4 = ("As you finish, you see a control panel with what look like ship controls, do you want to use them?");
		wrongMop = ("You died of stupidity for not pressing m");
		Crct = ("You successfully entered the coordinates and landed safely at star harbour. "
				+ "Getting out of the barge, you see the city of star harbour. It is a bustling trade city with few tall buildings and mostly small shacks where people buy and sell anything");
		Crct2 = ("It looks like a market on a much larger scale. " 
				+ "Do you go to the food or the items");
		slugs = ("You entered the wrong coordinates and crashed into a planet wher you were eaten by slugs. ");
		food = ("Due to your busy and active day, you are really hungry, but you don't recognize anything that is being sold here. "
				+ "You finally spot something that looks appetizing, you give the server the 5 credits for it, he looks uneasy, as if something is up, but he goes back to normal before you can ask questions");
		stuff1 = ("Walking through the market, you spot a guy selling bombs. At just 2 credits a piece, they are a steal. ");
		engPil = ("You take control of the ship from the engine room, you seemingly feel like you have done this before. "
				+"You perform multiple acrobatic loops in the air and finally roll the ship a few times. ");
		OldJan = ("You keep being a janitor for the next 50 years. Then you die. ");
		appSte = ("Clearly shocked, Steven says'come with me to the cockpit.'");
		angSte = ("Steven, clearly angry, throws you out of the ship and into open space where you die. ");
		bombs1 = ("It all happened so fast, one moment you had the bombs in your hands. ");
		run1 = ("The figures notice you immediately and start running towards you. ");
		gCord = ("You are heading toward Megoon. A small city on the sandy land of 65-137. While there. You will distribute the new information to several individuals. ");
		volcano = ("When you set your coordinates you feel like you did something wrong. What you did wrong was warp into an active volcano on a lava covered planet. ");
		brav1 = ("You can't quite pin point the location so you run up onto the roof to get a better view. There yuo come upon the battle. ");
		wuss1 = ("You quickly run back back to the ship so you don't join the fight. You hope the crew avoided the fight but you aren't sure. after a while the noise dies down and you believe the fight is over. ");
		wormholee = ("You unfortunately entered the wrong coordinates and wound up entering worm hole to a planet of fiery slugs which burnt and ate you at the same time.");
		
		
		public static void main(String[] args){

			System.out.println("STAR ADVENTURE");
			System.out.println("version 0.7");

			System.out.println(expo1);
			System.out.println(expo2);
			System.out.println(expo3);
			System.out.println(expo4);
			if(CharName.equals("yes")){
				piloot();
			}else{
				janitor();
			
			}
			private void piloot(){
				 

		}
	public static void dirtyMop() {
		System.out.println(janitor3);
	}
		public void coord1(){
			
			System.out.println(Janitor);
			System.out.println(Janitor2);
			System.out.println(mmop);
			String mString = sc.nextLine();
			if (!mString.equals("m")) {
				System.out.println(wrongMop);
			}	
		}
		public void wrongCoord1(){
			System.out.println(slugs);
			System.out.println(death);
			
		}
		public void janitor() {
			System.out.println(Janitor);
			System.out.println(Janitor2);
			System.out.println(mmop);
			String mString = sc.nextLine();
			if (!mString.equals("m")) {
				System.out.println(wrongMop);
			}else{
				engMop();
			}
		}

		if(pilot.equals("yes")){
			piloot();
			
		
		}else{
			janitor();
			
		}

	}

		private static void piloot() {
			// TODO Auto-generated method stub
			System.out.println(pilotYes);
			System.out.println(Yee2);
			String cString = sc.nextLine();
			if(cString.equals("332, 564, 896")){	
				coord1();
			}else{
				wrongCoord1();
			}
			
		}}