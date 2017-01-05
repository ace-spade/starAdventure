

import java.io.Serializable;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.String;
import com.sun.webkit.ThemeClient;

public class StarAdventure implements Serializable {

	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("You are floating through the stars in an escape chamber, you look at your holo-display to see an old barge."); 
	System.out.println("As you go toward it you notice it has no garbage on it. "
	+ "While floating by, the ship drags you toward its bay doors.");
	System.out.println("Once you are in the ship, your chamber is surrounded by people,you have seen their outfits before.");
	System.out.println("You open your door to silence, the people are staring at you and after you exit the chamber, wisk you away to the crew deck.");
	System.out.println("'Where are you from?', the captain says, you have no clue who you are or where you came from.");
	System.out.println("As you look down, you notice you have a familiar uniform, but it has been town and it looks vandalised. ");
	System.out.println("'I don't know' you say.");
	System.out.println("'oh, they must have wiped your memory', he says,'Hi, I am Steven and I captain this ship, what is your name?' ");
	
	String name = in.nextLine();
	System.out.println("'Hello, " + name + " welcome aboard the 'Tater' Steven says.");
	System.out.println("Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar, it has plenty of hi-tech systems though.");
	System.out.println("you notice your systems from the chamber being added to the ships navigation systems and screen.");
	
	
	System.out.println("'do you want to pilot?' Steven asks, what is your response?");
	String pilot = in.nextLine();
	if(pilot.equals("yes")){
		
		System.out.println("Steven walks you towards the cockpit, 'try flying the ship', he says as he sits you at the primary controls");
		System.out.println("as soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
		System.out.println("everyone not already strapped in is flung across the ship and several technichians are very angry.");
		System.out.println("steven asks you to pilot to coordinates '332,564,896'. type them in to warp to star harbour.");
		String coord = in.nextLine();
		
		if(coord.equals("332, 564, 896")){
			System.out.println("you successfully entered the coordinates and landed safely at star harbour.");
			
		}else{
			"you entered the wrong coordinates and crashed into a planet wher you were eaten by slugs." }
	}
	
	}
	else if(pilot.equals("no")){
	System.out.println("'well then', Steven says while walking you toward what looks to be a janitors closet");
	System.out.println("Steven hands you a mop and a bucket, 'here you go, this is what you are going to do now' he says.");
	System.out.println("'I want you to start by mopping the washrooms' Steven says as he brings you to the ship's washroom.");
	System.out.println("the washrooms are absolutely filthy, 'this is where you will be cleaning today, I expect it to be in amazing condition by the time I come back'");
	System.out.println("you start to mop the floor, press m to mop");
	String M = in.nextLine()
	}else{
		System.out.println("I did not understand what you said, please try again.");
		String pilot2 =in.nextLine();
		if(pilot2.equals("yes")){}
		else if(pilot2.equals("no")){
			
		}else{
			System.out.println("sorry, i didn't understand what you said and since the programmer is lazy, i will shut down now instead of trying again.");
		}
	}
	private static final long serialVersionUID = 1L;
}
