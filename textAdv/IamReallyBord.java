package textBasedCode;

import java.util.Scanner;

public class IamReallyBord {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in); 
		Scanner in = new Scanner(System.in);
		int calcnum1;
		int calcnum2;
		int calcnum3;

		System.out.println("enter a number");
		int num1 = sc.nextInt();
		System.out.println("what is the operator");
		String op2 = in.nextLine();
		System.out.println("enter another number");
		int num2 = sc.nextInt();

		if(op2.equals("+")){
			calcnum1 = num1 + num2;
			//level 2
			System.out.println("what is the operator");
			String op3 = in.nextLine();
			System.out.println("enter another number");
			int num3 = sc.nextInt();
			if(op3.equals("+")){
				calcnum2 = calcnum1 + num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("-")){
				calcnum2 = calcnum1 - num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("*")){
				calcnum2 = calcnum1 * num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("/")){
				calcnum2 = calcnum1 / num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}
		}else if(op2.equals("-")){
			calcnum1 = num1 - num2;
			//level 2
			System.out.println("what is the operator");
			String op3 = in.nextLine();
			System.out.println("enter another number");
			int num3 = sc.nextInt();
			if(op3.equals("+")){
				calcnum2 = calcnum1 + num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("-")){
				calcnum2 = calcnum1 - num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("*")){
				calcnum2 = calcnum1 * num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("/")){
				calcnum2 = calcnum1 / num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}
		}else if(op2.equals("*")){
			calcnum1 = num1 * num2;
			//level 2
			System.out.println("what is the operator");
			String op3 = in.nextLine();
			System.out.println("enter another number");
			int num3 = sc.nextInt();
			if(op3.equals("+")){
				calcnum2 = calcnum1 + num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("-")){
				calcnum2 = calcnum1 - num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("*")){
				calcnum2 = calcnum1 * num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("/")){
				calcnum2 = calcnum1 / num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}
		}else if(op2.equals("/")){
			calcnum1 = num1 / num2;
			//level 2
			System.out.println("what is the operator");
			String op3 = in.nextLine();
			System.out.println("enter another number");
			int num3 = sc.nextInt();
			if(op3.equals("+")){
				calcnum2 = calcnum1 + num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("-")){
				calcnum2 = calcnum1 - num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("*")){
				calcnum2 = calcnum1 * num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}else if(op3.equals("/")){
				calcnum2 = calcnum1 / num3;
				//level 3
				System.out.println("what is the operator");
				String op4 = in.nextLine();
				System.out.println("enter another number");
				int num4 = sc.nextInt();
				if(op4.equals("+")){
					calcnum3 = calcnum2 + num4;
					System.out.println(calcnum3);
				}else if(op4.equals("-")){
					calcnum3 = calcnum2 - num4;
					System.out.println(calcnum3);
				}else if(op4.equals("*")){
					calcnum3 = calcnum2 * num4;
					System.out.println(calcnum3);
				}else if(op4.equals("/")){
					calcnum3 = calcnum2 / num4;
					System.out.println(calcnum3);
				}
			}
		}
		
		

	} 
}
