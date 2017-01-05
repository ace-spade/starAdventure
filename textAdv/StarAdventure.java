

import java.io.Serializable;
import java.util.Scanner;


public class StarAdventure implements Serializable {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException{
		
		expo();
		
		//first big decision
		System.out.println("'do you want to pilot?' Steven asks, what is your response?");
		String pilot = in.nextLine();
		
		//if yes
		if(pilot.equals("yes")){
			pilot();	
		}
		//if no
		else if(pilot.equals("no")){
			janitor();
		//if other
		}else{
			altpil();
		}
	//method
	}
	//done
	public static void expo() throws InterruptedException {
				System.out.println("You are floating through the stars in an escape pod, you look at your holo-display to see an old barge."); 
				Thread.sleep(2000);
				System.out.println("As you go toward it you notice it has no garbage on it. "
				+ "While floating by, the ship drags you toward its bay doors.");
				Thread.sleep(2000);
				System.out.println("Once you are in the ship, your pod is surrounded by people. You have seen their outfits before but can't place where they are from.");
				System.out.println("You open your door to silence. These people are staring at you in shock. After you exit the pod, they wisk you away to the crew deck.");
				Thread.sleep(2000);
				System.out.println("'Where are you from?', the captain says. You however, have no clue who you are or where you came from.");
				System.out.println("As you look down, you notice you too have a familiar uniform, but it is different and has been wrecked. ");
				System.out.println("'I don't know' you say.");
				Thread.sleep(2000);
				System.out.println("'Oh, they must have wiped your memory', he says,'Hi, I am Steven and I captain this ship, what is your name?' ");
		 
		 //player enters name
				String name = in.nextLine();
				System.out.println("'Hello, " + name + " welcome aboard the 'Tater' Steven says.");
				System.out.println("Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar though it has been outfitted nicely with gadgets.");
				System.out.println("You notice your systems from the pod are being added to the ships navigation systems and screen already.");
	}
	//done
	public static void engpil() {
		System.out.println("You take control of the ship from the engine room, you seemingly feel like you have done this before.");
		System.out.println("You perform multiple acrobatic loops in the air and finally roll the ship a few times.");
		System.out.println("Steven runs down to the engine room where he sees you at the controls. 'What were you doing?' he yells at you, clearly angry.");
	System.out.println("What do you say, 1: I was performing advanced maneuveres. or 2: I don't know. Please type either 1 or 2.");
	int EngDes = in.nextInt();
	if(EngDes == 1){
		System.out.println("Clearly shocked, Steven says'come with me to the cockpit.'");
		pilot();
	}else{
		System.out.println("Steven, clearly angry, throws you out of the ship and into open space where you die.");

		System.out.println("YOU DIED, THE END, THANK YOU FOR PLAYING");
	}
	}
	//done
	public static void pilot(){
		System.out.println("Steven walks you towards the cockpit, 'Try flying the ship', he says as he sits you at the primary controls.");
		System.out.println("As soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
		System.out.println("Everyone not already strapped in is flung across the ship and several technichians are very angry.");
		System.out.println("Steven asks you to pilot to coordinates '332, 564, 896'. type them in to warp to star harbour.");
		String coord = in.nextLine();
		//coordinates
		if(coord.equals("332, 564, 896")){
			System.out.println("you successfully entered the coordinates and landed safely at star harbour.");
			System.out.println("getting out of the barge, you see the city of star harbour. It is a bustling trade city with few tall buildings and mostly small shacks where people buy and sell anything");
			System.out.println("it looks like a market on a much larger scale.");
			System.out.println("do you go to the food or the items");
			String market = in.nextLine();
			if(market.equals("food")){
				food();
			}
			else if(market.equals("items")){
				items();
			}
			else{
				
				System.out.println("I didn't quite catch that, please try again.");
				market = in.nextLine();
				
			}
		}
		else{
			//incorrect
			System.out.println("you entered the wrong coordinates and crashed into a planet wher you were eaten by slugs.");

					System.out.println("YOU DIED, THE END, THANK YOU FOR PLAYING"); 	
		}
		
	}
	//not done
	public static void food(){
		System.out.println("due to your busy and active day, you are really hungry, but you don't recognize anything that is being sold here. ");
		System.out.println("you finally spot something that looks appetizing, you give the server the 5 credits for it, he looks uneasy, as if something is up, but he goes back to normal before you can ask questions");
		System.out.println("eating the food that looks like cake, you realise some very important details, 1: this is 100% not cake. 2: this food tastes weird.");
		System.out.println("its as if it had been tainted with something rancid. you walk through an alleyway toward the ship, as you do so, you start to feel very dizzy");
		System.out.println("you turn around to see the cook and the server, the cook looks menacing and evil, the server is more remorseful and looks sad");
		System.out.println("start to run but your legs can't keep up, you feel like you are running in molasses. you are halfway through the alley when the two catch up to you");
		System.out.println("you can tell they are there becuase you see a knife go through your chest. ");
		System.out.println("YOU DIED. THE END, THANKS FOR PLAYING");
	}
	//not done
	public static void items(){
		System.out.println("Walking through the market, you spot a guy selling bombs. At just 2 credits a piece, they are a steal.");
		System.out.println("you spend 10 credits to get 5 bombs, you continue to walk through the market.");
		System.out.println("You get to the middle of the market. Just as you do, five cloaked figures, each with a similar logo to the one you had, show up.");
		System.out.println("do you 1: throw your bombs at them. or 2: run away.");
		int markBom = in.nextInt();
		if(markBom == 1){
			bombs();
		}else{
			running();
		}
	
	}
	//done
	public static void janitor(){

		System.out.println("'well then', Steven says while walking you toward what looks to be a janitors closet");
		System.out.println("Steven hands you a mop and a bucket, 'here you go, this is what you are going to do now' he says.");
		System.out.println("'I want you to start by mopping the washrooms' Steven says as he brings you to the ship's washroom.");
		System.out.println("the washrooms are absolutely filthy, 'this is where you will be cleaning today, I expect it to be in amazing condition by the time I come back'");
		System.out.println("you start to mop the floor, press m to mop");
		for(int i = 0; i<20; i++){
		String M = in.nextLine();
		if(M.equals("m")){}else{System.out.println("try a lower case m");}
		System.out.println("keep pressing m");
		}
		System.out.println("Steven comes back,'oh good, i am so glad you finished, now i need you to go to the engine room'");
		System.out.println("you go down to the engine room, the floor is covered in grease, press m to mop");
		for(int i = 0; i<20; i++){
			String M = in.nextLine();
			if(M.equals("m")){}else{System.out.println("try a lower case m");}
			System.out.println("keep pressing m");
		}System.out.println("as you finish, you see a control panel with what look like ship controls, do you want to use them?");
		//chance to change ending
		String eng = in.nextLine();
		//if yes
		if(eng.equals("yes")){
			pilot();
		}
		
		//if no
		else{
			for(int i = 0; i<5; i++){
			System.out.println("as you walk back to the control room, Steven confronts you, 'hey', he says,'I need you to clean the bedrooms, someone puked in their sleep.");
			System.out.println("you immediately see where the mess was made as you enter the washrooms, it is all over the place press m to mop");
			for(int l = 0; l<20; l++){
				String M = in.nextLine();
				if(M.equals("m")){}else{System.out.println("try a lower case m");}
				System.out.println("keep pressing m");
				}
			System.out.println("Steven walks toward you as you close the door to the bedrooms, 'someone took a huge dump in the washroom again, I'm afraid you will need to reclean it.");
			System.out.println("you get to the washroom and Steven was underestimating the amount of excrement in the washroom, it is on the walls and even the sink. press m to mop");
			for(int j = 0; j<20; j++){
				String M = in.nextLine();
				if(M.equals("m")){}else{System.out.println("try a lower case m");}
				System.out.println("keep pressing m");
			}System.out.println("having taken care of the floors, you turn to the sink, press s to scrub");
			for(int j = 0; j<20; j++){
				String M = in.nextLine();
				if(M.equals("s")){}else{System.out.println("try a lower case s");}
				System.out.println("keep pressing s");
				}
			}
			System.out.println("you keep this routine for the next 50 years under different captains until you die.");
			System.out.println("YOU DIED, THE END, THANK YOU FOR PLAYING");
		}
	}
	//done
	public static void altpil() {
		while(true){
			System.out.println("I did not understand what you said, please try again.");
			String pilot2 =in.nextLine();
			if(pilot2.equals("yes")){
				pilot();
			}else if(pilot2.equals("no")){
				janitor();
			}else{
			}
		}
	}
	public static void bombs(){
		System.out.println("It all happened so fast, one moment you had the bombs in your hands.");
		System.out.println("And the next they were at the feet of some soldiers.");
		System.out.println("Though you decided to run away before the explosion, you could still loudly hear the bombs go off.");
		System.out.println("With the bombs going off, chaos began in the market.");
		System.out.println("people were running, fighting and yelling.");
		System.out.println("You got lost in the crowd and almost ran into an officer but you luckily made your way back to the ship.");
		System.out.println("you win");
		
	}
	public static void running(){
		System.out.println("The figures notice you immediately and start running towards you.");
		System.out.println("They are nuch faster than you and are quickly on your tail.");
		System.out.println("To get them off your case, you throw a bomb at them.");
		System.out.println("this seems to work but only because they are getting killed.");
		System.out.println("you finally make your way back to the ship without the figures");
		System.out.println("you win");
	}
	private static final long serialVersionUID = 1L;
}
