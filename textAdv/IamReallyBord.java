package stableProg;

import java.util.Scanner;
public class Calculate {

	public static void main(String[] args){

		//create two scanners for numbers and operators
		Scanner sc = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		//instructions and get the first number
		System.out.println("Multiply by zero to end.");

		System.out.println("Enter your first number.");
		//declare all variables used in muliple spots
		double fNum = sc.nextInt();
		String resp = "yes";
		double partB;
		double sideB;
		double sideC;
		double AngleC;
		double M;
		double B;
		double Y;
		double X;
		double H;
		String quit ="o";
		//lets multiple calculations occur
		while(resp.contains("es")){
			//creates loop to continue calculations
			while(fNum!=0){

				//new number choice in case input was wrong
				System.out.println("Do you want a new number?");
				String Dec = in.nextLine();
				if(Dec.contains("es")){
					System.out.println("Enter your number.");
					fNum=sc.nextDouble();
				}

				//gives the user options for operators
				System.out.println("Enter the operator, *,/,%,+,-,Sqr,Sqrt,^x/y,1/x,sin,cos,tan,cosLaw,sinLaw");
				System.out.println("rad/Deg,cos^-1,sin^-1,tan^-1,graph, circles, science");
				String op1 = in.nextLine();

				//switch statement for each operator   
				switch(op1){
				//each gets a new number and does calculations
				case "+":
					System.out.println("Enter your next number.");
					double sNum = sc.nextInt();
					System.out.println(fNum+sNum);
					fNum+=sNum;
					break;

				case "-":
					System.out.println("Enter your next number.");
					sNum = sc.nextInt();
					System.out.println(fNum-sNum);
					fNum-=sNum;
					break;

				case "*":
					System.out.println("Enter your next number.");
					sNum = sc.nextInt();
					System.out.println(fNum*sNum);
					fNum*=sNum;
					break;

				case "/":
					System.out.println("Enter your next number.");
					sNum = sc.nextInt();
					System.out.println(fNum/sNum);
					fNum/=sNum;
					break;

				case "%":
					System.out.println("Enter your next number.");
					sNum = sc.nextInt();
					System.out.println(fNum%sNum);
					fNum%=sNum;
					break;

				case "Sqr":
					System.out.println("Enter your next number.");
					sNum = sc.nextInt();
					//multiplies the first number by the number provided
					System.out.println(Math.pow(fNum,sNum));
					fNum=Math.pow(fNum,sNum);
					break;

				case "Sqrt":
					System.out.println(Math.sqrt(fNum));
					fNum= Math.sqrt(fNum);
					break;

				case "^x/y":
					//lets the user square whatever they want
					System.out.println("Enter the numerator.");
					double x = sc.nextDouble();
					System.out.println("Enter the denomenator.");
					double y = sc.nextDouble();
					fNum = Math.pow(fNum,(x/y));
					System.out.println(fNum); 
					break;

				case "1/x":
					fNum = 1/fNum;
					System.out.println(fNum);
					break;

				case "sin":
					double radn = Math.toRadians(fNum);
					fNum = Math.sin(radn);
					System.out.println(fNum);                 
					break;

				case "cos":
					double cosn = Math.toRadians(fNum);
					fNum = Math.cos(cosn);
					System.out.println(fNum);
					break;

				case "tan":
					double tang = Math.toRadians(fNum);
					fNum = Math.tan(tang);
					System.out.println(fNum);
					break;

				case "sinLaw":
					System.out.println("Enter the corresponding angle to the length you just entered in degrees.");
					double AngleA = sc.nextDouble();
					double partA = fNum/(Math.sin(Math.toRadians(AngleA)));
					System.out.println("Which do you have, 1 for Angle or 2 for length");
					int BHas = sc.nextInt();
					//if side length is needed
					if(BHas == 1){
						System.out.println("Enter the angle measure.");
						double AB = sc.nextDouble();

						partB = partA*(Math.sin(Math.toRadians(AB)));
						System.out.println("The side length is " + partB);
						//if angle measure is needed
					}else{
						System.out.println("Enter the next side length,");
						double LB = sc.nextDouble();
						//i trial and errored this i can't really tell you what this is doing but it works
						//something like arcsin of length B * sine AngleA in radians over the first number
						partB = Math.asin((LB*Math.sin(Math.toRadians(AngleA)))/fNum);

						System.out.println("The the angle is " + Math.toDegrees(partB));
					}
					break;

				case "cosLaw":
					double sideA = fNum;
					//distinguishes between both equations
					System.out.println("do you know all sides?.1 for yes 2 for no");
					int sides = sc.nextInt();
					if(sides==1){
						System.out.println("enter another side");
						sideB = sc.nextDouble();

						System.out.println("enter the final side");
						sideC = sc.nextDouble();
						//does the equation
						AngleC=Math.acos((sideB*sideB+sideA*sideA-sideC*sideC)/(2*sideA*sideB));

						double APOW =Math.toDegrees(AngleC);
						System.out.println(APOW);
					}else{
						System.out.println("enter another side");
						sideB = sc.nextDouble();

						System.out.println("enter the Angle you know");
						AngleC = sc.nextDouble();
						double CPOW;
						CPOW=(sideB*sideB + sideA*sideA)-(2*(sideA*sideB)*Math.cos(Math.toRadians(AngleC)));
						sideC=Math.sqrt(CPOW);
						System.out.println(sideC);

					}

					break;
				case "rad/Deg":
					//switches between radians and degrees
					System.out.println("1.Radian to degrees or2. Degrees to Radians?");
					int RD = sc.nextInt();
					if(RD==1){
						System.out.println(Math.toDegrees(fNum));
					}else{
						System.out.println(Math.toRadians(fNum));
					}
					break;

				case "sin^-1":
					//sine inverse
					System.out.println("enter a second number");
					sNum = sc.nextDouble();
					fNum = Math.asin((fNum/sNum));
					System.out.println(Math.toDegrees(fNum));
					break;

				case "cos^-1":
					//cos inverse
					System.out.println("enter a second number");
					sNum = sc.nextDouble();
					fNum = Math.acos((fNum/sNum));
					System.out.println(Math.toDegrees(fNum));
					break;

				case "tan^-1":
					//tan inverse
					System.out.println("enter a second number");
					sNum = sc.nextDouble();
					fNum = Math.atan((fNum/sNum));
					System.out.println(Math.toDegrees(fNum));
					break;

				case "graph":
					//makes sure the user can use it fully
					quit ="o";
					//distinguishes between x and x^2
					System.out.println("1.Linear or 2.Parabola?");
					int type = sc.nextInt();
					if(type==1){
						System.out.println("Enter the slope");
						M = sc.nextDouble();

						System.out.println("Enter the y-intercept");
						B = sc.nextDouble();
						//equation completed
						while(quit.contains("o")){
							//give a y for each x
							System.out.println("enter an x value.");
							X = sc.nextDouble();
							Y = (M*X)+B;
							System.out.println(Y);
							//asks the user if they want to quit
							System.out.println("Quit?");
							quit = in.nextLine();
						}
					}else{
						//same thing but with parabolas
						System.out.println("Enter the slope");
						M = sc.nextDouble();

						System.out.println("Enter the y-intercept");
						B = sc.nextDouble();
						System.out.println("Enter the x-intercept");
						H = sc.nextDouble();
						while(quit.contains("o")){
							System.out.println("enter an x value.");
							X = sc.nextDouble();
							Y = M*(Math.pow((X-H),2))+B;
							System.out.println(Y);
							System.out.println("Quit?");
							quit = in.nextLine();
						}

					}
					break;

				case "circles":
					//gets a radius
					System.out.println("Enter a radius.");
					double Rad = sc.nextDouble();
					//three different things to do with the radius
					System.out.println("1.area 2.circumference 3. diameter");
					int use = sc.nextInt();
					//area
					if(use == 1){
						double Area = Math.PI*Math.pow(Rad, 2);
						System.out.println(Area);
						//circumference
					}else if(use ==2){
						double Circ = Math.PI*(2*Rad);
						System.out.println(Circ);
						//diameter
					}else{
						System.out.println(2*Rad);
					}
					break;

				case "science":
					//scientific notation
					System.out.println("Enter a number.");
					//gets giant number
					float BigNum = sc.nextFloat();
					System.out.println("what power do you want?");
					//finds what 10^x is
					int tenPow = sc.nextInt();
					long Over = 1;
					//multiplies 1 by ten power number of times to get what 10^x should be
					if(tenPow>=1){
						for(int i = 1; i<tenPow;i++){
							Over*=10;
						}
						//if 10^-1
					}else{
				s		for(int i = 0; i>tenPow;i--){
							Over/=10;
						}
					}
					//tells the user the result
					System.out.println(BigNum/Over+" x 10^"+tenPow);
					break;
					//if the user messes up
				default:
					System.out.println("I didn't quite catch that. try again.");
					break;
				}
			}
			//lets user exit the program
			System.out.println("Do you want to continue?");
			resp = in.nextLine();
		}
	}  
}