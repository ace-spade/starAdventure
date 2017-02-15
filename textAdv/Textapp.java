//version 0.2
import java.util.Scanner;
public class Textapp{

	static Scanner sc = new Scanner(System.in);
	static String Open = "You are in a forest, there is a path leading to a castle going east. Where do you go (n for north, e for east, w for west, s for south).";
	static String Rm_Ex = "You Cannot Go there. Your path is blocked";
	static int riv = 0;
	static int ToD = 0;
	static String[] DayTime = {"The sun has risen.","It is noon.","The sun is setting.","The moon is out."};
	static boolean run = true;
	public static void main(String[] args){
		Rm0();
	}
	public static void Rm0(){
		run = true;
		
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
	public static void Rm1(){
		riv = 1;
		System.out.println("The path leads to a river, you find a small hatchet and put it int your pocket. Where do you go?");
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
	public static void Rm2(){
		System.out.println("You continue along the path. " + DayTime[ToD]+ " Where do you go?");
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
	public static void Rm3(){}
	
	
}	