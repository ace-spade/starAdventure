

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
public class TextApp extends JFrame{
	JButton click;
	String CharName;
	String pString;
	private JLabel expo1;
	private JLabel expo2;
	private JLabel expo3;
	private JLabel expo4;
	private JLabel greet;
	private JLabel next;
	private JLabel pilotYes;
	private JLabel Yee2;
	private JLabel Janitor;
	private JLabel Janitor2;
	private JLabel Crct;
	private JLabel Crct2;
	private JLabel slugs;
	private JLabel death;
	private JLabel mmop;
	private JLabel wrongMop;
	private JLabel Janitor3;
	private JLabel Janitor4;
	private JLabel engPil;
	private JLabel engSte;
	private JLabel OldJan;
	private JLabel angSte;
	private JLabel vNum;
	private JLabel appSte;
	private JLabel food;
	private JLabel food2;
	private JLabel food3;
	private JLabel kDeath;
	private JLabel stuff1;
	private JLabel stuff2;
	private JLabel stuff3;
	private JLabel bombs1;
	private JLabel bombs2;
	private JLabel bombs3;
	private JLabel run1;
	private JLabel run2;
	private JLabel run3;
	private JLabel win;
	private JLabel title;
	private JLabel aftMark;
	private JLabel aftMark2;
	private JLabel aftMark3;
	private JLabel aftMark4;
	private JLabel aftMark5;
	private JLabel Rep1;
	private JLabel Rep2;
	private JLabel Rep3;
	private JLabel Rep4;
	private JLabel Rep5;
	private JLabel Rep6;
	private JLabel Rep7;
	private JLabel Rep8;
	private JLabel Rep9;
	private JLabel Rep10;
	private JLabel Rep11;
	private JLabel Rep12;
	private JLabel volcano;
	private JLabel gCord;
	private JLabel gCord2;
	private JLabel gCord3;
	private JLabel gCord4;
	private JLabel gCord5;
	private JLabel brav1;
	private JLabel brav2;
	private JLabel brav3;
	private JLabel brav4;
	private JLabel wuss1;
	private JLabel wuss2;
	private JLabel wuss3;
	private JLabel nexDes;
	private JLabel wormholee;
	private JTextField name;
	private JTextField pilot;
	private JTextField coord;
	private JTextField market;
	private JTextField engMop;
	private JTextField mopping;
	private JTextField contr;
	private JTextField JanDec;
	private JTextField marDes;
	private JTextField coord2;
	private JTextField Megoon;
	private JTextField coord3;
	public TextApp(){
		super("Star Adventure");
		setLayout(new FlowLayout());
		title = new JLabel("Star Adventure", SwingConstants.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 80));
		title.setForeground(new Color(46, 65, 89));
		add(title);
		vNum = new JLabel("version: 0.6");
		add(vNum);
		expo1 = new JLabel("You are floating through the stars in an escape pod, you look at your holo-display to see an old barge. "
				+ "As you go toward it you notice it has no garbage on it. "
				+ "While floating by, the ship drags you toward its bay doors. ");
		add(expo1);
		expo2 = new JLabel("Once you are in the ship, your pod is surrounded by people. You have seen their outfits before but can't place where they are from. "
				+ "You open your door to silence. These people are staring at you in shock. After you exit the pod, they wisk you away to the crew deck. " );
		add(expo2);
		expo3 = new JLabel("'Where are you from?', the captain says. You however, have no clue who you are or where you came from. "
				+ "As you look down, you notice you too have a familiar uniform, but it is different and has been wrecked. ");
		add(expo3);
		expo4 = new JLabel("'I don't know' you say. "
				+ "'Oh, they must have wiped your memory', he says,'Hi, I am Steven and I captain this ship, what do you want to be called?'");
		add(expo4);
		greet = new JLabel("'Hello, " + CharName + " welcome aboard the 'Tater' Steven says. "
				+ "Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar though it has been outfitted nicely with gadgets. "
				+ "You notice your systems from the pod are being added to the ships navigation systems and screen already. ");
		next = new JLabel("'Do you want to pilot?' Steven asks, what is your response?");
		pilotYes = new JLabel();
		Yee2 = new JLabel();
		Crct = new JLabel();
		Crct2 = new JLabel();
		Janitor = new JLabel();
		Janitor2 = new JLabel();
		Janitor3 = new JLabel();
		Janitor4 = new JLabel();
		slugs = new JLabel();
		mmop = new JLabel("You start to mop the floor, press m to mop");
		death = new JLabel("YOU DIED, THE END, THANK YOU FOR PLAYING");
		wrongMop = new JLabel();
		engPil = new JLabel();
		engSte = new JLabel("Steven runs down to the engine room where he sees you at the controls. 'What were you doing?' he yells at you, clearly angry. "
				+ "What do you say, 1: I was performing advanced maneuveres. or 2: I don't know. Please type either 1 or 2. ");
		OldJan = new JLabel();
		angSte = new JLabel();
		appSte = new JLabel();
		food = new JLabel();
		food2 = new JLabel("Eating the food that looks like cake, you realise some very important details, 1: this is 100% not cake. 2: this food tastes weird. "
				+ "It's as if it had been tainted with something rancid. you walk through an alleyway toward the ship, as you do so, you start to feel very dizzy");
		food3 = new JLabel("You turn around to see the cook and the server, the cook looks menacing and evil, the server is more remorseful and looks sad" 
				+ "Start to run but your legs can't keep up, you feel like you are running in molasses. You are halfway through the alley when the two catch up to you, ");
		kDeath = new JLabel("You can tell they are there becuase you see a ''Sharpened Candy Cane'' go through your chest. ");
		stuff1 = new JLabel();
		stuff2 = new JLabel("You spend 10 credits to get 5 bombs, you continue to walk through the market. "
		+ "You get to the middle of the market. Just as you do, five cloaked figures, each with a similar logo to the one you had, show up. ");
		stuff3 = new JLabel("Do you 1: throw your bombs at them. or 2: run away. ");
		bombs1 = new JLabel();
		bombs2 = new JLabel("And the next they were at the feet of some soldiers. "
		+ "Though you decided to run away before the explosion, you could still loudly hear the bombs go off. ");
		bombs3 = new JLabel("With the bombs going off, chaos began in the market. "
		+ "People were running, fighting and yelling. " 
				+ "You got lost in the crowd and almost ran into an officer but you luckily made your way back to the ship. ");
		run1 = new JLabel();
		run2 = new JLabel("They are nuch faster than you and are quickly on your tail. "
		+ "To get them off your case, you throw a bomb at them. ");
		run3 = new JLabel("This seems to work but only because they are getting killed. "
				+ "You finally make your way back to the ship without the figures. ");
		win = new JLabel("you win"); 
		aftMark = new JLabel("After the market fiasco, you fly away on your ship, during the downtime as you are flying to the planet Tolaron, you have the opportunity to ask questions about your situation. ");
		aftMark2 = new JLabel("'So, what happened before I arrived,' you ask, Steven pipes up, 'There is a war between the Federation and the Republic. The Federation is an oppressive organization that relies on withholding information.' ");
		aftMark3 = new JLabel("'The uniform you wore belonged to the federation, we assume something must have happened and you either were wiped of your memories and disposed of or there was an accident.' ");
		aftMark4 = new JLabel("'What matters is that they are very evil and have committed horrible acts of violence. We are working with the Republic. We distribute information where we go to get around the massive censorship taking place.' ");
		aftMark5 = new JLabel("'Speaking of which, we are going to Republic HQ as we speak.' Steven says, 'They will Catch you up more with what happened when we arrive.' The engines kick into high gear as the ship launches into hyperspeed. ");
		Rep1= new JLabel("As you arrive at Tolaron, you notice the features of the planet. It is comprised mainly of grassy hills and rivers. It is an easy place to hide a organization that is under siege. ");
		Rep2 =new JLabel("Hello " + CharName + "'It is a pleasure to meet you, I am commander Rayton.' you see a tall bulky woman who looks like shee invented the concept of boot camp. She is the commander of the Republics 'FootSoldier' division. Who fight specifically on a planet in vehicles or on foot. ");
		Rep3 = new JLabel("Commander Rayton leads you into the HeadQuarters, where she parts ways with you and your crew. As you keep walking, you stumble upon the boardroom. Where all major decisions take place, two old gruff men seem to be squabling but you can't tell what it's about. ");
		Rep4 = new JLabel("You continue down the round hallway to a row of offices, one says'Dayton Vasques: Information Manager.'. 'We are here,' says Steven, who seems a little on edge about this confrontation. ");
		Rep5 = new JLabel("Immediately as you walk in the door, you here someone yell 'Stevie!', You can only assume it is Dayton. 'How is my buddy doing?' asks Vasques who seems overjoyed that this group is here. ");
		Rep6 = new JLabel("'You know, Steve and I go way back.' Dayton says. His Brovado beats that of Steven, a feat you didn't know was possible. 'So, you got the intel?' Dayton asks. Steven pulls a small rectangle from his pocket. ");
		Rep7 = new JLabel("'Very Good...' says Dayton. inspecting the files. He copies it and transfers another file to the rectangle. 'I need you to distribute this tot the usual area' Dayton says. 'Y'all have a fun time out there. '");
		Rep8 = new JLabel("Steven looks demolished as you leave the room. 'One more place to go before we leave...' Steven says, trying to sound excited. though it is obvious he's not. ");
		Rep9 = new JLabel("You arrive at the room of the Duff. He supposedly leads the Republic though he rarely leaves his room. He is more of a pupet leader than an actual one. 'Hello, I'm so glad oyu could mae it' says duff. ");
		Rep10 = new JLabel("'I have a special mission for you,' Duff says. He's had reports that the Federation is trying to infiltrate the Republic and destroy the organization swiftly and without much consequence, so he wants you to investigate the Federation to see what they are doing. ");
		Rep11 = new JLabel("Steven gladly takes the opportunity and the paycheck for the job. As you head out, you wonder what happened before this and if you will ever find it out. but before you get lost in thought, you are in the cockpit ready to go. ");
		Rep12 = new JLabel("'we need to go to 685, 8642, 8958' Steven proclaims. ");
		volcano = new JLabel();
		gCord = new JLabel();
		gCord2 = new JLabel("when you land on the desert planet, you notice your approach was just off and you overshot the landing. On the second attempt, you stick it and can finally enter the town of Megoon. ");
		gCord3 = new JLabel("Megoon is a fairly civilised place, it has some technology and is far from a village in population. You keep walking through back alleys trying to find your destination. You finally see it so you give the guy the rectangle. ");
		gCord4 = new JLabel("The guy looks fairly shady but you assume that is what happens when you are trying to thwart the govenment. You are about to walk away when you hear a large explosion about a block away. ");
		gCord5 = new JLabel("do you 1: go to the action or 2: run back to the ship. ");
		wuss1 = new JLabel();
		wuss2 = new JLabel("You wait there for five hours but no one shows up. You decide to leave the ship to look for them. You find their bodies dead on the street. It seems they were in the battle and died. ");
		wuss3 = new JLabel("You blast back to the HQ. When you explain what happened to Duff. He becomes enraged, turns out his son was on the ship and he is blaming his death on you. He strangles you in that room. ");
		brav1 = new JLabel();
		brav2 = new JLabel("You see there is a large fight with vehicles being destroyed, and blaster fire is everywhere. You were never given a weapon so look around the roof. You find some bricks, because the fight is in a street. The Federation Officers are mostly stationary. ");
		brav3 = new JLabel("You line up your shot and hit the first Officer in the head. Due to the dense brick and the high speed. The Officer was decapitated. The other Officers are suddenly incredibly distracted by what just occured. They stop what they're doing and stare at the body and head, unsure what to do. ");
		brav4 = new JLabel("They are an easy target for you to knock out, one by one. With the threat successfully over, you and your crew continue with your business.");
		nexDes = new JLabel("Having completed your task. You war to your next destination. 756, 684, 9546 or the asteroid plane of JarGon-A535");
		wormholee = new JLabel();
		name = new JTextField(20);
		add(name);
		pilot = new JTextField(20);
		coord = new JTextField(20);
		market = new JTextField(20);
		mopping = new JTextField(20);
		engMop = new JTextField(20);
		contr = new JTextField(20);
		JanDec = new JTextField(20);
		marDes = new JTextField(20);
		coord2 = new JTextField(20);
		Megoon = new JTextField(20);
		coord3 = new JTextField(20);
		ActHand hand = new ActHand();
		name.addActionListener(hand);
		pilot.addActionListener(hand);
		coord.addActionListener(hand);
		market.addActionListener(hand);
		mopping.addActionListener(hand);
		engMop.addActionListener(hand);
		contr.addActionListener(hand);
		JanDec.addActionListener(hand);
		marDes.addActionListener(hand);
		coord2.addActionListener(hand);
		Megoon.addActionListener(hand);
		coord3.addActionListener(hand);
	}
	private class ActHand implements ActionListener {
		
	
		public void actionPerformed(ActionEvent e) {
			//done
			if (e.getSource()== name){
				CharName = name.getText();
				add(greet);
				greet.setText("'Hello, " + CharName + " welcome aboard the 'Tater' Steven says. "
						+ "Steven walks you throughout the 'Tater, it is a class 3 barge Ship that is built to fly under the radar though it has been outfitted nicely with gadgets. "
						+ "You notice your systems from the pod are being added to the ships navigation systems and screen already. ");
		
				name.setEditable(false);
				add(next);
				
				add(pilot);
			//done
			}else if(e.getSource()== pilot){
				pString = pilot.getText();
				//done
				if(pString.equals("yes")){
					add(pilotYes);
					pilotYes.setText("Steven walks you towards the cockpit, 'Try flying the ship', he says as he sits you at the primary controls. "
						+ "As soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
					add(Yee2);
					Yee2.setText("Steven asks you to pilot to coordinates '332, 564, 896'. type them in to warp to star harbour. ");
					add(coord);
					pilot.setEditable(false);
				// done
				}else {
					add(Janitor);
					Janitor.setText("'Well then', Steven says while walking you toward what looks to be a janitors closet"
							+ "Steven hands you a mop and a bucket, 'here you go, this is what you are going to do now' he says. " );
					add(Janitor2);
					Janitor2.setText("'I want you to start by mopping the washrooms' Steven says as he brings you to the ship's washroom. " 
							+ "The washrooms are absolutely filthy, 'this is where you will be cleaning today, I expect it to be in amazing condition by the time I come back'");
					add(mmop);
					add(mopping);
					pilot.setEditable(false);
				}
			//done
			}else if(e.getSource()==coord) {
			
				String cString = coord.getText();
				if(cString.equals("332, 564, 896")){
					add(Crct);
					add(Crct2);
					Crct.setText("You successfully entered the coordinates and landed safely at star harbour. "
							+ "Getting out of the barge, you see the city of star harbour. It is a bustling trade city with few tall buildings and mostly small shacks where people buy and sell anything");
					Crct2.setText("It looks like a market on a much larger scale. " 
							+ "Do you go to the food or the items");
					add(market);
					coord.setEditable(false);
				}else{
					add(slugs);
					slugs.setText("You entered the wrong coordinates and crashed into a planet wher you were eaten by slugs. ");
					add(death);

					coord.setEditable(false);
				
				}
			// done
			}else if(e.getSource()== market){
				String mString = market.getText();
				if (mString.equals("food")){
					add(food);
					food.setText("Due to your busy and active day, you are really hungry, but you don't recognize anything that is being sold here. "
							+ "You finally spot something that looks appetizing, you give the server the 5 credits for it, he looks uneasy, as if something is up, but he goes back to normal before you can ask questions");
					add(food2);
					add(food3);
					add(kDeath);
					add(death);
					market.setEnabled(false);
				}else{
					add(stuff1);
					stuff1.setText("Walking through the market, you spot a guy selling bombs. At just 2 credits a piece, they are a steal. ");
					add(stuff2);
					add(stuff3);
					add(marDes);

					market.setEnabled(false);
					
				}
			// done
			}else if(e.getSource()==mopping){
				String Mopper = mopping.getText();
				if(Mopper.equals("m")){
					add(Janitor3);
					Janitor3.setText("Steven comes back,'oh good, i am so glad you finished, now i need you to go to the engine room'"
							+ "You go down to the engine room, the floor is covered in grease, press m to mop");
					add(engMop);
					mopping.setEditable(false);
						
				}else{
				
					add(wrongMop);
					wrongMop.setText("You died of stupidity for not pressing m");
					add(death);

					mopping.setEditable(false);
				}
				//done
			}else if(e.getSource()==engMop){
				String engMopper = engMop.getText();
				if(engMopper.equals("m")){
				add(Janitor4);
				Janitor4.setText("As you finish, you see a control panel with what look like ship controls, do you want to use them?");
				add(contr);
;					engMop.setEditable(false);
				}else{
					add(wrongMop);
					wrongMop.setText("You died of stupidity for not pressing m");
					add(death);

					contr.setEditable(false);
				}	
			}else if(e.getSource()==contr){
				String cString = contr.getText();
				if (cString.equals("yes")){
					add(engPil);
					engPil.setText("You take control of the ship from the engine room, you seemingly feel like you have done this before. "
							+"You perform multiple acrobatic loops in the air and finally roll the ship a few times. ");
					add(engSte);
					add(JanDec);
					contr.setEditable(false);
				}else{
					
					add(OldJan);
					OldJan.setText("You keep being a janitor for the next 50 years. Then you die. ");
					add(death);

					contr.setEditable(false);
				}
				
			}else if(e.getSource()==JanDec) {
				String jString = JanDec.getText();
				if(jString.equals("1")){
					add(appSte);
					appSte.setText("Clearly shocked, Steven says'come with me to the cockpit.'");
					add(pilotYes);
					pilotYes.setText("Steven walks you towards the cockpit, 'Try flying the ship', he says as he sits you at the primary controls. "
						+ "As soon as you sit in the chair, your memories come back to you, you immediately pick up the speed and do acrobatic maneuveres in the barge");
					add(Yee2);
					Yee2.setText("Steven asks you to pilot to coordinates '332, 564, 896'. type them in to warp to star harbour. ");
					add(coord);
					JanDec.setEditable(false);
				}else{
					add(angSte);
					angSte.setText("Steven, clearly angry, throws you out of the ship and into open space where you die. ");
					add(death);

					JanDec.setEditable(false);
				}
				
			}else if(e.getSource()== marDes){
				String mString = marDes.getText();
				if(mString.equals("1")){
					add(bombs1);
					bombs1.setText("It all happened so fast, one moment you had the bombs in your hands. ");
					add(bombs2);
					add(bombs3);
					add(aftMark);
					add(aftMark2);
					add(aftMark3);
					add(aftMark4);
					add(aftMark5);
					add(Rep1);
					add(Rep2);
					add(Rep3);
					add(Rep4);
					add(Rep5);
					add(Rep6);
					add(Rep7);
					add(Rep8);
					add(Rep9);
					add(Rep10);
					add(Rep11);
					add(Rep12);
					add(coord2);
					marDes.setEditable(false);
				
				}else{
					add(run1);
					run1.setText("The figures notice you immediately and start running towards you. ");
					add(run2);
					add(run3);
					add(aftMark);
					add(aftMark2);
					add(aftMark3);
					add(aftMark4);
					add(aftMark5);
					add(Rep1);
					add(Rep2);
					add(Rep3);
					add(Rep4);
					add(Rep5);
					add(Rep6);
					add(Rep7);
					add(Rep8);
					add(Rep9);
					add(Rep10);

					add(Rep11);
					add(Rep12);
					add(coord2);
					marDes.setEditable(false);
				}
				
			}else if(e.getSource()==coord2){
				String cString = coord2.getText();
				if(cString.equals("685, 8642, 8958")){
					add(gCord);
					gCord.setText("You are heading toward Megoon. A small city on the sandy land of 65-137. While there. You will distribute the new information to several individuals. ");
					add(gCord2);
					add(gCord3);
					add(gCord4);
					add(gCord5);
					add(Megoon);					
				}else{
					add(volcano);
					volcano.setText("When you set your coordinates you feel like you did something wrong. What you did wrong was warp into an active volcano on a lava covered planet. ");
					add(death);
				}
			}else if(e.getSource()==Megoon){
				String mString = Megoon.getText();
				if(mString.equals("1")){
					add(brav1);
					brav1.setText("You can't quite pin point the location so you run up onto the roof to get a better view. There yuo come upon the battle. ");
					add(brav2);
					add(brav3);
					add(brav4);
					add(nexDes);
					add(coord3);
					Megoon.setEditable(false);
				}else{
					add(wuss1);
					wuss1.setText("You quickly run back back to the ship so you don't join the fight. You hope the crew avoided the fight but you aren't sure. after a while the noise dies down and you believe the fight is over. ");
					add(wuss2);
					add(wuss3);
					add(death);
					Megoon.setEditable(false);
				}
			}else if(e.getSource()== coord3){
				String cString = coord3.getText();
				if(cString.equals("756, 684, 9546")){
					
				}else{
					add(wormholee);
					wormholee.setText("You unfortunately entered the wrong coordinates and wound up entering worm hole to a planet of fiery slugs which burnt and ate you at the same time.");
					add(death);
				}
			}
		}
	}
}