

import java.io.Serializable;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.webkit.ThemeClient;

public class StarAdventure implements Serializable {

	public static void main(String[] args){
		static Scanner in = new Scanner(System.in);
		public static void main(String[] args){
			
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
		public static void expo() {
			//beginning
					System.out.println("You are floating through the stars in an escape chamber, you look at your holo-display to see an old barge."); 
					System.out.println("As you go toward it you notice it has no garbage on it. "
					+ "While floating by, the ship drags you toward its bay doors.");
					System.out.println("Once you are in the ship, your chamber is surrounded by people,you have seen their outfits before.");
					System.out.println("You open your door to silence, the people are staring at you and after you exit the chamber, wisk you away to the crew deck.");
					System.out.println("'Where are you from?', the captain says, you have no clue who you are or where you came from.");
					System.out.println("As you look down, you notice you have a familiar uniform, but it has been town and it looks vandalised. ");
					System.out.println("'I don't know' you say.");
					System.out.println("'oh, they must have wiped your memory', he says,'Hi, I am Steven and I captain this ship, what is your name?' ");
					//player enters name
					String name = in.nextLine();
					System.out.println("'Hello, " + name + " welcome aboard the 'Tater' Steven says.");
					System.out.println("Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar, it has plenty of hi-tech systems though.");
					System.out.println("you notice your systems from the chamber being added to the ships navigation systems and screen.");
		}
		public static void engpil() {
			System.out.println("you take control of the ship from the engine room, immediately the memories of flying ships come back to you");
			System.out.println("you perform multiple acrobatic loops in the air and finally roll the ship a few times");
			System.out.println("Steven Runs down to the engine room where he sees you at the controls'what were you doing?' he yells at you, clearly angry");
		System.out.println("what do you say, 1: I was performing advanced maneuveres. or 2: I don't know. please type either 1 or 2 ");
		int EngDes = in.nextInt();
		if(EngDes == 1){
			System.out.println("clearly shocked, Steven says'come with me to the cockpit'");
			pilot();
		}else{
			System.out.println("Steven, clearly angry, throws you out of the ship and into open space where you die. the end, thank you for playing.");
		}
		}
		public static void pilot(){
			System.out.println("Steven walks you towards the cockpit, 'try flying the ship', he says as he sits you at the primary controls");
			System.out.println("as soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
			System.out.println("everyone not already strapped in is flung across the ship and several technichians are very angry.");
			System.out.println("steven asks you to pilot to coordinates '332, 564, 896'. type them in to warp to star harbour.");
			String coord = in.nextLine();
			//coordinates
			if(coord.equals("332, 564, 896")){
				System.out.println("you successfully entered the coordinates and landed safely at star harbour.");
				System.out.println("getting out of the barge, you see the city of far harbour. It is a bustling trade city with few tall buildings and mostly small shacks where people buy and sell anything");
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
				System.out.println("you entered the wrong coordinates and crashed into a planet wher you were eaten by slugs. the end, thank you for playing"); 	
			}
			
		}
		public static void food(){}
		public static void items(){}
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
				System.out.println("you keep this routine for the next 50 years under different captains until you die, the end. thank you for playing");
			}
		}
		public static void altpil() {
	private static final long serialVersionUID = 1L;
}
