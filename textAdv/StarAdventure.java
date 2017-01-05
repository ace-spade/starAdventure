

import java.io.Serializable;
import java.util.Scanner;

public class StarAdventure implements Serializable {
	/**
	 * 
	 */
	

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
		sysout
	}
	else if(pilot.equals("no")){
		
	}else{
		System.out.println("I did not understand what you said, please try again.");
		String pilot2 =in.nextLine();
		if(pilot.equals("yes")){}
		else if(pilot.equals("no")){
			
		}
	}
	}
	private static final long serialVersionUID = 1L;
}
