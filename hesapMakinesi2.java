import java.util.Scanner;
public class hesapMakinesi2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		String operator;
		
		System.out.print("1.Sayı: ");
		num1 = scan.nextInt();
		System.out.print("2.Sayı: ");
		num2 = scan.nextInt();

		System.out.print("+\n-\n*\n/\n**\nOperatoru sec:");
		operator = scan.next();
		
		switch(operator) {
		case "+":
			int total = num1 + num2;
			System.out.println(num1 + " + "  + num2 + " = " + total);
			break;
			
		case "-":
		int total2 = num1 - num2;
		System.out.println(num1 + " - "  + num2 + " = " + total2);
		break;
		
		case "*":
			int total3 = num1 * num2;
			System.out.println(num1 + " * "  + num2 + " = " + total3);
			break;
			
		case "/":
		int total4 = num1 / num2;
		System.out.println(num1 + " / "  + num2 + " = " + total4);
		break;
		
		case "**":
			int total5 = (int) Math.pow(num1, num2);
			System.out.println(num1 + " ** "  + num2 + " = " + total5);
			break;
		default: 
		System.out.println("sef operator secimi");
		}

	}

}
